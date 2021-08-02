package com.blz.junit_programs_testing.newton_methos;

import java.util.Scanner;

public class Newton {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		double c = sc.nextDouble();

        double epsilon = 1e-15;    
        double t = c;            
        while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2;
        }

        System.out.println(t);
	}

}
