package num_3;

import java.util.Scanner;

public class Num_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("임의의 2자리 정수 2개의 값을 입력하세요(구분자는 공백). >> ");
		int fnum = input.nextInt();
		int snum = input.nextInt();
		
		// 정상 곱셈
		int multi1 = (fnum * snum);
		
		// 암산 곱셈
		int multi2 = ((fnum/10)*(snum/10)*100 + (fnum%10)*(snum%10)) + ((fnum/10)*(snum%10) + (snum/10)*(fnum%10))*10 ;
		
		System.out.println("암산 알고리즘 결과는 " + multi2 +  "이고, 정상 곱셈 결과는 " + multi1 + "입니다. ");

	}
}
