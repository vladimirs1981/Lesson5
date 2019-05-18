package optional;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TeaPartyTest {
	
	@Test
	public void test() {
		TeaParty teaParty = new TeaParty();
		String greeting = teaParty.welcome(null, false, false);
		assertEquals("Hello Ms. Austen", teaParty.welcome("Austen", true, false));
		assertEquals("Hello Mr. Orwell", teaParty.welcome("Orwell", false, false));
		assertEquals("Hello Sir Newton", teaParty.welcome("Newton", false, true));
	}
}
