package connection;

import javax.sound.midi.MidiMessage;
import javax.sound.midi.Receiver;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.SysexMessage;

public class MyReceiver implements Receiver {

	private int lastProgram;
	private byte[] sysExContent;
	private boolean sysExContentReceived;
	private int maxSysExMessages;

	public MyReceiver() {
		this.lastProgram = -1;
		this.sysExContent = null;
		this.sysExContentReceived = false;
		this.maxSysExMessages = 4;
	}

	public void close() {
		// TODO Auto-generated method stub

	}

	public void send(MidiMessage message, long timeStamp) {
		if (message.getStatus() == ShortMessage.PROGRAM_CHANGE) {
			byte[] bytes = message.getMessage();
			lastProgram = bytes[1];
			return;
		}
		if (message.getStatus() == SysexMessage.SYSTEM_EXCLUSIVE) {
			sysExContent = message.getMessage();
			sysExContentReceived = (sysExContent[sysExContent.length - 1] == 0xf7);
			return;
		}
		if (!sysExContentReceived && (message.getStatus() == SysexMessage.SPECIAL_SYSTEM_EXCLUSIVE)) {
			byte[] content = message.getMessage();
			if ((content == null) || (content.length == 0) || (sysExContent == null)) {
				sysExContentReceived = true;
				return;
			}
			byte[] copy = new byte[sysExContent.length + content.length];
			int offset = sysExContent.length;
			for (int i = 0; i < offset; i++) {
				copy[i] = sysExContent[i];
			}

			for (int i = 0; i < content.length; i++) {
				copy[i + offset] = content[i];
			}
			sysExContent = copy;
			sysExContentReceived = (content[content.length - 1] == SysexMessage.SPECIAL_SYSTEM_EXCLUSIVE);

		}

	}

	public int getProgram() {
		return lastProgram;
	}

	public byte[] getSysExContent() {
		return sysExContent;
	}

	public boolean sysExContentReceived() {
		return sysExContentReceived;
	}

}
