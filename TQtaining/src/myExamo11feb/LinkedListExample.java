package myExamo11feb;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
	    LinkedList<Character> chlist=new LinkedList<>();
	    chlist.add('S');
	    chlist.add(0,'X');
	    chlist.push('e');
	    chlist.addLast('G');
	    for(int i=0;i<chlist.size();i+=2)
	    {
	    	System.out.println(chlist.element());
	    }

	}

}
