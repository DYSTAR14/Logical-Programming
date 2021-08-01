package com.blz.junit_programs_testing.gregorian_calendar;

public class GregorianCalendar {
	public static int[] dayOfWeek(int day,int month,int year) {
		int yearO=year-(14-month)/12;
		int x=yearO+yearO/4-yearO/100+yearO/400;
		int monthO=month+12*((14-month)/12);
		int dayO=(day+x+31*(monthO-2)/12)%7;
		int arr[]=new int[2];
		arr[0]=monthO;
		arr[1]=dayO;
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day=Integer.parseInt(args[0]);
		int month=Integer.parseInt(args[1]);
		int year=Integer.parseInt(args[2]);
		int arr[]=dayOfWeek(day, month, year);
		System.out.print("It is : "+arr[0]+" : ");
		switch(arr[0]) {
		case 1: System.out.println("January");break;
		case 2: System.out.println("February");break;
		case 3: System.out.println("March");break;
		case 4: System.out.println("April");break;
		case 5: System.out.println("May");break;
		case 6: System.out.println("June");break;
		case 7: System.out.println("July");break;
		case 8: System.out.println("August");break;
		case 9: System.out.println("September");break;
		case 10: System.out.println("October");break;
		case 11: System.out.println("November");break;
		case 12: System.out.println("December");break;
		default:System.out.println("Error In Month");
		}
		System.out.print("It is : "+arr[1]+" : ");
		switch(arr[1]) {
		case 0: System.out.println("Sunday");break;
		case 1: System.out.println("Monday");break;
		case 2: System.out.println("Tuesday");break;
		case 3: System.out.println("Wednesday");break;
		case 4: System.out.println("Thursday");break;
		case 5: System.out.println("Friday");break;
		case 6: System.out.println("Saturday");break;
		default:System.out.println("Error In Month");
		}
	}

}
