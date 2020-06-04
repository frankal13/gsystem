package connection;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.ShortMessage;

public class FCB1010 {

	public void sendBankProgram(FCB10BankProgram bankProgram)
			throws InvalidMidiDataException, MidiUnavailableException {
		ShortMessage message = new ShortMessage();
		message.setMessage(ShortMessage.PROGRAM_CHANGE, bankProgram.getBank(), bankProgram.getProgram());
		MidiManager.send(message);

	}

	public FCB10BankProgram receiveBankProgram() throws MidiUnavailableException, InvalidMidiDataException {
		int program = MidiManager.receiveOneProgramChange();
		MidiManager.close();
		return new FCB10BankProgram(program);
	}

	public byte[] receiveSysEx() throws MidiUnavailableException, InvalidMidiDataException, InterruptedException {
		byte[] sysex = MidiManager.receiveOneSysEx();
		MidiManager.close();
		return sysex;
	}

}
