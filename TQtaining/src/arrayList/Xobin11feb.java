package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Xobin11feb {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> excer=new ArrayList<Integer>();
		for(int i=0;i<10;i++)
		{    
			System.out.println("Enter the Element");
			excer.add(sc.nextInt());
		}

		
		for(int i=0;i<excer.size();i++)
		{   
			for(int j=i+1;j<excer.size();j++)
			{
			if(excer.get(i).equals(excer.get(j)))
			{
				excer.remove(j);
				j--;
			}
			}
			
		}
		for(int l:excer)
		{
		System.out.print(l+" ");
		}

	}

}
