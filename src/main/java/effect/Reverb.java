package effect;

import effect.reverb.Hall;
import effect.reverb.Plate;
import effect.reverb.Room;
import effect.reverb.Spring;

public class Reverb extends EffectTemplate {

	@Override
	public String getEffectName() {
		return "Reverb";
	}

	@Override
	public int getEffectOffset() {
		return 0x1b0; // 0x1c8;
	}

	@Override
	public int getSubEffectIdOffset() {
		return 0;
	}

	@Override
	public SubEffectTemplate[] getSubEffects() {
		return new SubEffectTemplate[] { new Spring(), new Hall(), new Room(), new Plate() };
	}

}
/*
 * Allgemeine Reverbparameter Parameter �Decay� (Hallzeit) Wertebereich: 0,1 bis
 * 20 Sekunden Mit diesem Parameter legen Sie die Dauer der Hallfahne fest. Die
 * L�nge der Hallfahne ist definiert als die Zeit, in der der Pegel des
 * Diffusfeldes um etwa 60 dB f�llt. 73 DEUTSCH EFFEKTE � REVERB & EQ Mit den
 * beiden �Color�-Parametern k�nnen Sie den Klangcharakter des gew�hlten
 * Reverbtyps deutlich ver�ndern � von �d�ster� und �ambient� bis zu �strahlend�
 * und �hell�. Parameter �Hi Lev� und �Lo Lev� (High Level/Low Level)
 * Wertebereich: -25 bis 25 Verwenden Sie die Parameter �Hi Lev�, um die mit �Hi
 * Color� gew�hlte Charakteristik f�r den oberen Frequenzbereich zu betonen oder
 * abzuschw�chen. Verwenden Sie �Lo Lev� entsprechend zum Betonen oder
 * Abschw�chen von �Lo Color�. Parameter �Early� Wertebereich: -100 bis 0 dB Mit
 * diesem Parameter legen Sie den Pegel der Erstreflexionen des Reverbs fest.
 * Parameter �RevLev� (Reverb Level) Wertebereich: -100 bis 0 dB Mit diesem
 * Parameter legen Sie den Pegel des Diffusfeldes (der Hallfahne) fest.
 * Parameter �Diff� (Diffuse) Wertebereich: -25 bis 25 Mit diesem Parameter
 * k�nnen Sie die die Dichte des Diffusfeldes (der Hallfahne) justieren. Dieser
 * Parameter erm�glicht es Ihnen, das unerw�nschte �Fluttering� der Hallfahne
 * auf ein absolutes Minimum zu begrenzen. Er wird automatisch eingestellt, wenn
 * Sie den Parameter �Decay� einstellen. Parameter �Mix� Werte: 0 bis 100 % Mit
 * diesem Parameter legen Sie das Mischungsverh�ltnis zwischen trockenem
 * (unbearbeitetem) Signal und dem Pegel des Effekts f�r diesen Effektblock
 * fest. Parameter �OutLev� (Ausgangspegel) Wertebereich: -100 bis 0 dB Mit
 * diesem Parameter legen Sie den gesamten Ausgangspegel f�r diesen Effektblock
 * fest. Parameter �Enable� Wertebereich: �Off� / �On� Mit diesem Parameter
 * legen Sie den Status des Effekts fest (anoder ausgeschaltet). Alle f�r diesen
 * Effekt vorgenommenen Einstellungen werden auch dann als Bestandteil des
 * Presets gespeichert, wenn der Effekt abgeschaltet wird.
 */
