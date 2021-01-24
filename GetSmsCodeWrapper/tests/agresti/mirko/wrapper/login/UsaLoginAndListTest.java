package agresti.mirko.wrapper.login;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UsaLoginAndListTest {
	private LoginUrlCreator creator;
	
	@Before
	public void setup() {
		creator= new UsaLoginUrlCreator("myEmail@email.com", "123456");
	}
	@Test
	public void testUsaDoCountryBaseURl() {
		assertEquals("http://api.getsmscode.com/usdo.php", creator.doCountryBaseUrl());
	}
	@Test
	public void testUsaLoginUrlCreator() {
		assertEquals("http://api.getsmscode.com/usdo.php?action=login&username=myEmail@email.com&token=123456", creator.makeLoginAPIUrl());
	}
	@Test
	public void testUsaListMobiles() {
		assertEquals("http://api.getsmscode.com/usdo.php?action=mobilelist&username=myEmail@email.com&token=123456", creator.makeListMobileUrl());
	}

}
