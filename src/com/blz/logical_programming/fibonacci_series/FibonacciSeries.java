package com.blz.logical_programming.fibonacci_series;

import java.util.Scanner;

public class FibonacciSeries {

	public static void fibonacci(int fiboSeriesNum) {
		int fiboFirstNum = 0, fiboSecondNum = 1, fiboThirdNum;
		if (fiboSeriesNum == 1) {
			System.out.print("Fibonacci series are\n" + fiboFirstNum + " ");
		} else {
			System.out.print("Fibonacci series are\n" + fiboFirstNum + " " + fiboSecondNum + " ");
			for (int i = 2; i < fiboSeriesNum; i++) {
				fiboThirdNum = fiboFirstNum + fiboSecondNum;
				System.out.print(fiboThirdNum + " ");
				fiboFirstNum = fiboSecondNum;
				fiboSecondNum = fiboThirdNum;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int fiboSeriesNum = sc.nextInt();
		fibonacci(fiboSeriesNum);
	}

}
