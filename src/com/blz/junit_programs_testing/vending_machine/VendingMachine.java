package com.blz.junit_programs_testing.vending_machine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
	static int rupeeArray[]= {1,2,5,10,50,100,500,1000};
	public static void vendingMachineCash(int rupee) {
		List<Integer> vendingCash=new ArrayList<Integer>();
		for (int i = rupeeArray.length-1; i>=0 ; i--) {
			while(rupee>=rupeeArray[i]) {
				rupee-=rupeeArray[i];
				vendingCash.add(rupeeArray[i]);
			}
		}
		for (int i = 0; i < vendingCash.size(); i++) {
			System.out.print(vendingCash.get(i)+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rupee to Vending Machine");
		int rupee=sc.nextInt();
		System.out.println("The minimum Note needed to give the change in Rupee");
		vendingMachineCash(rupee);
	}
}
