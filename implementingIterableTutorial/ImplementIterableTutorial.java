package implementingIterableTutorial;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ImplementIterableTutorial {

	public static void main(String[] args) {
		URLLibrarry lib1 = new URLLibrarry();
		for (String html : lib1) {
			//System.out.println(html.length());
			
			try (PrintWriter out = new PrintWriter("Examplewor.html")) {
				out.println(html);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println(html);
		}
	}

}
