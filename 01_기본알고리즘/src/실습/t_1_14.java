package 실습;

import java.util.Scanner;

public class t_1_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*를 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.");
		System.out.print("n:");
		int n = sc.nextInt();
		System.out.print("w:");
		int w = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(i%w==1) {
				System.out.println();
			}
				System.out.print("*");
		}
		
	}
}
