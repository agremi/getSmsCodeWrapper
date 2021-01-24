package agresti.mirko.wrapper.blackList;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestUsaBlackListUrlCreator {
	BlackListUrlCreator manager;
	
	@Before
	public void setUp() throws Exception {
		manager = new UsaBlackListUrlCreator("myEmail@email.com", "123456", "123", "33313456");
	}

	@Test
	public void testDoCountryBaseUrl() {
		assertEquals("http://api.getsmscode.com/usdo.php", manager.doCountryBaseUrl());
	}
	@Test
	public void testMakeBlackListUrl() {
		assertEquals("http://api.getsmscode.com/usdo.php?action=addblack&username=myEmail@email.com&token=123456&pid=123&mobile=33313456", manager.makeBlackListUrl());
	}

}
