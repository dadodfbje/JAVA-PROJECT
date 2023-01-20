package string;

public class StrngMtd6comparTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//               String s="Hello";
//               int x=s.compareTo("hello");
//               System.out.println(x);
               
               
             
//       		String s="india";
//       		String s2="china";
//       		
//       		System.out.println(s.compareTo(s2));
//       		char ch=' ';
//       		int x1=ch;
//       		System.out.println(x1);
       		//String str="It is beautiful umbrella";
       		String arr[]= {"india","Iran","japan"};
       		
       		
       		/*for(int i=0;i<arr.length;i++)
       		{
       			for(int j=i+1;j<arr.length;j++)
       			{
       				if(arr[i].charAt(0)>arr[j].charAt(0))
       				{
       					String temp=arr[i];
       					arr[i]=arr[j];
       					arr[j]=temp;
       				}
       				
       					
       			}
       			}
       		
       		for(int i=0;i<arr.length;i++)
       		{
       			System.out.println(arr[i]);
       		}*/
       		
       		
       		for(int i=0;i<arr.length;i++)
       		{
       			for(int j=i+1;j<arr.length;j++)
       			{
       				
       				int x=arr[i].compareToIgnoreCase(arr[j]);
       				if(x>0)
       				{
       					String temp=arr[i];
       					arr[i]=arr[j];
       					arr[j]=temp;
       				}
       					
       				}
       			}
       		
       		for(int i=0;i<arr.length;i++)
       		{
       			System.out.println(arr[i]);
       		}
       		
       		
	}

}
