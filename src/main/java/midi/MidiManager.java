package midi;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiMessage;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Receiver;
import javax.sound.midi.Transmitter;

/**
 * TC: 00H 20H 1FH
 * 
 * Behringer: 00H 20H 32H
 * 
 * Line6: 00H 01H 0CH
 * 
 * @author frank
 *
 */
public class MidiManager {

	private static final long TIME_OUT_IN_MS = 9000;
	private static boolean CSMstate = false;
	private static MidiDevice unoOutDevice;
	private static MidiDevice unoInDevice;

	public MidiManager() throws MidiUnavailableException {
	}

	public static boolean getUnoOutDevice() {
		if (unoOutDevice != null)
			return true;
		MidiDevice.Info[] infos = MidiSystem.getMidiDeviceInfo();
		for (MidiDevice.Info info : infos) {
			if (info.getName().equals("USB Uno MIDI Interface")) {
				try {
					MidiDevice device = MidiSystem.getMidiDevice(info);
					String n = info.getClass().getCanonicalName();
					if (n.endsWith("MidiOutDeviceInfo"))
						unoOutDevice = device;
				} catch (MidiUnavailableException e) {
					return false;
				}
			}
		}
		return false;
	}

	public static boolean getUnoInDevice() {
		if (unoInDevice != null)
			return true;
		MidiDevice.Info[] infos = MidiSystem.getMidiDeviceInfo();
		for (MidiDevice.Info info : infos) {
			if (info.getName().equals("USB Uno MIDI Interface")) {
				try {
					MidiDevice device = MidiSystem.getMidiDevice(info);
					String n = info.getClass().getCanonicalName();
					if (n.endsWith("MidiInDeviceInfo")) {
						unoInDevice = device;
						return true;
					}
				} catch (MidiUnavailableException e) {
					return false;
				}
			}
		}
		return false;
	}

	/**
	 * Send a <code>MidiMessage</code>. Whole message is passed to lower MIDI
	 * driver.
	 * 
	 * @param rcv MIDI Receiver
	 * @param msg MIDI Message
	 * @throws MidiUnavailableException
	 * @throws InvalidMidiDataException
	 */
	public static void send(Receiver rcv, MidiMessage msg) throws MidiUnavailableException, InvalidMidiDataException {
		rcv.send(msg, -1);
	}

	public static void send(MidiMessage msg) throws MidiUnavailableException, InvalidMidiDataException {
		if (getUnoOutDevice()) {
			unoOutDevice.open();
			Receiver receiver = unoOutDevice.getReceiver();
			send(receiver, msg);
			unoOutDevice.close();
		}
	}

	public static int receiveOneProgramChange() throws MidiUnavailableException, InvalidMidiDataException {
		MyReceiver myReceiver = new MyReceiver();
		boolean timeOut = false;
		long startTime = System.currentTimeMillis();
		if (getUnoInDevice()) {
			unoInDevice.close();
			if (!unoInDevice.isOpen())
				unoInDevice.open();
			Transmitter transmitter = unoInDevice.getTransmitter();
			transmitter.setReceiver(myReceiver);
			while ((myReceiver.getProgram() == -1) && (!timeOut)) {
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					// TODO: handle exception
				}
				timeOut = (System.currentTimeMillis() - startTime) > TIME_OUT_IN_MS;
			}
			transmitter.close();
			unoInDevice.close();
			return myReceiver.getProgram();
		}
		return -1;
	}

	public static byte[] receiveOneSysEx()
			throws MidiUnavailableException, InvalidMidiDataException, InterruptedException {
		MyReceiver myReceiver = new MyReceiver();
		boolean timeOut = false;
		long startTime = System.currentTimeMillis();
		if (getUnoInDevice()) {
			unoInDevice.close();
			unoInDevice.open();
			Transmitter transmitter = unoInDevice.getTransmitter();
			transmitter.setReceiver(myReceiver);
//
//			getUnoOutDevice();
//			unoOutDevice.open();
//			byte[] sysExSend = { (byte) SysexMessage.SPECIAL_SYSTEM_EXCLUSIVE };
//			unoOutDevice.getReceiver().send(new SysexMessage(sysExSend, 1), 0);
//			unoOutDevice.close();

			while ((!myReceiver.sysExContentReceived()) && (!timeOut)) {
				Thread.sleep(1000);
				timeOut = (System.currentTimeMillis() - startTime) > TIME_OUT_IN_MS;
			}
			transmitter.close();
			unoInDevice.close();
			return myReceiver.getSysExContent();
		}
		return new byte[] { 0x10 };
	}

	public static void close() {
		if (unoInDevice != null)
			unoInDevice.close();
		if (unoOutDevice != null)
			unoOutDevice.close();
	}

