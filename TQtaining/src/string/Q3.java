package string;

public class Q3 {

	public static void main(String[] args) {
		/*3. Write a program to find the number of vowels, consonants, digits and white 
		space characters in a string*/
           String a= "Earth is Beautifull";
           int count=0;
           int count1=0;
           int count2=0;
           int count3=0;
           char[] arr=a.toLowerCase().toCharArray();
           for(int i=0;i<arr.length;i++)
           {
        	   if(arr[i]=='a' || arr[i]== 'e' || arr[i]=='i' || arr[i]=='o' ||  arr[i]=='u')
        	   {  
        		  count++;       		         		         		   
        	   }
        	   else if(arr[i]!='a' && arr[i]!= 'e' && arr[i]!='i' && arr[i]!='o' &&  arr[i]!='u'  && arr[i]!=(char) 32)
        	   {            		           		  
        		  count1++;
        	   }
        	   else if( arr[i]==(char) 32)
        	   {            		   
                  count2++;
        	   }
        	   else if(arr[i]>='0' && arr[i]>='9')
        	   {
        		   count3++;
        	   }
        	 
           }System.out.println("Number of Vowel is--->"+count);
           System.out.println("Number of Consonent is--->"+count1);
           System.out.println("Number of WhiteSpaces is--->"+count2);
           System.out.println("Number of Digits is--->"+count3);
	}

}
