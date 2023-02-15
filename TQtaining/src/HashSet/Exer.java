package HashSet;

import java.util.HashSet;

public class Exer {

	public static void main(String[] args) {
		//HAshSEt does not accept Duplicate Elements
		HashSet<String> fi=new HashSet<String>();
		fi.add("USA");
		fi.add("UK");
		fi.add("INDIA");
		fi.add("INDIA");
     System.out.println(fi.size());
	}

}
