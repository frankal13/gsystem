package gsystem;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import effect.BYTES;
import filereader.Reader;

public class SQSContent {

	private static final int PRESET_LENGTH = 0x51e; // 0x28f;
	private static final int OFFSET_NAME_FIRST_PATCH = 0x12;
	private byte[] sqsContentFirstPatch;
	private ArrayList<PRSContent> prsContents;

	public SQSContent(byte[] sqsContent) {
		int offsetFirstBODY = BYTES.getCommandOffset(sqsContent, "BODY") + 0x04;
		int offsetSecondBODY = BYTES.getCommandOffset(sqsContent, "BODY", offsetFirstBODY);
		this.sqsContentFirstPatch = Arrays.copyOfRange(sqsContent, offsetSecondBODY + OFFSET_NAME_FIRST_PATCH,
				sqsContent.length);
		this.prsContents = new ArrayList<PRSContent>();
		extractPRSContents();
	}

	public List<PRSContent> getPRSContents() {
		return prsContents;
	}

	public void extractPRSContents() {
		int pos = 0;
		int bank = 0;
		int number = 1;
		for (int i = 0; i < 100; i++) {
			byte[] patchData = Arrays.copyOfRange(sqsContentFirstPatch, pos, pos + PRESET_LENGTH);
			PRSContent prsContent = new PRSContent(patchData, bank, number);
			if (prsContent.isDefined()) {
				prsContents.add(prsContent);
			}
			pos += PRESET_LENGTH;
			number++;
			if (number > 5) {
				number = 1;
				bank++;
			}
		}
	}

	public void write2Bytes(int offset) throws IOException {
		Reader.writeFile("c://temp//effects//out.txt", PRSContent
				.twoBytes2Byte(Arrays.copyOfRange(sqsContentFirstPatch, offset, sqsContentFirstPatch.length)));
	}

}
