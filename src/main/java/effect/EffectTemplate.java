package effect;

// id (0..n) defines which sub effect is selected
public class EffectTemplate {

	public String getEffectName() {
		return "Effect";
	}

	public int getEffectOffset() {
		return 0;
	}

	public int getSubEffectIdOffset() {
		return 0;
	}

	public SubEffectTemplate[] getSubEffects() {
		return new SubEffectTemplate[] {};
	}

}
