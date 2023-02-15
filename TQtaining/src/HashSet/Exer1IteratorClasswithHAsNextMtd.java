package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Exer1IteratorClasswithHAsNextMtd {

	public static void main(String[] args) {
		HashSet<String> fi=new HashSet<String>();
		fi.add("USA");
		fi.add("UK");
		fi.add("INDIA");
		fi.add("INDIA");
		 Iterator<String> i=fi.iterator();
        
         System.out.println( i.next());
         System.out.println( i.next());
         System.out.println( i.next());
      //   System.out.println( i.next());
         System.out.println( i.hasNext());
	}

}
