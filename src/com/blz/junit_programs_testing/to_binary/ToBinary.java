package com.blz.junit_programs_testing.to_binary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToBinary {

	public static void binaryConversion(int decimalNum) {
		List<Integer> binaryList=new ArrayList<Integer>();
		while(decimalNum>0) {
			binaryList.add(decimalNum%2);
			decimalNum/=2;
		}
		for (int i = binaryList.size()-1; i>=0 ; i--) {
			System.out.print(binaryList.get(i)+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int decimal=sc.nextInt();
		binaryConversion(decimal);
	}
}
