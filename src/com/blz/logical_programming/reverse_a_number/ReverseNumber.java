package com.blz.logical_programming.reverse_a_number;

import java.util.Scanner;

public class ReverseNumber {
	public static long reverse(long num) {
		int reminder;
		long reverseNum=0;
		while(num>0) {
			reminder=(int) (num%10);
			num=num/10;
			reverseNum=reverseNum*10+reminder;
		}
		return reverseNum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		long num=sc.nextLong();
		System.out.println("Reverse of Number is "+reverse(num));
	}
}
