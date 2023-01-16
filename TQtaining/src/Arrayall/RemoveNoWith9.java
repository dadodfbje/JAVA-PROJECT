package Arrayall;

public class RemoveNoWith9 {

	public static void main(String[] args) {
    int []arr= {72,69,76,76,69};
	int i;	
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]%10==9)
			{
				arr[i]=0;
			}
		}
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

           
	}
}


      
	


