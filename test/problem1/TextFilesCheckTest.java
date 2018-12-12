package problem1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import problem1.TextFiles;

public class TextFilesCheckTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void method_readAndReturnText() {
		try {
			TextFiles.writeText("text.txt");
			String text = TextFiles.readAndReturnText("text.txt");
			String expectedText = "It's a nice day today. Maybe the temperature is going to be above zero. ";
			assertEquals("Expected text has not been read.", expectedText, text);
			File file = new File("text.txt");
			file.delete();
		} catch (IOException e) {
			fail("File read error. Check whether the file with that name exists.");
		}		
	}

	@Test
	public void method_writeTest() {
		try {
			TextFiles.writeText("text2.txt");
			String text = TextFiles.readAndReturnText("text2.txt");
			String expectedText = "It's a nice day today. Maybe the temperature is going to be above zero. ";
			assertEquals("The expected text has not been written.", expectedText, text);			
		} catch (IOException e) {
			fail("File write error. Check whether the file with that name exists.");
		}
	}

}
