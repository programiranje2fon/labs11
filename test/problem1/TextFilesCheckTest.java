package problem1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

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
			String text = TextFiles.readAndReturnText("text.txt");
			String expectedText ="This is some text in the file. This text should be red and written on the screen. ";
			assertEquals("Expected text has not been read.", expectedText, text);
		} catch (IOException e) {
			fail("File read error. Check whether the file with that name exists.");
		}		
	}

	@Test
	public void method_writeTest() {
		try {
			TextFiles.returnText("text2.txt");
			String text = TextFiles.readAndReturnText("text2.txt");
			String expectedText = "It's a nice day today. Maybe the temperature is going to be above zero. ";
			assertEquals("The expected text has not been written.", expectedText, text);			
		} catch (IOException e) {
			fail("File write error. Check whether the file with that name exists.");
		}
	}

}
