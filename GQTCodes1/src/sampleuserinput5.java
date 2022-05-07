import java.util.Scanner;

public class sampleuserinput5 {

	public static void main(String[] args) {
		System.out.println("Enter the Size");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		////////////////////////////////D
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || i==0 || i==(n-1) || j==(n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			/////////////////////////////R
			System.out.print(" ");
			for(int j=0;j<n;j++) {
				if(i==0&&j<=(n-1) || j==0&&i<=(n-1) || j==(n-1)&&i<=(n/2) || i==(n/2) || i==j&&j>=(n/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			////////////////////////////DOT
			System.out.print(" ");
			for(int j=0;j<n;j++) {
				if(j==(n/2)&&i==(n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
		////////////////////////////////P
			System.out.print(" ");
			for(int j=0;j<n;j++) {
				if(i==0&&j<=(n-1) || j==0&&i<=(n-1) || j==(n-1)&&i<=(n/2) || i==(n/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			////////////////////////////U
			System.out.print(" ");
			for(int j=0;j<n;j++) {
				if(j==0&&i<=(n-1) || j==(n-1)&&i<=(n-1) || i==(n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			////////////////////////////////N
			System.out.print(" ");
			for(int j=0;j<n;j++) {
				if(j==0 && i<=(n-1) || (i==j) || j==(n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			////////////////////////////////E
			System.out.print(" ");
			for(int j=0;j<n;j++) {
				if(i==0&&j<=(n-1) || j==0&&i<=(n-1) || i==(n-1)&j<=(n-1) || i==(n/2)&&j<=(n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			////////////////////////////////////E
			System.out.print(" ");
			for(int j=0;j<n;j++) {
				if(i==0&&j<=(n-1) || j==0&&i<=(n-1) || i==(n-1)&j<=(n-1) || i==(n/2)&&j<=(n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			/////////////////////////////////////T
			System.out.print(" ");
			for(int j=0;j<n;j++) {
				if(i==0 && j<=(n-1) || j==(n/2)){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			//////////////////////////////////////H
			System.out.print(" ");
			for(int j=0;j<n;j++) {
				if(j==0&&i<=(n-1) || j==(n-1)&&i<=(n-1) || i==(n/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			////////////////////////////////////////////SPACE
			System.out.print("    ");
			//////////////////////////////////////R
			System.out.print(" ");
			for(int j=0;j<n;j++) {
				if(i==0&&j<=(n-1) || j==0&&i<=(n-1) || j==(n-1)&&i<=(n/2) || i==(n/2) || i==j&&j>=(n/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			////////////////////////////////////////A
			System.out.print(" ");
			for(int j=0;j<n;j++) {
				if(j==0&&i>=(n/2) || i+j==(n/2) || j-i==(n/2) || j==(n-1)&&i>=(n/2) || i==(n/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			///////////////////////////////////////////J
			System.out.print(" ");
			for(int j=0;j<n;j++) {
				if(i==0 || j==(n/2) || i==(n-1)&&j<=(n/2) || j==0&&i>=(n/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			///////////////////////////////////////////K
			System.out.print(" ");
			for(int j=0;j<n;j++) {
				if(j==0 || i+j==(n/2) || i-j==(n/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			///////////////////////////////////////U
			System.out.print(" ");
			for(int j=0;j<n;j++) {
				if(j==0&&i<=(n-1) || j==(n-1)&&i<=(n-1) || i==(n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			///////////////////////////////////////M
			System.out.print(" ");
			for(int j=0;j<n;j++) {
				if(j==0&&i<=(n-1) || i==j&&j<=(n/2) || j==(n-1)&&i<=(n-1) || i+j==(n-1)&&i<=(n/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			///////////////////////////////////////////A
			System.out.print(" ");
			for(int j=0;j<n;j++) {
				if(j==0&&i>=(n/2) || i+j==(n/2) || j-i==(n/2) || j==(n-1)&&i>=(n/2) || i==(n/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			//////////////////////////////////////////R
			System.out.print(" ");
			for(int j=0;j<n;j++) {
				if(i==0&&j<=(n-1) || j==0&&i<=(n-1) || j==(n-1)&&i<=(n/2) || i==(n/2) || i==j&&j>=(n/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
