package com.blz.logical_programming.prime_number;

import java.util.Scanner;

public class PrimeNumber {
	public static boolean primeCheck(int num) {
		boolean flag = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				return flag;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if(num>=2){
			if (primeCheck(num)) {
				System.out.println("It is Prime Number");
			} else {
				System.out.println("It is not Prime Number");
			}
		}
		else {
			System.out.println("It is not Prime Number");
		}
	}
}
