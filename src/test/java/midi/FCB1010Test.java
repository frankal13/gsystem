package midi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.junit.Test;

public class FCB1010Test {

	@Test
	public void testPresetChange() throws InvalidMidiDataException, MidiUnavailableException {
		FCB1010 cut = new FCB1010();
		FCB10BankProgram current = cut.receiveBankProgram();
		assertEquals(1, current.getBank());
		assertEquals(2, current.getProgram());
	}

	@Test
	public void testSysEx()
			throws InvalidMidiDataException, MidiUnavailableException, InterruptedException, IOException {
		FCB1010 cut = new FCB1010();
		byte[] sysex = cut.receiveSysEx();
		assertNotNull(sysex);
		Files.write(Paths.get("c://temp//fcb1010.sysex"), sysex);
		assertEquals(0xf0, sysex[0]);
		assertEquals(0xf7, sysex[sysex.length - 1]);
	}

}
