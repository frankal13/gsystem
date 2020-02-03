package gsystem;

import java.io.IOException;

import org.junit.Test;

public class GSystemTest {

	@Test
	public void testSQS() throws IOException {
		GSystem gSystem = new GSystem();
//		gSystem.loadSQS("c://temp//effects//Factory Set.sqs");
		gSystem.loadSQS("c://temp//effects//Frank.sqs");
//		List<Preset> presets = gSystem.getClass()tPresets();
//		assertNotNull(presets);
	}

	@Test
	public void testName() throws IOException {
//		byte[] content = GSystem.readFile("C://temp//effects//abcdxx.prs");
//		GSystem.writeFile("c://temp//effects//out.txt", Preset.twoBytes2Byte(content));
	}

}
