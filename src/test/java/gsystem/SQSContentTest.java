package gsystem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.junit.Test;

public class SQSContentTest {

	@Test
	public void testRaw() throws IOException {
		Path filePath = Paths.get("src", "test", "resources", "myset.sqs");
		byte[] sqs = Files.readAllBytes(filePath);
		SQSContent sqsContent = new SQSContent(sqs);
		sqsContent.write2Bytes(0);
	}

	@Test
	public void testShowSQS() throws IOException {
		Path filePath = Paths.get("src", "test", "resources", "myset.sqs");
		byte[] sqs = Files.readAllBytes(filePath);
		SQSContent sqsContent = new SQSContent(sqs);
		List<PRSContent> prsContents = sqsContent.getPRSContents();
		System.out.println(
				"ID;Patch;Filter;Filter Values;Compressor;Compressor Values;Noise Gate;Noise Gate Values;Modulation;Modulation Values;Pitch;Pitch Values;Delay;Delay Values;Reverb;Reverb Values;EQ;EQ Values; RelayA; RelayB");
		for (PRSContent prsContent : prsContents) {
			Preset preset = new Preset();
			preset.setFromPrsContent(prsContent);
			preset.show();
		}
	}

}
