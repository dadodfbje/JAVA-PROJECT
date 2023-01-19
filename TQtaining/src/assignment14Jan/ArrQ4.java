package assignment14Jan;

public class ArrQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       /* Q4) WAP to find min character in character array.
         Means e.g. arr[] = [‘A’, ‘D’, ‘E’, ‘x’, ‘z’, ‘R’], so min character is ‘A’*/
		
		char [] arr= {'K','D','A','X','Z','R','L','M'};
		char min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println(min);
	}

}
