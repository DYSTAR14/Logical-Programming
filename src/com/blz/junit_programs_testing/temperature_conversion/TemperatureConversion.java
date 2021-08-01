package com.blz.junit_programs_testing.temperature_conversion;

import java.util.Scanner;

public class TemperatureConversion {

	public static float celsiusToFahrenheit(float celValue) {
		float fahValue = (celValue * 9 / 5) +32;
		return fahValue;
	}

	public static float fahrenheitToCelsius(float fahValue) {
		float celValue = (fahValue - 32) * 5 / 9;
		return celValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter\n1.Celsius to Fahrenheit:\n2.Fahrenheit to Celsius:");
		int num=sc.nextInt();
		float celValue,fahValue;
		switch (num) {
		case 1:
			System.out.println("Enter Value in Celsius");
			celValue=sc.nextFloat();
			fahValue=celsiusToFahrenheit(celValue);
			System.out.println("After Conversion Value is "+fahValue+" in Fahrenheit");
			break;
		case 2:
			System.out.println("Enter Value in Celsius");
			fahValue=sc.nextFloat();
			celValue=fahrenheitToCelsius(fahValue);
			System.out.println("After Conversion Value is "+celValue+" in Celsius");
			break;
		default:
			break;
		}
	}

}
