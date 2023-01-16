public class FrequencyForLoop {

 public static void main(String[] args) {
	int d=1;
	int num=17181;
	int rem=0;
	int count=0;
	while(num!=0)
		{ 
		 rem=num%10;
		 if(rem==d)
			 count++;
		 num=num/10;}
	if(count==0)
	{System.out.println("Not Occur");
	}else {System.out.println(count);

			
}
}
}


