package effect.compressor;

import effect.ParameterTemplate;
import effect.filter.SubEffectFilter;
import effect.values.Gain;
import effect.values.OffOn;

public class PercusiveCompressor extends SubEffectFilter {

	@Override
	public String getName() {
		return "Percusive Compressor";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		return new ParameterTemplate[] { new ParameterTemplate("Drive", 42), new ParameterTemplate("Response", 48),
				new ParameterTemplate("Gain", 36, new Gain()), new ParameterTemplate("Enable", 6, new OffOn()) };
	}
}
/*
 * Parameter �Drive� Wertebereich: 1 bis 20 Mit diesem Parameter legen Sie die
 * Kompressionsintensit�t fest. Er stellt eine Kombination der arameter
 * �Threshold� (Grenzwert) und �Ratio� (Kompressionsverh�ltnis) dar. Obwohl
 * dieser Modus �ber eine automatische Pegelkorrektur (Auto Make-up Gain)
 * verf�gt, kann es bei extremen Einstellungen dennoch erforderlich sein, den
 * Pegel mit dem �Gain�Parameter zu justieren.
 * 
 * Parameter �Response� Wertebereich: 1 bis 10 Dies ist die Zeit, die der
 * Kompressor ben�tigt, um die Absenkung des Pegels wieder aufzuheben. Je
 * niedriger Sie diesen Parameter einstellen, umso deutlicher ist der Effekt des
 * Kompressors zu h�ren.
 * 
 * Parameter �Gain� Werte: -12 bis +12dB Je nach Einstellung der Parameter
 * �Drive� und �Response� m�ssen Sie den Pegel gegebenenfalls mit dem Parameter
 * �Gain� nachregeln.
 * 
 * Parameter �Enable� Werte: �Off� / �On� Mit diesem Parameter legen Sie den
 * Status des Effekts fest (anoder ausgeschaltet). Alle f�r diesen Effekt
 * vorgenommenen Einstellungen werden auch dann als Bestandteil des Presets
 * gespeichert, wenn der Effekt abgeschaltet wird.
 * 
 */