/*  
  	Factorial
  	임의의 자연수 n의 연속 곱인 n ! 을 계산.
  	1. 반복문  2. 재귀함수
*/

package num_B234;

import java.util.Scanner;

public class num_B04 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.printf("임의의 자연수를 입력하시오 >> ");
		int Number = input.nextInt();

		control(Number);
		reflection(Number);
		System.out.printf("\n재귀함수: %d! = %d 입니다.", Number, reflection(Number));
	}

	public static void control(int Number) {
		int factorial = 1;
		for (int i = 1; i <= Number; i++) {
			factorial = factorial * i;
		}
		System.out.printf("반복문: %d! = %d 입니다.", Number, factorial);
	}

	public static int reflection(int Number) {
		if (Number == 1)
			return Number;

		return reflection(Number - 1) * Number;
	}

}
