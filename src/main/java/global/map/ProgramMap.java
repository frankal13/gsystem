package global.map;

import java.util.List;

import effect.Parameter;
import effect.ParameterTemplate;
import effect.SubEffectTemplate;
import global.map.values.MapValue;

public class ProgramMap extends SubEffectTemplate {
	// Third body: a333a
	// 00-1: a33e8 *6
	// 00-3: a33f8
	// 00-5: a3404
	// 01-1: a340a

	private static final int OFFSET_00_1 = 178;
	private static final int VALUE_LENGTH = 6;

	private static final int BANKS = 40;
	private static final int PROGRAMS = 5;

	private List<Parameter> parameters;

	public String getName() {
		return "Program Map";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		ParameterTemplate[] templates = new ParameterTemplate[BANKS * PROGRAMS];
		int offset = OFFSET_00_1;
		for (int bank = 0; bank < BANKS; bank++) {
			for (int program = 0; program < PROGRAMS; program++) {
				int i = bank * PROGRAMS + program;
				templates[i] = new ParameterTemplate(String.format("%02d-%d", bank, program + 1), offset, 2,
						new MapValue());
				offset += VALUE_LENGTH;
			}
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
