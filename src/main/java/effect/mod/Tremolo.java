package effect.mod;

import effect.ParameterTemplate;
import effect.SubEffectTemplate;
import effect.values.Depth;
import effect.values.Freq20Hz220kHz;
import effect.values.OffOn;
import effect.values.OutLev;
import effect.values.Speed;
import effect.values.Tempo;
import effect.values.TremType;
import effect.values.Width;

public class Tremolo extends SubEffectTemplate {
	@Override
	public String getName() {
		return "Tremolo";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		return new ParameterTemplate[] { new ParameterTemplate("Speed", 24, new Speed()),
				new ParameterTemplate("Tempo", 18, new Tempo()), new ParameterTemplate("Depth", 30, new Depth()),
				new ParameterTemplate("Trem Type", 36, new TremType()), new ParameterTemplate("Width", 42, new Width()),
				new ParameterTemplate("Hi Cut", 48, new Freq20Hz220kHz()), new ParameterTemplate("OutLev", 60, new OutLev()),
				new ParameterTemplate("Enable", 6, new OffOn()) };

	}
}

/*
 * Ein Tremolo entsteht durch die zyklische Modulation des Signalpegels mit
 * einem LFO. Mit dem G-System k�nnen Sie verschiedene Variationen dieses
 * Effekts realisieren � von weich und subtil bis hart und aggressiv.
 * 
 * Parameter �Speed� Werte: 0,050Hz bis 20 kHz Mit diesem Parameter legen Sie
 * die Geschwindigkeit des Effekts fest.
 * 
 * Parameter �Tempo� Werte: �Ignore�, 1 bis 1/32T Wenn Sie diesen Parameter auf
 * einen Wert zwischen 1 und 1/32T einstellen, wird das globale Tempo des
 * G-System entsprechend dieser Einstellung geteilt. Dieser geteilte Wert wird
 * f�r die Geschwindigkeit des Effekts zugrunde gelegt. Bei der Einstellung
 * �Ignore� wird stattdessen die mit dem Parameter �Speed� angegebene
 * Geschwindigkeit verwendet. Mit dem Parameter �Tap Master� im Utility-Men�
 * geben Sie an, ob bei einem Presetwechsel das globale Tempo oder das mit dem
 * Parameter �Speed� im gew�hlten Preset festgelegte Tempo verwendet werden
 * soll.
 * 
 * Parameter �Depth� Werte: 0 bis 100 % Mit diesem Parameter legen Sie die
 * Intensit�t des Effekts fest. Bei einer Einstellung von 100 % wird das Signal
 * zwischen den Pegelspitzen v�llig stumm geschaltet.
 * 
 * Parameter �Type� Werte: �Soft� oder �Hard� (Sinus oder Rechteckwelle) Sie
 * k�nnen als Modulationsquelle f�r den Tremolo-Effekt eine dieser beiden
 * Wellenformen verwenden. Bei der Einstellung �Hard� ist der Effekt deutlicher.
 * Probieren Sie am Besten beide Varianten aus. Sinuswelle Rechteckwelle
 * 
 * 
 * Parameter �Width� Werte: 0 bis 100 % Mit diesem Parameter legen Sie das
 * Verh�ltnis zwischen dem oberen und dem unteren Teil der f�r die Modulation
 * verwendeten Wellenform (die Pulsbreite) fest. Bei einer Einstellung von 20 %
 * und der Einstellung �Hard� f�r den Parameter �Type� ist das Signal f�r 80 %
 * eines Durchgangs h�rbar. Wenn Sie den Parameter �Type� auf �Soft� einstellen,
 * erzeugt die �Width�-Einstellung �50 %� eine vollst�ndige Sinuswelle, w�hrend
 * die Einstellungen �0%� und �100 %� entsprechend s�gezahnartige Wellenformen
 * erzeugen. Pulsbreite
 * 
 * Parameter �HiCut� Werte: 20 Hz bis 20 kHz Dieser Parameter reduziert den
 * Anteil hoher Frequenzen am Tremoloeffekt. Verwenden Sie den Highcutfilter, um
 * den Effekt etwas abzuschw�chen, ohne seine Intensit�t (mit dem Parameter
 * �Depth�) zu �ndern.
 * 
 * Parameter �OutLev� (Ausgangspegel) Wertebereich: -100 bis 0 dB Mit diesem
 * Parameter legen Sie den gesamten Ausgangspegel f�r diesen Effekt fest.
 * 
 * Parameter �Enable� Werte: �Off� / �On� Mit diesem Parameter legen Sie den
 * Status des Effekts fest (anoder ausgeschaltet). Alle f�r diesen Effekt
 * vorgenommenen Einstellungen werden auch dann als Bestandteil des Presets
 * gespeichert, wenn der Effekt abgeschaltet wird.
 */
