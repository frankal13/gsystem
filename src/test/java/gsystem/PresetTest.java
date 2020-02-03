package gsystem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

public class PresetTest {

	@Test
	public void testLoops() throws IOException {
		testLoop("l00000", "l01000", "l00100", "l00010", "l00001");
	}

	private void testLoop(String... names) throws IOException {
		Preset cut = new Preset();
		for (String name : names) {
			Path filePath = Paths.get("src", "test", "resources", name + ".prs");
			cut.setFromPrsContent(new PRSContent(Files.readAllBytes(filePath)));
			System.out.println(cut.getLoops().getLoop1() + ", " + cut.getLoops().getLoop2() + ", "
					+ cut.getLoops().getLoop3() + ", " + cut.getLoops().getLoop4() + ", " + cut.getLoops().getInsert());
		}
	}

	@Test
	public void testBoosts() throws IOException {
		testBoost("b0", "b5");
	}

	private void testBoost(String... names) throws IOException {
		Preset cut = new Preset();
		for (String name : names) {
			Path filePath = Paths.get("src", "test", "resources", name + ".prs");
			cut.setFromPrsContent(new PRSContent(Files.readAllBytes(filePath)));
			System.out.println(name + ":" + cut.getBoost());
		}
	}

	@Test
	public void testRelays() throws IOException {
		testRelay("ra0000", "racccc", "ra0cc0", "rb0000", "rb0c0c", "rbcc00");
	}

	private void testRelay(String... names) throws IOException {
		Preset cut = new Preset();
		for (String name : names) {
			Path filePath = Paths.get("src", "test", "resources", name + ".prs");
			cut.setFromPrsContent(new PRSContent(Files.readAllBytes(filePath)));
			System.out.println(name + ":" + cut.getRelay());
		}
	}

}
