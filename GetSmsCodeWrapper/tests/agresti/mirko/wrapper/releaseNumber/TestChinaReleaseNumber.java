package agresti.mirko.wrapper.releaseNumber;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestChinaReleaseNumber {
	ReleaseNumberUrlCreator manager ;
	@Before
	public void setUp() throws Exception {
		manager = new UsaReleaseNumberUrlCreator("myEmail@email.com", "123456", "123", "33313456");
	}

	@Test
	public void testDoCountryBaseUrl() {
		assertEquals("http://api.getsmscode.com/usdo.php", manager.doCountryBaseUrl());
	}
	@Test
	public void testMakeReleaseNUmberUrlCreator() {
		assertEquals("http://api.getsmscode.com/usdo.php?action=cancelSMSRecv&username=myEmail@email.com&token=123456&pid=123&mobile=33313456", manager.makeReleaseNumberUrl());
	}
}
