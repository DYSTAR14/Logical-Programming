package com.blz.logical_programming.perfect_number;

import java.util.Scanner;

public class PerfectNumber {

	public static int perfectNumber(int num) {
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		if (num == perfectNumber(num)) {
			System.out.println("It is Perfect Number");
		} else {
			System.out.println("It not Perfect Number");
		}
	}
}
//28,496
