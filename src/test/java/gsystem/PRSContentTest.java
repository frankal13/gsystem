package gsystem;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.junit.Test;

public class PRSContentTest {

	@Test
	public void test() throws IOException {
		PRSContent cut = new PRSContent("C://temp//effects/abct.prs");
		String name = cut.getName();
		assertNotNull(name);

		Preset preset = new Preset();
		preset.setFromPrsContent(cut);
		preset.show();
	}

}
