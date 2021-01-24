package agresti.mirko.wrapper.blackList;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestChinaBackListUrlCreator {
	BlackListUrlCreator manager;
	
	@Before
	public void setUp(){
		manager = new ChinaBlackListUrlCreator("myEmail@email.com", "123456", "123", "33313456");
	}

	@Test
	public void testDoCountryBaseUrl() {
		assertEquals("http://api.getsmscode.com/do.php", manager.doCountryBaseUrl());
	}
	@Test
	public void testUsaMakeBlackListUrl() {
		assertEquals("http://api.getsmscode.com/do.php?action=addblack&username=myEmail@email.com&token=123456&pid=123&mobile=33313456", manager.makeBlackListUrl());
	}

}
