package global.midi;

import java.util.List;

import effect.Parameter;
import effect.ParameterTemplate;
import effect.SubEffectTemplate;
import global.midi.values.MidiChannel;
import global.midi.values.MidiEncoderAControlChange;
import global.midi.values.MidiEncoderBControlChange;
import global.midi.values.MidiEncoderCControlChange;
import global.midi.values.MidiProgramChangeIn;
import global.midi.values.MidiProgramChangeOut;
import global.midi.values.MidiTapControlChange;

public class Midi extends SubEffectTemplate {
	// Third body: a333a
	// Channel: a33a4
	// ProgramChangeIn: a33aa
	// ProgramChangeOut: a33b0
	// EncoderAControlChange = a33ce
	// EncoderBControlChange = a33d4
	// EncoderCControlChange = a33da
	// TapControlChange = a33e0
	// Ref: a336e
	// Mode: a39a4

	private static final int CHANNEL = 106;
	private static final int PROGRAM_CHANGE_IN = CHANNEL + 6;
	private static final int PROGRAM_CHANGE_OUT = PROGRAM_CHANGE_IN + 6;
	private static final int ENCODER_A_CONTROL_CHANGE = PROGRAM_CHANGE_OUT + 30;
	private static final int ENCODER_B_CONTROL_CHANGE = ENCODER_A_CONTROL_CHANGE + 6;
	private static final int ENCODER_C_CONTROL_CHANGE = ENCODER_B_CONTROL_CHANGE + 6;
	private static final int TAP_CONTROL_CHANGE = ENCODER_C_CONTROL_CHANGE + 6;

	private List<Parameter> parameters;

	public String getName() {
		return "Midi";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		return new ParameterTemplate[] { new ParameterTemplate("MIDI Channel", CHANNEL, new MidiChannel()),
				new ParameterTemplate("MIDI Program Change In", PROGRAM_CHANGE_IN, new MidiProgramChangeIn()),
				new ParameterTemplate("MIDI Program Change Out", PROGRAM_CHANGE_OUT, new MidiProgramChangeOut()),
				new ParameterTemplate("MIDI Encoder A Control Change", ENCODER_A_CONTROL_CHANGE,
						new MidiEncoderAControlChange()),
				new ParameterTemplate("MIDI Encoder B Control Change", ENCODER_B_CONTROL_CHANGE,
						new MidiEncoderBControlChange()),
				new ParameterTemplate("MIDI Encoder C Control Change", ENCODER_C_CONTROL_CHANGE,
						new MidiEncoderCControlChange()),
				new ParameterTemplate("MIDI Tap Control Change", TAP_CONTROL_CHANGE, new MidiTapControlChange()) };
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
