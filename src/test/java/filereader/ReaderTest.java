package filereader;

import java.io.IOException;

import org.junit.Test;

import effect.Effect;
import effect.Reverb;
import gsystem.PRSContent;

public class ReaderTest {

	@Test
	public void test() throws IOException {
		String name = "Scotty's Blues.prs";
		Reader reader = new Reader();

		byte[] prs = reader.readFile("c://temp//effects//" + name);
		int offsetBody = reader.getOffsetStart(prs);
		int a = 0;
	}

	@Test
	public void testPRS() throws IOException {
		String name = "Scotty's Blues.prs";
		name = "Factory Set.sqs";
		PRSContent prsContent = new PRSContent("c://temp//effects//" + name);
		Effect cut = new Effect(new Reverb());
		cut.setWithDataFromPatchName(prsContent.getFromFirstPatchName());
		cut.show();
	}
}
