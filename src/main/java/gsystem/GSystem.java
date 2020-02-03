package gsystem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import filereader.Reader;

//Scotty's Blues	31377
//Lofi Delay 	32042 CCB --> 3275
//Auto Wah	32D0D 
//Soft Tremolo 	339D8

public class GSystem {

	public void loadSQS(String filePath) throws IOException {
		byte[] sqs = Reader.readFile(filePath);
//		List<Preset> presets = extractPresets(sqs);
//		writeFile("c://temp//effects//out.txt", PRSContent.twoBytes2Byte(sqs));

//		findSeveral(sqs, "DeepBass", "PureLiverpool");

	}

	public static void writeFile(String filePath, byte[] content) throws IOException {
		Files.write(Paths.get(filePath), content);
	}

	private void findSeveral(byte[] content, String... terms) {
//		byte[] contentString = twoBytes2Byte(content);
//		for (String term : terms) {
//			int index = contentString.indexOf(term);
//			if (index > 0)
//				System.out.println(term + ":" + index);
//			else
//				System.out.println(term + ": not found");
//		}
	}

}
