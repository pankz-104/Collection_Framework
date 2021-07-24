package setConcepts;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetConcepts {

	// not synchronized 
	// high performance 
	// faster than HashSet 
	// all methods are implemented using bitwise arithmetic operations.

	enum Lang{
		Java,
		Csharp,
		Javascript,
		Python,
		Ruby
	}
	
	public static void main(String[] args) {			

		EnumSet<Lang> langs = EnumSet.allOf(Lang.class);
		System.out.println(langs);
		
		// creating an empty enum 
		EnumSet<Lang> l = EnumSet.noneOf(Lang.class);
		System.out.println(l);
		
		//range(e1, e2)
		EnumSet<Lang> range = EnumSet.range(Lang.Java, Lang.Python);
		System.out.println(range);
		
		// of : 
		EnumSet<Lang> csharpEnum = EnumSet.of(Lang.Csharp);
		System.out.println(csharpEnum);
		
		EnumSet<Lang> multipleEnum = EnumSet.of(Lang.Javascript, Lang.Ruby);
		System.out.println(multipleEnum);
		
		// add and addAll()
		EnumSet<Lang> lang1 = EnumSet.allOf(Lang.class);
		EnumSet<Lang> lang2 = EnumSet.noneOf(Lang.class);
		
		lang2.add(Lang.Javascript);
		System.out.println(lang2);
		
		lang2.addAll(lang1);
		System.out.println(lang2);
		
		// how to iterate EnumSet : iterator: 
		EnumSet<Lang> fullLang = EnumSet.allOf(Lang.class);
		
		Iterator<Lang> it = fullLang.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
			System.out.print(", ");
		}
		System.out.println();
		// remove() and removeAll()
		fullLang.remove(Lang.Javascript);
		System.out.println(fullLang);
		
		boolean b = fullLang.removeAll(fullLang);
		System.out.println(b);
		
	}
}
