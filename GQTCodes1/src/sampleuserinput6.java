import java.util.Scanner;

public class sampleuserinput6 {

	public static void main(String[] args) {
		System.out.println("Enter the Size");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==(n/2) || i+j==(n/2) || j-i==(n/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			///////////////////////////////////
			System.out.print(" ");
			for(int j=0;j<n;j++) {
				if(i==(n/2) || i+j==(n/2) || j-i==(n/2) || 
						  i-j==(n/2) || i+j==(n-1+(n/2))) {
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
