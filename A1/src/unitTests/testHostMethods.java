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

	/*public String getPath() {
		return path;
	}

	public void setPath(String pth) {
		this.path = pth;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String file) {
		this.fileName = file;
	}

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
