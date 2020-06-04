package gsystem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import effect.BYTES;

public class SQSContent {

	private static final int PRESET_LENGTH = 0x51e; // 0x28f;
	private static final int OFFSET_NAME_FIRST_PATCH = 0x12;
	private static final int OFFSET_GLOBAL = 0;// 0x65C;// From second Body to first Global Parameter
	private byte[] sqsContentFirstPatch;
	private ArrayList<PRSContent> prsContents;
	private byte[] globalData;

	public SQSContent(byte[] sqsContent) {
		int offsetFirstBODY = BYTES.getCommandOffset(sqsContent, "BODY") + 0x04;
		int offsetSecondBODY = BYTES.getCommandOffset(sqsContent, "BODY", offsetFirstBODY);
		int offsetThirdBODY = BYTES.getCommandOffset(sqsContent, "BODY", offsetSecondBODY + 0x04);
		this.sqsContentFirstPatch = Arrays.copyOfRange(sqsContent, offsetSecondBODY + OFFSET_NAME_FIRST_PATCH,
				sqsContent.length);
		int offsetGlobal = OFFSET_GLOBAL + offsetThirdBODY;
		int lengthGlobal = offsetGlobal + 4000;
		this.globalData = Arrays.copyOfRange(sqsContent, offsetGlobal, lengthGlobal);
		setPRSContents();
	}

	public List<PRSContent> getPRSContents() {
		return prsContents;
	}

	/**
	 * Set all Patches using zhe
	 */
	public void setPRSContents() {
		prsContents = new ArrayList<PRSContent>();
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
		Files.write(Paths.get("c://temp//out.txt"), PRSContent
				.twoBytes2Byte(Arrays.copyOfRange(sqsContentFirstPatch, offset, sqsContentFirstPatch.length)));
	}

	public byte[] getGlobalData() {
		return globalData;
	}

}
