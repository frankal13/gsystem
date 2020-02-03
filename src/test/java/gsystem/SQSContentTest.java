package gsystem;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import filereader.Reader;

/* 
 * ToDo: Switch anzeigen 

 */
public class SQSContentTest {

	@Test
	public void testRaw() throws IOException {
		String filename = "OffLimits.sqs";
		byte[] sqs = Reader.readFile("c://temp//effects//" + filename);
		SQSContent sqsContent = new SQSContent(sqs);
		sqsContent.write2Bytes(0);
	}

	@Test
	public void testShowSQS() throws IOException {
		String filename = "Factory Set.sqs";
		filename = "OffLimits6.sqs";
		byte[] sqs = Reader.readFile("c://temp//effects//" + filename);
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

// OffLimits5: BODY 0x02A04, 0x626DC, 0xA333A: Error
// OffLimits3: BODY 0x02A08, 0x626E0, 0xA333E: Error
