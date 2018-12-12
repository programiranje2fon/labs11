package problem1;

import java.io.IOException;

public class TextFilesCheck {
	
		public static void main(String[] args) {

			try {
				String tekst = TextFiles.readAndReturnText("text.txt");
				System.out.println(tekst);
			} catch (IOException e) {
				System.out.println("Reading error!");
			}

			
			try {
				TextFiles.writeText("text2.txt");
			} catch (IOException e) {
				System.out.println("Writing error!");
			}
		}
		
	
}
