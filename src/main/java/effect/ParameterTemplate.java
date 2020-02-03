package effect;

public class ParameterTemplate {

	private String name;
	private int offset;
	private ValueList values;
	private int length;
	private int delta;

	public ParameterTemplate(String name, int offset) {
		this.name = name;
		this.offset = offset;
		this.values = null;
		this.delta = 0;
		this.length = 2;
	}

	public ParameterTemplate(String name, int offset, ValueList values) {
		this.name = name;
		this.offset = offset;
		this.values = values;
		this.delta = 0;
		this.length = 2;
	}

	public ParameterTemplate(String name, int offset, int length, ValueList values) {
		this.name = name;
		this.offset = offset;
		this.values = values;
		this.delta = 0;
		this.length = length;
	}

	public ParameterTemplate(String name, int offset, ValueList values, int delta) {
		this.name = name;
		this.offset = offset;
		this.delta = delta;
		this.values = values;
		this.length = 2;
	}

	public String getName() {
		return name;
	}

	public int getOffset() {
		return offset;
	}

	public int getDelta() {
		return delta;
	}

	public boolean hasValues() {
		return values != null;
	}

	public int getLengthInBytes() {
		return length;
	}

	public ValueList getValueList() {
		return values;
	}

}
