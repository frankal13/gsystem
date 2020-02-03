package effect;

public class SubEffectTemplate {

	public String getName() {
		return "sub effect";
	}

	public ParameterTemplate[] getParameterTemplates() {
		return new ParameterTemplate[] {};
	}

	public void show() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "SubEffect:" + getName() + "\n" + listAllParameterTemplates();
	}

	public String listAllParameterTemplates() {
		String s = "";
		for (ParameterTemplate parameter : getParameterTemplates()) {
			s += parameter;
		}
		return s;
	}

}
