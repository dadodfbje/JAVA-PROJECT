package string;

import java.util.Arrays;

public class WithoutSplit {

	public static void main(String[] args) {						
		String str="";		
		String s="India is country";
		char ch[]=s.toCharArray();
		int count=0;
		
		String[] str2=new String[3];
	int j=0;
		
		for(int i=0;i<ch.length;i++)
		{			
			str=str+ch[i];			
			if(ch[i]==' ')
				{				
				str2[j]=str;
				j++;
				str="";
				count++;
					continue;
				}
			
			if(count==str2.length-1)
			{							
					str2[j]=str;														
			}
			if(i==ch.length-1)
			{
				break;
			}									
		}		
		for(String st:str2)
		{
			System.out.println(st);
		}
			
			
			
			
			
		}
		

	}


