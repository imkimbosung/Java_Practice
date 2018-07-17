/*  
  	유클리드의 최대 공약수 구하기(Largest Common Devider)
	임의 두 자연수의 최대 공약수를 다음의 방법으로 구한다.
	1. 유클리드의 차감법 + 재귀함수,  2. 유클리드의 호제법 + 제어문
	3. 유클리드의 호제법 + 재귀함수,  4. 우리가 수학적으로 푸는 소인수 분해법
*/

package num_B234;

import java.util.Scanner;

public class num_B03 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.printf("임의의 2개 자연수의 값을 입력하세요(구분자는 공백). >> ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();

		Euclidean_control(number1, number2);
		System.out.printf("\n유클리드 호제법(제어문): 두 수 %d와 %d의 최대 공약수는 %d입니다.", number1, number2,
				Euclidean_control(number1, number2));
		Euclidean_reflection(number1, number2);
		System.out.printf("\n유클리드 호제법(제어문): 두 수 %d와 %d의 최대 공약수는 %d입니다.", number1, number2,
				Euclidean_reflection(number1, number2));
		prime_factorization(number1, number2);
	}

	public static int Euclidean_control(int number1, int number2) {
		int result = 0;
		while (true) {
			result = number1 % number2;
			number1 = number2;
			number2 = result;
			if (number2 == 0)
				break;
		}
		return number1;

	}

	public static int Euclidean_reflection(int number1, int number2) {
		if (number2 == 0)
			return number1;
		number1 = number1 % number2;

		return Euclidean_reflection(number2, number1);
	}
	
	public static int prime_factorization(int number1, int number2) {
		
		return 0;
	}
}
