package filereader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Reader {
	private static final int OFFSET_FILE_NAME_LENGTH = 0x31c;
	private static final int OFFSET_BODY_TO_EFFECT = 0x1C2;

	public int getOffsetStart(byte[] prsContent) {
		return getOffsetBody(prsContent) + OFFSET_BODY_TO_EFFECT;
	}

	public int getOffsetBody(byte[] prsContent) {
		return getCommandOffset(prsContent, "BODY");
	}

	public int getCommandOffset(byte[] prsContent, String command) {
		String all = new String(prsContent);
		return all.indexOf(command);
	}

	private int getWord(int offset, byte[] prsContent) {
		return 16 * prsContent[offset] + prsContent[offset + 1];
	}

	private int getDoubleWord(int offset, byte[] prsContent) {
		return 16 * prsContent[offset] + prsContent[offset + 1] + 4096 * prsContent[offset + 2]
				+ 256 * prsContent[offset + 3];
	}

	public static byte[] readFile(String prsFilePath) throws IOException {
		Path path = Paths.get(prsFilePath);
		return Files.readAllBytes(path);
	}

	public static void writeFile(String filePath, byte[] content) throws IOException {
		Files.write(Paths.get(filePath), content);
	}

}
