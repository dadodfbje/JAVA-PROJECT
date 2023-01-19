package assignment14Jan;

public class ArrQ1 {

	public static void main(String[] args) {
		
		/*q1)Given array:{ 1 ,2,3,4,5}
		rotate 1 right side
		o/p  {2,3,4,5,1}*/
		
		
		int []array={ 1,2,3,4,5};
		int i=0;
		
	         	
			  
				int sum=array[i];
				array[i]=array[array.length-1];
				array[array.length-1]=sum;
				
				for( i=0;i<array.length;i++)
		    {
					System.out.print(array[i]+" ");  
			}		  
			
		
		   
	

}
}