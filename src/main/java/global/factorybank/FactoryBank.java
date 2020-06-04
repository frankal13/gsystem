package global.factorybank;

import java.util.List;

import effect.Parameter;
import effect.ParameterTemplate;
import effect.SubEffectTemplate;
import global.factorybank.values.SelectLockout;

public class FactoryBank extends SubEffectTemplate {
	// Third body: a333a
	// Output: a3992

	private static final int SELECT_LOCKOUT = 1624;

	private List<Parameter> parameters;

	public String getName() {
		return "Tuner";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		return new ParameterTemplate[] { new ParameterTemplate("Select Lockout", SELECT_LOCKOUT, new SelectLockout()) };
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
