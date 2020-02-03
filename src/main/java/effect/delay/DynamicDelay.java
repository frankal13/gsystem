package effect.delay;

import effect.ParameterTemplate;
import effect.SubEffectTemplate;
import effect.values.Damping;
import effect.values.DelayTime;
import effect.values.DynamicDelayRelease;
import effect.values.Freq20Hz220kHz;
import effect.values.OffOn;
import effect.values.Offset;
import effect.values.OutLev;
import effect.values.Sense;
import effect.values.SingleDelayFeedback;
import effect.values.SingleDelayTempo;

public class DynamicDelay extends SubEffectTemplate {
	@Override
	public String getName() {
		return "Dynamic Delay";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		return new ParameterTemplate[] { new ParameterTemplate("Delaytime", 12, 4, new DelayTime()),
				new ParameterTemplate("Tempo", 30, new SingleDelayTempo()),
				new ParameterTemplate("Offset", 132, new Offset()),
				new ParameterTemplate("Feedback", 54, new SingleDelayFeedback()),
				new ParameterTemplate("FB LowCut", 96, new Freq20Hz220kHz()),
				new ParameterTemplate("FB HiCut", 90, new Freq20Hz220kHz()),
				new ParameterTemplate("Sense", 138, new Sense()), new ParameterTemplate("Damping", 144, new Damping()),
				new ParameterTemplate("Release", 150, 4, new DynamicDelayRelease()), new ParameterTemplate("Mix", 114),
				new ParameterTemplate("OutLev", 120, new OutLev()), new ParameterTemplate("Enable", 6, new OffOn()) };
	}
}
/*
 * Dynamic Delay Die »Dynamic Delay«-Funktion wurde erstmals im TC 2290 Studio
 * Delay realisiert, einem klassischen Studiodelay. Sie ermöglicht die Steuerung
 * des Delay-Ausgangspegels durch die Dynamik des Eingangssignals, so dass die
 * Wiederholungen – statt den gefürchteten »Sound-Matsch« zu erzeugen – das
 * Spiel des Musikers perfekt ergänzen. Mit dem »Sense«-Parameter geben Sie an,
 * wann die Delays wieder hörbar werden sollten. Verwenden Sie den
 * »Offset«Parameter, um das Stereoklangbild zu erweitern. Neben den
 * »allgemeinen« Parametern, die in der Einleitung des Abschnitts über den
 * Delayeffekt beschrieben werden, ist dieses Delay außerdem mit den folgenden
 * Parametern ausgestattet:
 * 
 * Parameter »Offset« Werte: -200 bis 200 Dieser Parameter versetzt die
 * Wiederholungen im rechten Kanal zeitlich gegenüber dem linken Kanal. Um einen
 * überzeugenden Stereoeffekt zu erhalten, sollten die Wiederholungen in den
 * beiden Kanälen nicht zur gleichen Zeit hörbar werden. Um den Klang räumlicher
 * wirken zu lassen, reicht bereits eine Verschiebung von wenigen Millisekunden.
 * Bei höheren Werten entstehen so genannte Slapback-Effekte und andere
 * interessante Variationen.
 * 
 * Parameter »Sense « (Empfindlichkeit) Wertebereich: 0 bis 10 Der Parameter
 * »Sensitivity« legt fest, wann die vom Delay erzeugten Wiederholungen hörbar
 * werden sollen. Die Lautstärke der Wiederholungen steht in direktem Verhältnis
 * zum Pegel am Eingang des Effekts. Dieser Parameter hat also die Funktion
 * eines Schwellwerts, der die Lautstärke des Delays in Abhängigkeit vom Pegel
 * am Eingang regelt.
 * 
 * Parameter »Damp« Wertebereich: 0 bis 100 dB Wie in der Einleitung erklärt
 * wurde, senkt das Dynamic Delay die Pegel der Wiederholungen auf der Grundlage
 * des Eingangspegels. Mit dem »Damp«-Parameter geben Sie an, wie stark das
 * Delay abgesenkt werden soll.
 * 
 * Parameter »Rel« (Release) Wertebereich: 20 bis 1000 ms Mit diesem Parameter
 * geben Sie an, wie schnell die Absenkung des Delaypegels wieder aufgehoben
 * werden soll.
 */