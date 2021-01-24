package agresti.mirko.wrapper.getsms;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestChinaGetSmsUrlCreator {
	GetSmsUrlCreator smsGetter;
	
	@Before
	public void setUp(){
		smsGetter= new ChinaGetSmsUrlCreator("myEmail@email.com", "123456", "123", "33313456");
	}
	@Test
	public void testDoCountryBaseUrl() {
		assertEquals("http://api.getsmscode.com/do.php", smsGetter.doCountryBaseUrl());
	}
	@Test
	public void testMakeGetSmsUrl() {
		assertEquals("http://api.getsmscode.com/do.php?action=getsms&username=myEmail@email.com&token=123456&pid=123&mobile=33313456", smsGetter.makeGetSmsUrl());
	}

}
