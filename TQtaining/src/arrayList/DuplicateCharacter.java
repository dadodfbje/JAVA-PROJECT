package arrayList;
import java .util.*;
public class DuplicateCharacter {
	/*Create arraylist of characters. Remove duplicate characters from the list.
	E.g. list – { ‘d’ , ‘g’ , ‘h’ , ‘d’ , ‘d’ . ‘h’ , ‘g’}Output should be {‘d’ , ‘g’ , ‘h’}*/
	public static void main(String[] args) {
		List<Character> excer=new ArrayList<Character>();
		excer.add('d');
		excer.add('g');
		excer.add('h');
		excer.add('d');
		excer.add('d');
		excer.add('h');
		excer.add('g');
	

		System.out.println("Before Remove Duplicate elements:"+excer);
		 
		for(int i=0;i<excer.size();i++){
		 
		 for(int j=i+1;j<excer.size();j++){
		            if(excer.get(i).equals(excer.get(j))){
		                excer.remove(j);
		                j--;
		            }
		    }
		 
		 }
		 
		    System.out.println("After Removing duplicate elements:"+excer);
			

	}

}
