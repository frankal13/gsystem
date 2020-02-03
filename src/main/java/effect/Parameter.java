package effect;

public class Parameter {

	private String name;
	private String value;

	public Parameter(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void set(byte[] data, int offset, int length) {
		int intValue = BYTES.number(data, offset, length);
		value = String.format("%d", intValue);
	}

	public void set(byte[] data, int offset, int length, int delta, ValueList values) {
		int intValue = BYTES.number(data, offset, length);
		intValue -= delta;
		if (values == null)
			value = String.format("%d", intValue);
		else
			value = values.getValue(intValue);
	}

	@Override
	public String toString() {
		return String.format("%s:%s", getName(), getValue());
	}

}
