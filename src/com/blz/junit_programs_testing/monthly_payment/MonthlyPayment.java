package com.blz.junit_programs_testing.monthly_payment;

public class MonthlyPayment {

	public static void payment(int P,int Y,int R) {
		float n=12*Y;
		float r=(float) R/(12*100);
		float payment=(float) ((P*r)/(1-Math.pow(1+r,-n)));
		System.out.println(payment);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		int r=Integer.parseInt(args[2]);
		System.out.println(p+" "+y+" "+r);
		payment(p,y,r);
	}

}
