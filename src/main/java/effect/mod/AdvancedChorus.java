package effect.mod;

import effect.ParameterTemplate;
import effect.SubEffectTemplate;
import effect.values.ChoDl;
import effect.values.Depth;
import effect.values.Freq20Hz220kHz;
import effect.values.OffOn;
import effect.values.OutLev;
import effect.values.Speed;
import effect.values.Tempo;

public class AdvancedChorus extends SubEffectTemplate {
	@Override
	public String getName() {
		return "Advanced Chorus";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		return new ParameterTemplate[] { new ParameterTemplate("Speed", 24, new Speed()),
				new ParameterTemplate("Tempo", 18, new Tempo()), new ParameterTemplate("Depth", 30, new Depth()),
				new ParameterTemplate("Cho Dl", 54, new ChoDl()), new ParameterTemplate("Ratio", 60, new OffOn()),
				new ParameterTemplate("PhaRev", 66, new OffOn()), new ParameterTemplate("Hi Cut", 36, new Freq20Hz220kHz()),
				new ParameterTemplate("Mix", 42), new ParameterTemplate("OutLev", 48, new OutLev()),
				new ParameterTemplate("Enable", 6, new OffOn()) };
	}
}

/*
 * Zusätzliche (beim Classic Chorus nicht vorhandene)
 * 
 * Parameter: »Cho Dl« (Chorus Delay)
 * 
 * Wertebereich: 0 bis 50 ms Wie bereits vorher gesagt wurde, ist ein
 * Chorus/Flanger grundsätzlich ein Delay, das von einem tieffrequenten
 * Oszillator (LFO) moduliert wird. Mit diesem Parameter können Sie die
 * Verzögerung (das Delay) festlegen. Für einen typischen Chorus werden
 * Delayzeiten im Bereich von etwa 10 ms verwendet, bei einem Flanger sind es in
 * der Regel 5 ms. Obwohl dies bei einem Chorus nicht üblich ist, gefällt Ihnen
 * vielleicht auch der »Slapback«-Effekt (sehr kurze Echos), der bei höheren
 * Delay-Werten (zwischen 30 und 50 ms) zu hören ist.
 * 
 * Parameter »Ratio« (Golden Ratio) Werte: »Off« / »On« TC-Forschungsergebnisse
 * zeigen, dass die die Intensität eines Modulationseffekts vermindert werden
 * sollte, wenn seine Geschwindigkeit erhöht wird, damit der Hörer einen Effekt
 * vergleichbarer Intensität wahrnimmt. Wenn der Parameter »Golden Ratio« aktiv
 * ist (Einstellung »on«), wird dieses Verhältnis automatisch berechnet und
 * umgesetzt. Diese Funktion ist ein »Erbe« des klassischen Signalprozessors TC
 * 2290.
 * 
 * Parameter »PhaRev« (Phase Reverse) Werte: »Off« / »On« Wenn Sie diesen
 * Parameter aktivieren (Einstellung »on«), wird die Phase des bearbeiteten
 * Signals im rechten Kanal umgekehrt. Dadurch entsteht ein wesentlich breiter
 * wirkender, aber weniger definierter Effekt.
 */