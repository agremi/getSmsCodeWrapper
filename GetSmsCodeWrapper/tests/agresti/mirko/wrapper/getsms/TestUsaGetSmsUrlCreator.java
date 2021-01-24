package agresti.mirko.wrapper.getsms;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestUsaGetSmsUrlCreator {
	GetSmsUrlCreator smsGetter;
	@Before
	public void setUp() throws Exception {
		smsGetter=  new UsaGetSmsUrlCreator("myEmail@email.com", "123456", "123", "33313456");
	}
	@Test
	public void testDoCountryBaseUrl() {
		assertEquals("http://api.getsmscode.com/usdo.php", smsGetter.doCountryBaseUrl());
	}
	@Test
	public void testMakeGetSmsUrlCreator() {
		assertEquals("http://api.getsmscode.com/usdo.php?action=getsms&username=myEmail@email.com&token=123456&pid=123&mobile=33313456", smsGetter.makeGetSmsUrl());
	}

}
