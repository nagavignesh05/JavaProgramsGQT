/**
 * 
 */
package com.gqt.fstraining.arrays;

import java.util.Scanner;

/**
 * @author Admin
 * description:This is the code for demonstration of 1D array .
 * requirement to store the marks of n students.
 *
 */
public class array2d {

	private static int[][] newInt;

	/**
	 * @param args
	 */
	//System.in is used to take the input from the user
	//1.Scanner
	public static void main(String[] args) {
		System.out.println("Enter the number of students:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	//2.Array
		int arr[] = new int[n];
		System.out.println("Array is ready for operation");
		System.out.println("The length of the given array is:"+arr.length);
		
	//3.The code to collect & store the marks of n students
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the marks of student-"+(i+1));
			arr[i] = sc.nextInt();
		}
		
	//The code to display the marks of n students
		for(int i=0;i<arr.length;i++) {
			System.out.println("The marks of student-"+(i+1)+"is:"+arr[i]);
		}

	}

}
