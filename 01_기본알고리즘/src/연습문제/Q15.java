package 연습문제;

public class Q15 {
	public static void main(String[] args) {
		spira(4);
		npira(4);
	}
	static void spira(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=(i-1)*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	static void npira(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=(i-1)*2+1; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
