package com.gqt.fstraining.arrays;

import java.util.Scanner;

public class Array2Da {

	public static void main(String[] args) {
		//1.Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of class-rooms:");
		int m = sc.nextInt();
		System.out.println("Enter the totl number of students in each class rooms:");
		int n = sc.nextInt();
		
		//2.Array
		int arr[][] = new int[m][n];
		System.out.println("The array is ready for the operation");
		System.out.println("The length of the outer portion of the array is:"+arr.length);
		
		//code to store the marks of n students from m class rooms
		for(int i=0;i<arr.length;i++) {
			System.out.println("The count of the student inside class-"+(i+1)+"is:"+arr[i].length);
			for(int j=0;j<arr.length;j++) {
				System.out.println("Enter the marks of the student-"+(j+1));
				arr[i][j] = sc.nextInt();
			}
		}
		//code to display the marks
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside class-"+(i+1));
			for(int j=0;j<arr.length;j++) {
				System.out.println("the marks of student-"+(j+1)+"is:"+arr[i][j]);
			}
		}
	}

}
