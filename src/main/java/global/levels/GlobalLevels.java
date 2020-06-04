package global.levels;

import java.util.List;

import effect.Parameter;
import effect.ParameterTemplate;
import effect.SubEffectTemplate;
import global.levels.values.BoostMaxVolume;
import global.levels.values.GlobalRouting;
import global.levels.values.GuitarInputSelect;
import global.levels.values.GuitarInputSensitivity;
import global.levels.values.KillDry;
import global.levels.values.LoopHeadroom;
import global.levels.values.LoopLevel;
import global.levels.values.OutputLevel;
import global.levels.values.Volume;
import global.levels.values.VolumePlacement;

public class GlobalLevels extends SubEffectTemplate {
	// Third body: a333a
	// Global Routing: a3914
	// Guitar Input Select: a3920
	// Guitar Input Sensitivity: a3926
	// Loop Level: a392c
	// Loop Headroom: a3932
	// Volume: a3934
	// Volume Placement: a393e
	// Output Level: a3940
	// Boost Max Volume: a395c
	// Kill Dry: a33e6

	private static final int GLOBAL_ROUTING = 1326 + 0xac;
	private static final int GUITAR_INPUT_SELECT = GLOBAL_ROUTING + 12;
	private static final int GUITAR_INPUT_SENSITIVITY = GUITAR_INPUT_SELECT + 6;
	private static final int LOOP_LEVEL = GUITAR_INPUT_SENSITIVITY + 6;
	private static final int LOOP_HEADROOM = LOOP_LEVEL + 6;
	private static final int VOLUME = LOOP_HEADROOM + 2;
	private static final int VOLUME_PLACEMENT = VOLUME + 10;
	private static final int OUTPUT_LEVEL = VOLUME_PLACEMENT + 4;
	private static final int BOOST_MAX_VOLUME = OUTPUT_LEVEL + 26;
	private static final int KILL_DRY = 0xac;

	private List<Parameter> parameters;

	public String getName() {
		return "Global";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		int offset = 0x5e2;
		return new ParameterTemplate[] { new ParameterTemplate("Global Routing", GLOBAL_ROUTING, new GlobalRouting()),
				new ParameterTemplate("Guitar Input Select", GUITAR_INPUT_SELECT, new GuitarInputSelect()),
				new ParameterTemplate("Guitar Input Sensitivity", GUITAR_INPUT_SENSITIVITY,
						new GuitarInputSensitivity()),
				new ParameterTemplate("Loop Level", LOOP_LEVEL, 4, new LoopLevel()),
				new ParameterTemplate("Loop Headroom", LOOP_HEADROOM, new LoopHeadroom()),
				new ParameterTemplate("Volume", VOLUME, 4, new Volume()),
				new ParameterTemplate("Volume Placement", VOLUME_PLACEMENT, new VolumePlacement()),
				new ParameterTemplate("Output Level", OUTPUT_LEVEL, 4, new OutputLevel()),
				new ParameterTemplate("Boost Max Volume", BOOST_MAX_VOLUME, new BoostMaxVolume()),
				new ParameterTemplate("Kill Dry", KILL_DRY, new KillDry()) };
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
