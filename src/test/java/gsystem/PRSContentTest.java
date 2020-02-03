package gsystem;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

public class PRSContentTest {

	@Test
	public void test() throws IOException {
		Path prsFile = Paths.get("src", "test", "resources", "abcd.prs");
		PRSContent cut = new PRSContent(Files.readAllBytes(prsFile));
		assertNotNull(cut.getName());

		Preset preset = new Preset();
		preset.setFromPrsContent(cut);
		preset.show();
	}

}
