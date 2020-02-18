package midi;

import static org.junit.Assert.fail;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiDevice.Info;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.ShortMessage;

import org.junit.Test;

public class MidiManagerTest {

	@Test
	public void testSendMessage() throws MidiUnavailableException, InvalidMidiDataException {
		Info[] deviceInfo = MidiSystem.getMidiDeviceInfo();

		ShortMessage message = new ShortMessage();
		message.setMessage(ShortMessage.NOTE_ON, 0, 60, 93);

		MidiManager.send(message);
		fail("Not yet implemented");
	}

}
