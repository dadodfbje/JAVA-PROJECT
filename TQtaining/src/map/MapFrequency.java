package map;
import java.util.*;
public class MapFrequency {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Character> excer=new ArrayList<>();
		HashMap<Character,Integer> excer1=new HashMap<>();
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the Character");
		   excer.add(sc.next().charAt(0));
		}
		
		Iterator<Character> it=excer.iterator();
		while(it.hasNext())
		{    
			int count=1;
			Character ch=it.next();
			if(!excer1.containsKey(ch))
			{
			    excer1.put(ch, count);
			}else {
				count=excer1.get(ch);
				count=count+1;
				excer1.put(ch, count);
			}
		
			
		}	System.out.println(excer1);

	}

}
