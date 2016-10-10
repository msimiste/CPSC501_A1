package unitTests;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.*;

import workingCode.UrlCache;
import workingCode.UrlCacheException;

public class testUrlCacheMethods {

	UrlCache urlCache;
	
	@Before
	public void setUp(){
		try {
			urlCache = new UrlCache();
		} catch (UrlCacheException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@After
	public void tearDown(){
		String testFilePath = "people.ucalgary.ca/~mghaderi/test/uc.gif";
		File testFile = new File(testFilePath);
		File parent = new File("people.ucalgary.ca/~mghaderi/test");
		File grandParent  = new File("people.ucalgary.ca/~mghaderi");
		File gGrandParent = new File("people.ucalgary.ca");	
				
		if(testFile.exists()){
			testFile.delete();
			parent.delete();
			grandParent.delete();
			gGrandParent.delete();				
		}		
	}
	
	
	@Test (expected = UrlCacheException.class)
	public void testGetObjectForUrlCacheException() throws UrlCacheException{
		String testUrlString = "www.iconfinder.com/404notfound";		
		urlCache.getObject(testUrlString);	
	}
	
	@Test
	public void testGetObject() {
		String testUrlString = "people.ucalgary.ca:80/~mghaderi/test/uc.gif";
		try {
			urlCache.getObject(testUrlString);
		} catch (UrlCacheException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		String testFilePath = "people.ucalgary.ca/~mghaderi/test/uc.gif";
		File testFile = new File(testFilePath);
		assertEquals(true,testFile.exists());
		
	}
	@Test
	public void testBeginDownloadStream() {
		String testUrlString = "people.ucalgary.ca:80/~mghaderi/test/a1.pdf";
	}

}