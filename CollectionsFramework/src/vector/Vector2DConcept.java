package vector;

import java.util.*;

public class Vector2DConcept {
	public static void main(String [] args) {
		
		
		Vector<String> lang = new Vector<String>();
		lang.add("Python");
		lang.add("Java");
		lang.add("ruby");
		lang.add("javascript");
		lang.add("C#");
		
		Vector osVector = new Vector();
		osVector.add(lang);
		
		for(int i=0; i<lang.size(); i++) {
			String str = (String)((Vector)osVector.get(0)).get(i);
			System.out.println(str);
		}
	}
}
