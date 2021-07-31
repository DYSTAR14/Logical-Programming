package com.blz.logical_programming.coupon_number;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CouponNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Integer> arrylist=new ArrayList<Integer>();
		System.out.println("Enter size of Array");
		int num=sc.nextInt();
		for (int i = 0; i < num; i++) {
			int rand=(int)(Math.random()*10000000)%10000000;
			boolean ans=arrylist.contains(rand);
			if (!ans) {
				arrylist.add(rand);
			}
		}
		for (int i:arrylist) {
			System.out.print(i+" ");
		}
	}

}
