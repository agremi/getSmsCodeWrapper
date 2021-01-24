package agresti.mirko.wrapper.getNumber;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ChinaGetNumberUrlCreatorTest {
	GetNumberUrlCreator getter;
	@Before
	public void setup() {
		getter= new ChinaGetNumberUrlCreator("myEmail@email.com", "123456", "1");
	}
	@Test
	public void testMakeGetNumberUrl() {
		assertEquals("http://api.getsmscode.com/do.php?action=getmobile&username=myEmail@email.com&token=123456&pid=1", getter.makeGetNumberUrl());
	}
	@Test
	public void testDoCountryBaseUrl() {
		assertEquals("http://api.getsmscode.com/do.php", getter.doCountryBaseUrl());
	}

}
