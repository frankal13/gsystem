package effect.compressor;

import effect.ParameterTemplate;
import effect.filter.SubEffectFilter;
import effect.values.Attack;
import effect.values.Gain;
import effect.values.OffOn;
import effect.values.Ratio;
import effect.values.Release;
import effect.values.Threshold;

public class AdvancedCompressor extends SubEffectFilter {

	@Override
	public String getName() {
		return "Advanced Compressor";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		return new ParameterTemplate[] { new ParameterTemplate("Threshhold", 12, new Threshold()),
				new ParameterTemplate("Ratio", 18, new Ratio()), new ParameterTemplate("Attack", 24, new Attack()),
				new ParameterTemplate("Release", 30, new Release(), 13), new ParameterTemplate("Gain", 36, new Gain()),
				new ParameterTemplate("Enable", 6, new OffOn()) };
//				new ParameterTemplate("Mid", 30, new LMH()), new ParameterTemplate("High", 36, new LMH()),
//				new ParameterTemplate("Sweep", 42), new ParameterTemplate("Speed", 36, new Speed()),
//				new ParameterTemplate("Tempo", 18, new Tempo()), new ParameterTemplate("LFO Shape", 42, new Shape()),
//				new ParameterTemplate("Bright", 48), new ParameterTemplate("Sense", 60),
//				new ParameterTemplate("Response", 66, new Response()), new ParameterTemplate("Resonance", 54),
//				new ParameterTemplate("OutLev", 84, new OutLev()), new ParameterTemplate("Enable", 6, new Enable()) };
	}
}

/*
 * Auto Formant-Filter – zusätzliche Parameter
 * 
 * Parameter »Speed« Wertebereich: 0,050 bis 20 Hz Mit diesem Parameter legen
 * Sie die Geschwindigkeit des Effekts fest.
 * 
 * Parameter »Tempo« Wertebereich: »Ignore«, 1 bis 1/32T Wenn Sie diesen
 * Parameter auf einen Wert zwischen 1 und 1/32T einstellen, wird das globale
 * Tempo des G-System entsprechend dieser Einstellung geteilt. Dieser geteilte
 * Wert wird für die Geschwindigkeit des Effekts zugrunde gelegt. Bei der
 * Einstellung »Ignore« wird stattdessen die mit dem
 * 
 * Parameter »Speed« angegebene Geschwindigkeit verwendet.
 * 
 * Parameter »LFO Shape« Werte: »Triangle« oder »Sine« Mit diesem Parameter
 * legen Sie die Wellenform für die von diesem Effekt durchgeführte
 * Frequenzanhebung fest.
 * 
 * Parameter »Bright« Wertebereich:* 0 bis 100 % Je nach Einstellung der
 * Parameter »Low«, »Mid« und »High« müssen Sie gegebenenfalls mit diesem
 * Parameter den oberen Frequenzbereich des Effekts mit diesem Parameter
 * justieren.
 * 
 */
