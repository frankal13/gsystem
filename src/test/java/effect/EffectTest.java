package effect;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

import gsystem.PRSContent;

/**
 * Test Effects: Used to check the prs file offsets/parameter mapping of the
 * individual effects
 * 
 * @author frank
 *
 */
public class EffectTest {

	@Test
	public void testEffect() throws IOException {
		testList(new Modulation(), "f0", "f1", "f2");
	}

	private void testList(EffectTemplate effect, String... names) throws IOException {
		Effect cut = new Effect(effect);
		for (String name : names) {
			Path filePath = Paths.get("src", "test", "resources", name + ".prs");
			PRSContent prsContent = new PRSContent(Files.readAllBytes(filePath));
			cut.setWithDataFromPatchName(prsContent.getFromFirstPatchName());
			cut.show();
		}
	}

}
