package agresti.mirko.wrapper.login;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ChinaLoginAndListTest {
	private LoginUrlCreator creator;
	@Before
	public void setup() {
		creator= new ChinaLoginUrlCreator("myEmail@email.com", "123456");
	}
	@Test
	public void testChinaMakeBaseUrl() {
		assertEquals("http://api.getsmscode.com/do.php",creator.doCountryBaseUrl());
	}
	@Test
	public void testChinaLoginUrlCreator() {
		assertEquals("http://api.getsmscode.com/do.php?action=login&username=myEmail@email.com&token=123456", creator.makeLoginAPIUrl());
	}
	@Test
	public void testChinaListMobiles() {
		assertEquals("http://api.getsmscode.com/do.php?action=mobilelist&username=myEmail@email.com&token=123456",creator.makeListMobileUrl() );
	}

}
