package effect.delay;

import effect.ParameterTemplate;
import effect.SubEffectTemplate;
import effect.values.DelayTime;
import effect.values.Freq20Hz220kHz;
import effect.values.OffOn;
import effect.values.OutLev;
import effect.values.SingleDelayFeedback;
import effect.values.SingleDelayTempo;

public class SingleDelay extends SubEffectTemplate {
	@Override
	public String getName() {
		return "Single Delay";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		return new ParameterTemplate[] { new ParameterTemplate("Delaytime", 12, 4, new DelayTime()),
				new ParameterTemplate("Tempo", 30, new SingleDelayTempo()),
				new ParameterTemplate("Feedback", 54, new SingleDelayFeedback()),
				new ParameterTemplate("FB LowCut", 96, new Freq20Hz220kHz()),
				new ParameterTemplate("FB HiCut", 90, new Freq20Hz220kHz()), new ParameterTemplate("Mix", 114),
				new ParameterTemplate("OutLev", 120, new OutLev()), new ParameterTemplate("Enable", 6, new OffOn()) };
	}
}
/*
 * Delay – Allgemeine Parameter Die folgenden Parameter sind bei allen Delays
 * identisch. Parameter, die nur bei bestimmten Delays zur Verfügung stehen,
 * werden in den entsprechenden Abschnitten beschrieben.
 * 
 * Parameter »Delay« Wertebereich: 0 bis 1800 ms Mit diesem Parameter legen Sie
 * die Zeit zwischen den vom Delay erzeugten Wiederholungen fest. Dies wird auch
 * als die »Länge« der Wiederholung(en) bezeichnet.
 * 
 * Parameter »Tempo« Wertebereich: »Ignore«, 1 bis 1/32T Wenn Sie diesen
 * Parameter auf einen Wert zwischen 1 und 1/32T einstellen, wird das globale
 * Tempo des G-System entsprechend dieser Einstellung geteilt. Dieser geteilte
 * Wert wird für die Geschwindigkeit des Effekts zugrunde gelegt. Bei der
 * Einstellung »Ignore« wird stattdessen die mit dem
 * 
 * Parameter »Speed« angegebene Geschwindigkeit verwendet. Mit dem Parameter
 * »Tap Master« im Utility-Menü geben Sie an, ob bei einem Presetwechsel das
 * globale Tempo oder das mit dem Parameter »Speed« im gewählten Preset
 * festgelegte Tempo verwendet werden soll.
 * 
 * Parameter »Fb« (Feedback) Wertebereich: 0 bis 120 % Mit diesem Parameter
 * legen Sie den Signalanteil fest, der vom Ausgang dieses Effektblocks wieder
 * an seinen Eingang zurückgeleitet wird. Mit dem »Feedback«-Parameter
 * definieren Sie, wie viele Wiederholungen des Signals der Effekt erzeugen
 * soll. Anmerkung: Seien Sie sehr vorsichtig, wenn Sie diesen Parameter auf
 * sehr hohe Werte einstellen. Das G-System hat eine Spillover-Funktion, die das
 * ungehinderte Ausklingen des Delays ermöglicht. Dies bedeutet aber auch, dass
 * es keine unmittelbare Möglichkeit gibt, das Delay abzuschalten, wenn das
 * interne Feedback über 100% liegt. Wenn eine solche interne Rückkopplung
 * auftritt, schalten Sie entweder auf einen anderen Delaytyp um oder wechseln
 * Sie zwei Mal in kurzer Folge zu einem anderen Preset mit Delay.
 * 
 * Parameter »Fblcut« (Feedback LoCut) Wertebereich: 20 Hz bis 20 kHz Verwenden
 * Sie diesen Parameter, um die Frequenzen unter der angegebenen Eckfrequenz
 * abzusenken. Ein im unteren Frequenzbereich etwas »ausgedünntes« Delay lässt
 * sich in der Regel besser in den Gesamtsound integrieren.
 * 
 * Parameter »Fbhcut« (Feedback HiCut) Wertebereich: 20 Hz bis 20 kHz Digitale
 * Signalprozessoren ermöglichen Delays, bei denen jede Wiederholung eine exakte
 * Kopie des Eingangssignals ist. Aber gerade bei langen Delayzeiten ist eine
 * solche Präzision oft gar nicht erwünscht, da allzu deutliche Wiederholungen
 * sich mit dem Originalsignal überlagern. Das Ergebnis ist ein unangenehm
 * »verwaschener« Klang. Um diesen Effekt zu vermeiden, wird ein Highcutfilter
 * eingesetzt, mit dem der »abgerundete« Klang von Bandechos und analogen Delays
 * nachgebildet werden kann.
 * 
 * Der Parameter »Feedback HiCut« dämpft die Frequenzen über der eingestellten
 * Frequenz ab, so dass das Delay weicher und »analoger« klingt und sich besser
 * ins Klangbild einfügt.
 * 
 * Parameter »Mix« Wertebereich: 0 bis 100 % Mit diesem Parameter legen Sie das
 * Mischungsverhältnis zwischen trockenem (unbearbeitetem) Signal und dem Pegel
 * des Effekts für diesen Effektblock fest. 70 EFFEKTE – DELAY
 * 
 * Parameter »OutLev« (Ausgangspegel) Wertebereich: -100 bis 0 dB Mit diesem
 * Parameter legen Sie den gesamten Ausgangspegel für diesen Effekt fest.
 *
 * Parameter »Enable« Wertebereich: »Off« / »On« Mit diesem Parameter legen Sie
 * den Status des Effekts fest (anoder ausgeschaltet). Alle für diesen Effekt
 * vorgenommenen Einstellungen werden auch dann als Bestandteil des Presets
 * gespeichert, wenn der Effekt abgeschaltet wird.
 */