package unitTests;

import static org.junit.Assert.*;

import org.junit.*;

import workingCode.Host;

public class testHostMethods {


	
	@Test
	public void testGetHostName() {
		Host host = new Host("people.ucalgary.ca:80/~mghaderi/test/a1.pdf");
		String testHostname = "people.ucalgary.ca";
		assertEquals(host.getHostName(),testHostname);
	}
	
	@Test
	public void testSetHostName(){
		Host host = new Host("people.ucalgary.ca:80/~mghaderi/test/a1.pdf");
		String testHostname = "testing";
		host.setHostName(testHostname);
		assertEquals(testHostname,host.getHostName());
	}

}
