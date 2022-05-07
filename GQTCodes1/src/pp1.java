//pattern programming
public class pp1 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("-");
				System.out.print(" ");
			}
			for(int j=1;j<(2*i-1);j++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
}