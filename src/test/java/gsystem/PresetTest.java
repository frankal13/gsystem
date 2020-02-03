package gsystem;

import java.io.IOException;

import org.junit.Test;

public class PresetTest {

	private static String PATH = "C:\\Users\\frank\\Documents\\Psicraft\\Vyzor G-System\\TC Electronic G-System\\";
	private static String PATH2 = "C://temp//effects//";

	@Test
	public void test() throws IOException {
		Preset cut = new Preset();
		cut.setFromPrsContent(new PRSContent("C://temp//effects//t147500.prs"));
		cut.show();
		cut.setFromPrsContent(new PRSContent("C://temp//effects//t120500.prs"));
		cut.show();
	}

//	@Test
//	public void testTempo() throws IOException {
//		testLoop("x200", "x201", "x202", "x203", "x204", "x205", "x206", "x207", "x208", "x209", "x210", "x609", "x577",
//				"x999", "b300", "b059");
//	}

	@Test
	public void testLoops() throws IOException {
		testLoop("l0000", "l01000", "l00100", "l00010", "l00001");
	}

	private void testLoop(String... names) throws IOException {
		Preset cut = new Preset();
		for (String name : names) {
			cut.setFromPrsContent(new PRSContent(PATH + name + ".prs"));
			System.out.println(cut.getLoops().getLoop1() + ", " + cut.getLoops().getLoop2() + ", "
					+ cut.getLoops().getLoop3() + ", " + cut.getLoops().getLoop4() + ", " + cut.getLoops().getInsert());
		}
	}

	@Test
	public void testBoosts() throws IOException {
		testBoost("b0", "b5");
	}

	private void testBoost(String... names) throws IOException {
		Preset cut = new Preset();
		for (String name : names) {
			cut.setFromPrsContent(new PRSContent(PATH + name + ".prs"));
			System.out.println(name + ":" + cut.getBoost());
		}
	}

	@Test
	public void testRelays() throws IOException {
		testRelay("ra0000", "racccc", "ra0cc0", "rb0000", "rb0c0c", "rbcc00", "b1", "b2", "b3", "b10", "b11", "b15");
	}

	private void testRelay(String... names) throws IOException {
		Preset cut = new Preset();
		for (String name : names) {
			cut.setFromPrsContent(new PRSContent(PATH + name + ".prs"));
			System.out.println(name + ":" + cut.getRelay());
		}
	}

}
