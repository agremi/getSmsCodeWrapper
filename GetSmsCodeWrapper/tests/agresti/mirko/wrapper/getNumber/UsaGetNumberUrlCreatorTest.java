package agresti.mirko.wrapper.getNumber;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UsaGetNumberUrlCreatorTest {
	GetNumberUrlCreator getter;
	@Before
	public void setup() {
		getter= new UsaGetNumberUrlCreator("myEmail@email.com","123456","1");
	}
	@Test
	public void testMakeGetNUmberUrl() {
		assertEquals("http://api.getsmscode.com/usdo.php?action=getmobile&username=myEmail@email.com&token=123456&pid=1",getter.makeGetNumberUrl() );
	}
	@Test
	public void testDoCountryBaseUrl() {
		assertEquals("http://api.getsmscode.com/usdo.php", getter.doCountryBaseUrl());
	}
}
