package global.lock;

import java.util.List;

import effect.Parameter;
import effect.ParameterTemplate;
import effect.SubEffectTemplate;
import global.lock.values.Lock;

public class Locks extends SubEffectTemplate {
	// Third body: a333a
	// Boost: a3962
	// EQ: a3968
	// Insert: a397a
	// Relay: a3980
	// Routing: a391a

	private static final int BOOST = 1576;
	private static final int EQ = BOOST + 6;
	private static final int INSERT = EQ + 18;
	private static final int RELAY = INSERT + 6;
	private static final int ROUTING = 1504;

	private List<Parameter> parameters;

	public String getName() {
		return "Locks";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		int offset = 0x5e2;
		return new ParameterTemplate[] { new ParameterTemplate("Boost Lock", BOOST, new Lock()),
				new ParameterTemplate("EQ Lock", EQ, new Lock()),
				new ParameterTemplate("Insert Lock", INSERT, new Lock()),
				new ParameterTemplate("Relay Lock", RELAY, new Lock()),
				new ParameterTemplate("Routing Lock", ROUTING, new Lock()) };
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
