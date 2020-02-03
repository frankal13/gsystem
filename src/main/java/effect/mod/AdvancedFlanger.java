package effect.mod;

import effect.ParameterTemplate;
import effect.SubEffectTemplate;
import effect.values.ChoDl;
import effect.values.Depth;
import effect.values.Feedback;
import effect.values.Freq20Hz220kHz;
import effect.values.OffOn;
import effect.values.OutLev;
import effect.values.Speed;
import effect.values.Tempo;

public class AdvancedFlanger extends SubEffectTemplate {
	@Override
	public String getName() {
		return "Advanced Flanger";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		return new ParameterTemplate[] { new ParameterTemplate("Speed", 24, new Speed()),
				new ParameterTemplate("Tempo", 18, new Tempo()), new ParameterTemplate("Depth", 30, new Depth()),
				new ParameterTemplate("Hi Cut", 36, new Freq20Hz220kHz()),
				new ParameterTemplate("Feedback", 72, new Feedback()),
				new ParameterTemplate("FB Cut", 78, new Freq20Hz220kHz()), new ParameterTemplate("Fla Dl", 54, new ChoDl()),
				new ParameterTemplate("Ratio", 60, new OffOn()), new ParameterTemplate("PhaRev", 66, new OffOn()),
				new ParameterTemplate("Mix", 42), new ParameterTemplate("OutLev", 48, new OutLev()),
				new ParameterTemplate("Enable", 6, new OffOn()) };
	}
}
/*
 * Zus�tzliche (beim Classic Flanger nicht vorhandene)
 * 
 * Parameter: Parameter �Fla Dl� (Flanger Delay) Wertebereich: 0 bis 50 ms F�r
 * Flangingeffekte werden normalerweise Verz�gerungen von etwa 5 ms verwendet,
 * w�hrend f�r einen Chorus etwa 10 ms �blich sind. Sie k�nnen aber jeden Wert
 * zwischen 0 und 50 ms verwenden.
 * 
 * Parameter �PhaRev� (Phase Reverse) Werte: �Off� / �On� Wenn Sie diesen
 * Parameter aktivieren (Einstellung �on�), wird die Phase des bearbeiteten
 * Signals im rechten Kanal umgekehrt. Dadurch entsteht ein wesentlich breiter
 * wirkender, aber weniger definierter Effekt.
 * 
 * Parameter �Ratio� (Golden Ratio) Werte: �Off� / �On� TC-Forschungsergebnisse
 * zeigen, dass die die Intensit�t eines Modulationseffekts vermindert werden
 * sollte, wenn seine Geschwindigkeit erh�ht wird, damit der H�rer einen Effekt
 * vergleichbarer Intensit�t wahrnimmt. Wenn der Parameter �Golden Ratio� aktiv
 * ist (Einstellung �on�), wird dieses Verh�ltnis automatisch berechnet und
 * umgesetzt. Diese Funktion ist ein �Erbe� des klassischen Signalprozessors TC
 * 2290
 */
