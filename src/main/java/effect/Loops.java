package effect;

// loop1: 0x0002 , loop2: 0x0004, loop3:0008, loop4: 0x0100, insert: 0x0200
public class Loops {
	private static final int LOOP_OFFSET = 0x2c;
	private boolean loop1;
	private boolean loop2;
	private boolean loop3;
	private boolean loop4;
	private boolean insert;

	public void set(byte[] body) {
		byte b1 = body[LOOP_OFFSET + 1];
		byte b2 = body[LOOP_OFFSET];
		loop1 = ((b1 & 0x02) != 0);
		loop2 = ((b1 & 0x04) != 0);
		loop3 = ((b1 & 0x08) != 0);
		loop4 = ((b2 & 0x01) != 0);
		insert = ((b2 & 0x02) != 0);
	}

	public boolean isLoop1() {
		return loop1;
	}

	public boolean isLoop2() {
		return loop2;
	}

	public boolean isLoop3() {
		return loop3;
	}

	public boolean isLoop4() {
		return loop4;
	}

	public boolean isInsert() {
		return insert;
	}

	public String getLoop1() {
		return onOff(loop1);
	}

	public String getLoop2() {
		return onOff(loop2);
	}

	public String getLoop3() {
		return onOff(loop3);
	}

	public String getLoop4() {
		return onOff(loop4);
	}

	public String getInsert() {
		return onOff(insert);
	}

	private String onOff(boolean flag) {
		if (flag)
			return "on";
		return "off";
	}

}
