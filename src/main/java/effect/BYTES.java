package effect;

import java.util.Arrays;

public class BYTES {

	public static int number(byte[] data, int offset, int length) {
		if (length == 2)
			return two(data, offset);
		return four(data, offset);
	}

	public static int four(byte[] data, int offset) {
		return two(data, offset) + 256 * two(data, offset + 2);
	}

	public static int two(byte[] data, int offset) {
		return data[offset] * 16 + data[offset + 1];
	}

	public static int twoFull(byte[] data, int offset) {
		System.out.print(String.format("%02x:%02x ", data[offset], data[offset + 1]));
		return (data[offset] & 0xFF) * 256 + (data[offset + 1] & 0xFF);
	}

	public static int getCommandOffset(byte[] content, String command) {
		String all = new String(content);
		return all.indexOf(command);
	}

	public static int getCommandOffset(byte[] content, String command, int offset) {
		return getCommandOffset(Arrays.copyOfRange(content, offset, content.length), command) + offset;
	}

}
