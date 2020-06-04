package global.pedal;

import java.util.List;

import effect.Parameter;
import effect.ParameterTemplate;
import effect.SubEffectTemplate;
import global.pedal.values.ControllerExpressionPedalType;
import global.pedal.values.ControllerVolumePedalType;
import global.pedal.values.ExpressionMaster;
import global.pedal.values.GFX1ExpressionPedalType;
import global.pedal.values.GFX1VolumePedalType;
import global.pedal.values.MasterVolumeControlAssignment;
import global.pedal.values.VolumeMaster;

public class Pedal extends SubEffectTemplate {
	// Third body: a333a
	// Master Volume: a39b6
	// GFX1 Volume Pedal Type: a3380
	// GFX1 Expression Pedal Type: a3386
	// Controller_Volume Pedal Type: a338c
	// Controller_Expression Pedal Type: a3392
	// Volume Master: a3398
	// Expression Master: a339e

	private static final int MASTER_VOLUME_CONTROL_ASSIGNMENT = 1661;
	private static final int GFX1_VOLUME_PEDAL_TYPE = 70;
	private static final int GFX1_EXPRESSION_PEDAL_TYPE = GFX1_VOLUME_PEDAL_TYPE + 6;
	private static final int CONTROLLER_VOLUME_PEDAL_TYPE = GFX1_EXPRESSION_PEDAL_TYPE + 6;
	private static final int CONTROLLER_EXPRESSION_PEDAL_TYPE = CONTROLLER_VOLUME_PEDAL_TYPE + 6;
	private static final int VOLUME_MASTER = CONTROLLER_EXPRESSION_PEDAL_TYPE + 6;
	private static final int EXPRESSION_MASTER = VOLUME_MASTER + 6;

	private List<Parameter> parameters;

	public String getName() {
		return "Pedal";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		int offset = 0x5e2;
		return new ParameterTemplate[] {
				new ParameterTemplate("Master Volume Control Assignment", MASTER_VOLUME_CONTROL_ASSIGNMENT, 1,
						new MasterVolumeControlAssignment()),
				new ParameterTemplate("GFX1 Volume Pedal Type", GFX1_VOLUME_PEDAL_TYPE, new GFX1VolumePedalType()),
				new ParameterTemplate("GFX1 Expression Pedal Type", GFX1_EXPRESSION_PEDAL_TYPE,
						new GFX1ExpressionPedalType()),
				new ParameterTemplate("Controller Volume Pedal Type", CONTROLLER_VOLUME_PEDAL_TYPE,
						new ControllerVolumePedalType()),
				new ParameterTemplate("Controller Expression Pedal Type", CONTROLLER_EXPRESSION_PEDAL_TYPE,
						new ControllerExpressionPedalType()),
				new ParameterTemplate("Volume Master", VOLUME_MASTER, new VolumeMaster()),
				new ParameterTemplate("Expression Master", EXPRESSION_MASTER, new ExpressionMaster()) };
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
