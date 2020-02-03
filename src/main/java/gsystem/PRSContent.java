package gsystem;

import java.io.IOException;
import java.util.Arrays;

import effect.BYTES;
import filereader.Reader;

/**
 * The prsContent byte[] starts with the patch name
 * 
 * @author frank
 *
 */
public class PRSContent {

	private static final int PATCH_NAME_LENGTH = 32;
	private static final int PATCH_NAME_OFFSET = 0; // x18;

	private byte[] dataFromFirstPatchName;
	private String name;
	private int bank; // 0..n
	private int number; // 1..n

	/**
	 * Data starts with the name of the Patch
	 * 
	 * @param data
	 */
	public PRSContent(byte[] data, int bank, int number) {
		this.dataFromFirstPatchName = data;
		this.bank = bank;
		this.number = number;
		setName();
	}

	public PRSContent(String prsFilePath) throws IOException {
		byte[] fileContent = Reader.readFile(prsFilePath);
		set(fileContent);
		this.bank = 0;
		this.number = 0;
		setName();
	}

	public PRSContent(String prsFilePath, int bank, int number) throws IOException {
		byte[] fileContent = Reader.readFile(prsFilePath);
		set(fileContent);
		this.bank = bank;
		this.number = number;
		setName();
	}

	public int getBank() {
		return bank;
	}

	public int getNumber() {
		return number;
	}

	private void setName() {
		name = new String(twoBytes2Char(
				Arrays.copyOfRange(dataFromFirstPatchName, PATCH_NAME_OFFSET, PATCH_NAME_LENGTH + PATCH_NAME_OFFSET)));
		if (name.indexOf(0) >= 0)
			name = name.substring(0, name.indexOf(0));
	}

	private void set(byte[] data) {
		int offsetBODY = BYTES.getCommandOffset(data, "BODY"); // 0x0e;
		dataFromFirstPatchName = Arrays.copyOfRange(data, offsetBODY + 0x12, data.length);
	}

	public int getWord(int offset, byte[] prsContent) {
		return 16 * prsContent[offset] + prsContent[offset + 1];
	}

	public int getDoubleWord(int offset, byte[] prsContent) {
		return 16 * prsContent[offset] + prsContent[offset + 1] + 4096 * prsContent[offset + 2]
				+ 256 * prsContent[offset + 3];
	}

	public String getName() {
		return name;
	}

	public static byte[] twoBytes2Byte(byte[] content) {
		byte[] out = new byte[content.length / 2];
		int pos = 0; // 0x2a1e;
		for (int i = 0; i < content.length / 2; i++) {
			out[i] = (byte) (content[pos] * 16 + content[pos + 1]);
			pos += 2;
		}
		return out;
	}

	public static byte[] twoBytes2Char(byte[] content) {
		byte[] out = new byte[content.length / 2];
		int pos = 0; // 0x2a1e;
		for (int i = 0; i < content.length / 2; i++) {
			out[i] = (byte) ((byte) (content[pos] & 0x7) * 16 + content[pos + 1]);
			pos += 2;
		}
		return out;
	}

	public byte[] getFromFirstPatchName() {
		return dataFromFirstPatchName;
	}

	public boolean isDefined() {
		if (bank == 0)
			return false;
		return true;
	}

}
