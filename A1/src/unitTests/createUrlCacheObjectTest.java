package unitTests;

import static org.junit.Assert.*;

import java.io.*;
import org.junit.*;

import workingCode.IOUtility;
import workingCode.UrlCache;
import workingCode.UrlCacheException;

public class createUrlCacheObjectTest {

	@After 
	public void tearDown(){
		String catalogFilePath = "catalog.txt";
		File catalogFile = new File(catalogFilePath);
		
		try{
			catalogFile.delete();
		}
		catch(Exception e){}
	}
	
	@Test
	public void testIfCacheExists()
	{
		try{
			UrlCache urlCache = new UrlCache();
		}
		catch(Exception e){}
		IOUtility ioUtil = new IOUtility();
		boolean cacheExists = true;
		
		cacheExists = ioUtil.checkLocalCache();
		
		
		assertEquals(cacheExists,true);
	}
	
	

}
