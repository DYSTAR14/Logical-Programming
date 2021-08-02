package com.blz.junit_programs_testing.binary_swap;
import java.util.Scanner;

public class Binary {

	public static int swapNibbles(int x)
	{
		return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int decimal=sc.nextInt();
		System.out.println(swapNibbles(decimal));
	}
}
