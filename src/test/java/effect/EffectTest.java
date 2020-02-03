package effect;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

import gsystem.PRSContent;

public class EffectTest {

	@BeforeClass
	public static void beforeAllTestMethods() {
	}

	@Test
	public void testEffect() throws IOException {
		testList(new Modulation(), "f0", "f1", "f2");
		// "allof2", "allof3", "allof4", "allof5", "allof6", "allof7", "allof8",
		// "allof9", "allo10", "allo11");
//		testList(new Compressor(), "alloff", "compon", "allof2", "allof3", "allof4", "allof5", "allof6", "allof7",
//				"allof8", "allof9", "allo10", "allo11");
//		testList(new Delay(), "alloff", "delaon", "allof2", "allof3", "allof4", "allof5", "allof6", "allof7", "allof8",
//				"allof9", "allo10", "allo11");
//		testList(new Reverb(), "alloff", "reveon", "allof2", "allof3", "allof4", "allof5", "allof6", "allof7", "allof8",
//				"allof9", "allo10", "allo11");
//		testList(new Pitch(), "alloff", "pitcon", "allof2", "allof3", "allof4", "allof5");
//		testList(new NoiseGate(), "alloff", "nogaon");
//		Effect cut = new Effect(new Filter());
//		cut.setFromPrsFile("c://temp//filter//R01.prs");
//		cut.show();
//		cut.setFromPrsFile("c://temp//filter//R35.prs");
//		cut.show();
//		cut.setFromPrsFile("c://temp//filter//R75.prs");
//		cut.show();
//		cut.setFromPrsFile("c://temp//filter//R99.prs");
//		cut.show();
	}

	private void testList(EffectTemplate effect, String... names) throws IOException {
		Effect cut = new Effect(effect);
		for (String name : names) {
			PRSContent prsContent = new PRSContent("c://temp//effects//" + name + ".prs");
			cut.setWithDataFromPatchName(prsContent.getFromFirstPatchName());
			cut.show();
		}
	}

}
