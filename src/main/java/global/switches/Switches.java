package global.switches;

import java.util.List;

import effect.Parameter;
import effect.ParameterTemplate;
import effect.SubEffectTemplate;
import global.switches.values.Assign;

public class Switches extends SubEffectTemplate {
	// Third body: a333a
	// 01 Assign: a389d
	// 01 P1: a389c
	// 01 P2: a3899
	// Relay: a3980
	// Routing: a391a

	private static final int ASSIGN = 1374;
	private static final int SWITCHES_COUNT = 18;

	private List<Parameter> parameters;

	public String getName() {
		return "Switches";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		int offset = ASSIGN;
		ParameterTemplate[] templates = new ParameterTemplate[SWITCHES_COUNT];
		for (int i = 0; i < templates.length; i++) {
			templates[i] = new ParameterTemplate(String.format("%02d Assign", i + 1), offset, 6, new Assign());
			offset += 6;
		}
		return templates;
	}

	public void set(byte[] globalData) {
		parameters = fill(globalData);
	}

	public List<Parameter> getParameters() {
		return parameters;
	}

	@Override
	public void show() {
		for (Parameter parameter : parameters) {
			System.out.println(parameter);
		}
	}
}
