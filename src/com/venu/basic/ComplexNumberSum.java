package com.venu.basic;

import java.util.Scanner;

/*
 * 2+3i
 * 4+4i
 * ====
 * 6+7i
 * 
 */

public class ComplexNumberSum {
	
	double realNum,imginaryNum;
	
	ComplexNumberSum(double r,double i){
		this.realNum = r;
		this.imginaryNum = i;
	}

	public static ComplexNumberSum sum(ComplexNumberSum c1,ComplexNumberSum c2) {
		
		ComplexNumberSum temp = new ComplexNumberSum(0, 0);
		temp.realNum = c1.realNum + c2.realNum;
		temp.imginaryNum = c1.imginaryNum + c2.imginaryNum;
		
		return temp;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st real Number");
		double realNumber1 = scan.nextDouble();
		System.out.println("Enter 1st imaginary number");
		double imgNumber1 = scan.nextDouble();
		
		System.out.println("Enter 2nd real Number");
		double realNumber2 = scan.nextDouble();
		System.out.println("Enter 2nd imaginary number");
		double imgNumber2 = scan.nextDouble();
		scan.close();
		ComplexNumberSum sum1 = new ComplexNumberSum(realNumber1, imgNumber1);
		ComplexNumberSum sum2 = new ComplexNumberSum(realNumber2, imgNumber2);
		ComplexNumberSum temp = sum(sum1,sum2);
		System.out.println("Sum Is : "+ temp.realNum+"+"+temp.imginaryNum+"i");

	}

}
