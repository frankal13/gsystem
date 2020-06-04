package global.tuner;

import java.util.List;

import effect.Parameter;
import effect.ParameterTemplate;
import effect.SubEffectTemplate;
import global.tuner.values.TunerMode;
import global.tuner.values.TunerOutput;
import global.tuner.values.TunerReference;

public class Tuner extends SubEffectTemplate {
	// Third body: a333a
	// Output: a335c
	// Ref: a336e
	// Mode: a39a4

	private static final int OUTPUT = 34;
	private static final int REFERENCE = OUTPUT + 18;
	private static final int MODE = REFERENCE + 1590;

	private List<Parameter> parameters;

	public String getName() {
		return "Tuner";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		int offset = 0x5e2;
		return new ParameterTemplate[] { new ParameterTemplate("Output", OUTPUT, new TunerOutput()),
				new ParameterTemplate("Reference", REFERENCE, new TunerReference()),
				new ParameterTemplate("Mode", MODE, new TunerMode()) };
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
