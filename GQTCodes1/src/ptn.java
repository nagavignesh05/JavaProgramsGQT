
public class ptn {

	public static void main(String[] args) {
//		int count;
//		for(int i=1;i<=5;i++) {
//			count=i;//1
//			for(int j=1;j<=i;j++) {
//				if(count<10) {
//					System.out.print("0");
//					System.out.print(count);
//					System.out.print(" ");
//					count = count+5;
//				}
//				else {
//				System.out.print(count);
//				System.out.print(" ");
//				count = count+5;
//				}
//			}
//			System.out.println();
//		}
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("-");
				System.out.print(" ");
			}
			for(int j=1;j<(2*i-1);j++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("-");
				System.out.print(" ");
			}
			for(int j=1;j<=(11-2*i);j++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
}