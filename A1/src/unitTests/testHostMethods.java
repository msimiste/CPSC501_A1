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
	
	@Test
	public void testGetPort() {
		Host host = new Host("people.ucalgary.ca:80/~mghaderi/test/a1.pdf");
		int testPort = 80;
		assertEquals(testPort,host.getPort());
	}

	@Test
	public void testSetPort() {
		Host host = new Host("people.ucalgary.ca:80/~mghaderi/test/a1.pdf");
		int testPort = 9001;
		host.setPort(testPort);
		assertEquals(host.getPort(),testPort);		
	}

	@Test
	public void testGetPath() {
		Host host = new Host("people.ucalgary.ca:80/~mghaderi/test/a1.pdf");
		String testPath = "/~mghaderi/test"; 
		assertEquals(testPath,host.getPath());
	}

	@Test
	public void testSetPath() {
		Host host = new Host("people.ucalgary.ca:80/~mghaderi/test/a1.pdf");
		String testPath = "testing/this/path/out";
		host.setPath(testPath);
		assertEquals(host.getPath(),"testing/this/path/out");
	}

	@Test
	public void testGetFileName() {
		Host host = new Host("people.ucalgary.ca:80/~mghaderi/test/a1.pdf");
		String fileName = "a1.pdf";
		assertEquals(host.getFileName(),fileName);
	}

	@Test
	public void testSetFileName() {
		Host host = new Host("people.ucalgary.ca:80/~mghaderi/test/a1.pdf");
		String fileName = "testingFile.txt";
		host.setFileName(fileName);
		assertEquals(host.getFileName(),"testingFile.txt");
	}
/*
	public String getConcatPath() {
		return concatPath;
	}

	public void setConcatPath(String cPath) {
		this.concatPath = cPath;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String urlToSet) {
		this.url = urlToSet;
	}

*/
}
