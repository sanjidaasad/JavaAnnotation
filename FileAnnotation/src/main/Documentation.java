package main;

import java.io.*;
/**
 * <h1>Calculator for addition,subtraction,multiplication and division</h1>
 * Documentation program implements an application that simply add,subtract,multiply
 * and divide two given integer number and prints the output on the screen  
 * @author Sanjida Asad
 * @version 1.0
 */

public class Documentation {
/**
 * This is Documentation class
 * This class have 5 function
 * 1.main function
 * 2.addition function
 * 3.multiplication function
 * 4.subtraction function
 * 5.division function
 * @param args
 */

	public static void main(String[] args) {
		
		int num1 = 6;
		int num2 = 12;
		int sum;
		int mul;
		int sub;
		double div;
		sum = addition(num1 ,num2);
		mul = multiplication(num1 ,num2);
		sub = subtraction(num1 , num2);
		div = division(num1 , num2);
		
		System.out.println("sum of these numbers: "+sum);
		System.out.println("multiplication of these numbers: "+mul);
		System.out.println("subtraction of these numbers: "+sub);
		System.out.println("division of these numbers: "+div);
		
	}
	public static int addition(int num1,int num2) {
		return num1 + num2;
	}
	
	public static int multiplicaion(int num1,int num2) {
		return num1 * num2;
	}
	
	public static int subtraction(int num1,int num2) {
		return num1 - num2;
	}
	
	public static double division(int num1,int num2) {
		return (double) num1 / (double) num2;
	}

}
