package problem1;

import java.io.*;



public class TextFiles {
	
	public static String readReturnText(String fileName) throws IOException {
			BufferedReader in = new BufferedReader(new FileReader(fileName));
			boolean end = false;
			String s = "";
			while (!end) {
				String l = in.readLine();
				if (l == null)
					end = true;
				else
					s = s + l + " ";
			}
			in.close();
			
			return s;
	}

	public static void returnText(String fileName) throws IOException {
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
			out.println("It's a nice day today.");
			out.println("Maybe the temperature is going to be above zero.");
			out.close();
	}
	

}