//	/**
//	 * Send a <code>MidiMessage</code>. A Sysex Message is divided into several
//	 * Sysex Messages whose size is <code>bufSize</code>.
//	 * 
//	 * @param rcv     MIDI Receiver
//	 * @param msg     MIDI Message
//	 * @param bufSize MIDI message size. If zero, whole MIDI message is passed to
//	 *                lower MIDI driver.
//	 * @param delay   delay (msec) after every MIDI message transfer.
//	 * @throws MidiUnavailableException
//	 * @throws InvalidMidiDataException
//	 */
//	public static void send(Receiver rcv, MidiMessage msg, int bufSize, int delay)
//			throws MidiUnavailableException, InvalidMidiDataException {
//		int size = msg.getLength();
//
//		if (bufSize == 0 || size <= bufSize) {
//			rcv.send(msg, -1);
//			log("XMIT: ", msg);
//		} else {
//			// divide large System Exclusive Message into multiple
//			// small messages.
//			byte[] sysex = msg.getMessage();
//			byte[] tmpArray = new byte[bufSize + 1];
//			for (int i = 0; size > 0; i += bufSize, size -= bufSize) {
//				int s = Math.min(size, bufSize);
//
//				if (i == 0) {
//					System.arraycopy(sysex, i, tmpArray, 0, s);
//					((SysexMessage) msg).setMessage(tmpArray, s);
//				} else {
//					tmpArray[0] = (byte) SysexMessage.SPECIAL_SYSTEM_EXCLUSIVE;
//					System.arraycopy(sysex, i, tmpArray, 1, s);
//					((SysexMessage) msg).setMessage(tmpArray, ++s);
//				}
//				rcv.send(msg, -1);
//				log("XMIT: ", msg);
//				try {
//					Thread.sleep(delay);
//				} catch (Exception e) {
//					// do nothing
//				}
//			}
//		}
//	}
//
//	/**
//	 * Output string to MIDI Monitor Window.
//	 *
//	 * @param s string to be output
//	 */
//	public static void log(String s) {
//		Actions.midiMonitorLog(s);
//	}
//
//	public static void log(String str, MidiMessage msg) {
//		try {
//			log(str + midiMessageToString(msg) + "\n");
//		} catch (InvalidMidiDataException e) {
//			log("InvalidMidiDataException: " + msg + "\n");
//		}
//	}
//
//	private static void log(int port, String dir, byte[] sysex, int length) {
//		if (CSMstate) {
//			log("Port: " + port + dir + length + " bytes :\n  " + Utility.hexDump(sysex, 0, length, 16) + "\n");
//		} else {
//			log("Port: " + port + dir + length + " bytes :\n  " + Utility.hexDumpOneLine(sysex, 0, length, 16) + "\n");
//		}
//	}
//
//	/**
//	 * get Sysex Message from MIDI input queue.
//	 * 
//	 * @see #getInputMidiDeviceInfo()
//	 * @see #clearSysexInputQueue
//	 */
//	static MidiMessage getMessage(int port, long timeout) throws MidiUtil.TimeoutException, InvalidMidiDataException {
//		return sysexInputQueue[port].getMessage(timeout);
//	}
//
//	/**
//	 * convert <code>MidiMessage</code> into a string.
//	 *
//	 * @param m a <code>MidiMessage</code> value
//	 * @return a <code>String</code> value
//	 */
//	public static String midiMessageToString(MidiMessage m) throws InvalidMidiDataException {
//		if (m instanceof ShortMessage)
//			return (statusString(m) + "\n  " + shortMessageToString((ShortMessage) m));
//		else if (m instanceof SysexMessage) {
//			if (CSMstate) {
//				return ("SysEX:length=" + m.getLength() + "\n  " + sysexMessageToString((SysexMessage) m, 16));
//			} else {
//				return ("SysEX:length=" + m.getLength() + "\n  " + sysexMessageToString((SysexMessage) m));
//			}
//		} else
//			throw new InvalidMidiDataException();
//	}
//
//	/**
//	 * Return a <code>String</code> of the name of status byte of a
//	 * <code>MidiMessage</code>.
//	 *
//	 * @param m a <code>MidiMessage</code> value
//	 * @return a <code>String</code> value
//	 * @exception InvalidMidiDataException if an error occurs
//	 */
//	public static String statusString(MidiMessage m) throws InvalidMidiDataException {
//		int c = m.getStatus();
//		switch (c < 0xf0 ? c & 0xf0 : c) {
//		case 0x80:
//			return "Note Off";
//		case 0x90:
//			return "Note On";
//		case 0xa0:
//			return "Poly Pressure";
//		case 0xb0:
//			return "Control Change";
//		case 0xc0:
//			return "Program Change";
//		case 0xd0:
//			return "Channel Pressure";
//		case 0xe0:
//			return "Pitch Bend";
//		case 0xf0:
//			return "System Exclusive";
//		case 0xf1:
//			return "MIDI Time Code";
//		case 0xf2:
//			return "Song Position Pointer";
//		case 0xf3:
//			return "Song Select";
//		case 0xf4:
//			return "Undefined";
//		case 0xf5:
//			return "Undefined";
//		case 0xf6:
//			return "Tune Request";
//		// case 0xf7: return "End of System Exclusive";
//		case 0xf7:
//			return "Special System Exclusive";
//		case 0xf8:
//			return "Timing Clock";
//		case 0xf9:
//			return "Undefined";
//		case 0xfa:
//			return "Start";
//		case 0xfb:
//			return "Continue";
//		case 0xfc:
//			return "Stop";
//		case 0xfd:
//			return "Undefined";
//		case 0xfe:
//			return "Active Sensing";
//		case 0xff:
//			return "System Reset";
//		default:
//			throw new InvalidMidiDataException();
//		}
//	}
//
//	/**
//	 * Convert <code>ShortMessage</code> into a hexa-dump string.
//	 *
//	 * @param m a <code>ShortMessage</code> value
//	 * @return a <code>String</code> value
//	 * @exception InvalidMidiDataException if an error occurs
//	 */
//	public static String shortMessageToString(ShortMessage m) throws InvalidMidiDataException {
//		int c = m.getStatus();
//		switch (c < 0xf0 ? c & 0xf0 : c) {
//		case 0x80:
//		case 0x90:
//		case 0xa0:
//		case 0xb0:
//		case 0xe0:
//		case 0xf2:
//			return (hex(c) + " " + hex(m.getData1()) + " " + hex(m.getData2()));
//		case 0xc0:
//		case 0xd0:
//		case 0xf1:
//		case 0xf3:
//			return (hex(c) + " " + hex(m.getData1()));
//		case 0xf4:
//		case 0xf5:
//		case 0xf6:
//		case 0xf7:
//		case 0xf8:
//		case 0xf9:
//		case 0xfa:
//		case 0xfb:
//		case 0xfc:
//		case 0xfd:
//		case 0xfe:
//		case 0xff:
//			return (hex(c));
//		default:
//			throw new InvalidMidiDataException();
//		}
//	}
//
//	/**
//	 * Convert <code>SysexMessage</code> into a hexa-dump string.
//	 *
//	 * @param m     a <code>SysexMessage</code> value
//	 * @param bytes number of bytes per line. If equal or less than 0, no newlines
//	 *              are inserted.
//	 * @return a <code>String</code> value
//	 */
//	public static String sysexMessageToString(SysexMessage m, int bytes) {
//		byte[] d = m.getMessage();
//		return Utility.hexDump(d, 0, -1, bytes);
//	}
//
//	/**
//	 * Convert <code>SysexMessage</code> into a hexa-dump string. If the length is
//	 * longer than 16bytes, bytes of middle of the array are not ignored.
//	 *
//	 * @param m a <code>SysexMessage</code> value
//	 * @return a <code>String</code> value
//	 * @exception InvalidMidiDataException if an error occurs
//	 */
//	public static String sysexMessageToString(SysexMessage m) throws InvalidMidiDataException {
//		byte[] d = m.getMessage();
//		return Utility.hexDumpOneLine(d, 0, -1, 16);
//	}
//}

}
