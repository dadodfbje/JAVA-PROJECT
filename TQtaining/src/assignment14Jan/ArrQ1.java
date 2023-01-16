package assignment14Jan;

public class ArrQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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