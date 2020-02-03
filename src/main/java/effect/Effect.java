package effect;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import filereader.Reader;

/*
compon	2a5a 01	0x5a
filton	2a96 01	0x96
modon	2af6 01	0xf6
pitchon	2b50 01 0x150
revon	2bc8 01	0x1c8
noison	2c22 01	0x222
delayon	2c4c 01 0x24c
eqon	2d24 01 0x324
 */

/**
 * Effect - Each preset consists of a list of effects, e.g. Delay, Reverb etc.
 * The "offset" for each effect is the offset within the prs constent.
 * 
 * @author frank
 *
 */
public class Effect {

	private static final int OFFSET_FILE_NAME_LENGTH = 0x31c;
	private static final int OFFSET_PATCH_NAME_TO_DATA = 0; // -24;

	private EffectTemplate effectTemplate;
	private SubEffectTemplate subEffectTemplate;
	private List<Parameter> parameters;

	private Reader reader;
	private boolean isEnabled;

	public Effect(EffectTemplate effectTemplate) {
		this.isEnabled = false;
		this.effectTemplate = effectTemplate;
		reader = new Reader();

	}

	public void show() {
		System.out.println(getName());
		System.out.println(subEffectTemplate.getName());
		showParameters();
	}

	public void showParameters() {
		for (Parameter parameter : parameters) {
			if (!parameter.getName().equals("Enable"))
				System.out.print(parameter + ",");
		}
	}

	public String getName() {
		return effectTemplate.getEffectName();
	}

	public String getSubEffectName() {
		return subEffectTemplate.getName();
	}

	public void setWithDataFromPatchName(byte[] prsContent) {
		if (effectTemplate.getSubEffects().length == 1)
			subEffectTemplate = effectTemplate.getSubEffects()[0];
		else
			subEffectTemplate = effectTemplate.getSubEffects()[getSubEffectId(prsContent)];
		int offsetStart = getOffsetData(prsContent);
		byte[] effectPrsContent = Arrays.copyOfRange(prsContent, offsetStart, prsContent.length);
		setParameters(effectPrsContent);
	}

	private void setParameters(byte[] effectPrsContent) {
		parameters = new ArrayList<Parameter>();
		for (ParameterTemplate pt : subEffectTemplate.getParameterTemplates()) {
			Parameter p = new Parameter(pt.getName());
			p.set(effectPrsContent, pt.getOffset(), pt.getLengthInBytes(), pt.getDelta(), pt.getValueList());
			parameters.add(p);
			if (p.getName().equals("Enable"))
				isEnabled = p.getValue().equals("On");
		}
//		for (int i = 0; i < 80; i++) {
//			Parameter p = new Parameter(String.format("%d", 2 * i));
//			p.set(effectPrsContent, 2 * i, 2);
//			parameters.add(p);
//		}
	}

	private int getOffsetData(byte[] prsContent) {
		int offsetStart = effectTemplate.getEffectOffset() + OFFSET_PATCH_NAME_TO_DATA;
		return offsetStart;
	}

	// AW:12 RF:13 AF:15
	public int getSubEffectId(String prsFilePath) throws IOException {
		return getSubEffectId(readFile(prsFilePath));
	}

	private int getSubEffectId(byte[] prsContent) {
		int offsetStart = getOffsetData(prsContent);
		int subEffectId = getWord(offsetStart + effectTemplate.getSubEffectIdOffset(), prsContent);
		return subEffectId;

	}

	private int getWord(int offset, byte[] prsContent) {
		return 16 * prsContent[offset] + prsContent[offset + 1];
	}

	private byte[] readFile(String prsFile) throws IOException {
		Path path = Paths.get(prsFile);
		return Files.readAllBytes(path);
	}

	@Override
	public String toString() {
		return super.toString();
	}

	public boolean isEnabled() {
		return isEnabled;
	}

}