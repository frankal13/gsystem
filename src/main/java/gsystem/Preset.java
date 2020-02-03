package gsystem;

import java.util.ArrayList;
import java.util.List;

import effect.Boost;
import effect.Compressor;
import effect.Delay;
import effect.EQ;
import effect.Effect;
import effect.Filter;
import effect.Loops;
import effect.Modulation;
import effect.NoiseGate;
import effect.Pitch;
import effect.Relay;
import effect.Reverb;
import effect.Routing;
import effect.Tempo;

/**
 * Takes a complete preset and sets the parameters of each effect based on the
 * prs-content file
 * 
 * @author frank
 *
 */
public class Preset {

	private String name;

	private List<Effect> effects;

	private Tempo tempo;

	private Loops loops;
	private Routing routing;
	private Boost boost;

	private int bank;

	private int number;

	private Relay relay;

	public Preset() {
		effects = new ArrayList<Effect>();
		effects.add(new Effect(new Filter()));
		effects.add(new Effect(new Compressor()));
		effects.add(new Effect(new NoiseGate()));
		effects.add(new Effect(new Modulation()));
		effects.add(new Effect(new Pitch()));
		effects.add(new Effect(new Delay()));
		effects.add(new Effect(new Reverb()));
		effects.add(new Effect(new EQ()));
		tempo = new Tempo();
		loops = new Loops();
		routing = new Routing();
		boost = new Boost();
		relay = new Relay();
	}

	public void setFromPrsContent(PRSContent prsContent) {
		this.name = prsContent.getName();
		this.bank = prsContent.getBank();
		this.number = prsContent.getNumber();

		byte[] datatFromfirstPatchName = prsContent.getFromFirstPatchName();

		loops.set(datatFromfirstPatchName);
		routing.set(datatFromfirstPatchName);
		boost.set(datatFromfirstPatchName);
		relay.set(datatFromfirstPatchName);
		for (Effect effect : effects) {
			effect.setWithDataFromPatchName(datatFromfirstPatchName);
		}
	}

	public Tempo getTempo() {
		return tempo;
	}

	@Override
	public String toString() {
		return name;
	}

	public void show() {
		show(true);
	}

	public void show(boolean onOnly) {
		System.out.print(String.format("%s; %s;", getNumberAsString(), getName()));
		for (Effect effect : effects) {
			if ((effect.isEnabled()) || (!onOnly)) {
				// System.out.print(String.format("%s; %s:;", effect.getName(),
				// effect.getSubEffectName()));
				System.out.print(String.format("%s:;", effect.getSubEffectName()));
				effect.showParameters();
				System.out.print(";");
			} else
				System.out.print("-;;");
		}
		System.out.println(getRelay());
	}

	private String getNumberAsString() {
		return String.format("'%02d-%s", bank, number);
	}

	private String getName() {
		return name;
	}

	public Loops getLoops() {
		return loops;
	}

	public String getRouting() {
		return routing.getRouting();
	}

	public String getBoost() {
		return boost.getBoost();
	}

	public String getRelay() {
		return relay.getRelay();
	}

}
