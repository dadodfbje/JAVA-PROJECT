package Arrayall;

public class SortigByAscending {

	public static void main(String[] args) {
String []arr= {"Hi","How","Are","You","Doing"};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].length()>arr[j].length())
				{
				    String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
           for(String s:arr)
           {
        	   System.out.println(s);
           }
	}

}
