package effect;

import java.util.ArrayList;
import java.util.List;

public class SubEffectTemplate {

	private boolean isEnabled;

	public boolean isEnabled() {
		return isEnabled;
	}

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

	public List<Parameter> fill(byte[] effectPrsContent) {
		List<Parameter> parameters = new ArrayList<Parameter>();
		for (ParameterTemplate pt : getParameterTemplates()) {
			Parameter p = new Parameter(pt.getName());
			p.set(effectPrsContent, pt.getOffset(), pt.getLengthInBytes(), pt.getDelta(), pt.getValueList());
			parameters.add(p);
			if (p.getName().equals("Enable"))
				isEnabled = p.getValue().equals("On");
		}
		return parameters;
//		for (int i = 0; i < 80; i++) {
//			Parameter p = new Parameter(String.format("%d", 2 * i));
//			p.set(effectPrsContent, 2 * i, 2);
//			parameters.add(p);
//		}
	}

}
