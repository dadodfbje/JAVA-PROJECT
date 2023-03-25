package Coding;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		int num;
		boolean flag = false; 
		
		int flag1=0;
		num = 123456;
		int temp = num % 10;
		num = num/10;
		
		while(num>0){ 
			if(temp <= num % 10)
			{ 
				flag1 = 1;
				break;
			} 
			temp = num % 10;
			num = num/10; } 
		if(flag1==1)
		{ 
			System.out.println("Digits are not in increasing order.");
		}else{ 
			System.out.println("Digits are in increasing order."); }
		}

	}


