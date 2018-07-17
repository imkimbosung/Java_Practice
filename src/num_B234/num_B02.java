/*  
  	연속된 숫자의 합 구하기
	연속된 자연수의 첫 수와 마지막 수를 입력받아 전체 숫자들의 총 합을 구해라.
	1. 제어문 2. 가우스 덧셈 3. 재귀 호출
*/

package num_B234;

import java.util.Scanner;

public class num_B02 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.printf("합 연산할 첫  수와 마지막 수를 입력하시오(구분은 ' ' 임). >> ");
		int firstNum = input.nextInt();
		int lastNum = input.nextInt();

		control(firstNum, lastNum);
		gauss(firstNum, lastNum);
		reflection(firstNum, lastNum);
		System.out.printf("\n 재귀 호출을 사용: 자연수 " + firstNum + "부터 " + lastNum + "까지의 합은 " + reflection(firstNum, lastNum) + "입니다.");
	}

	public static void control(int firstNum, int lastNum) {
		int Sum = 0;
		for (int i = firstNum; i <= lastNum; i++) {
			Sum = Sum + i;
		}
		System.out.printf("\n 제어문 사용: 자연수 " + firstNum + "부터 " + lastNum + "까지의 합은 " + Sum + "입니다.");
	}

	public static void gauss(int firstNum, int lastNum) {
		int sum = 0, num = 0, result = 0;

		sum = firstNum + lastNum;
		num = lastNum - firstNum + 1;
		result = sum * num / 2;

		System.out.printf("\n 가우스 덧셈 알고리즘 사용: 자연수 " + firstNum + "부터 " + lastNum + "까지의 합은 " + result + "입니다.");

	}

	public static int reflection(int firstNum, int lastNum) {
		if ( firstNum == lastNum) {			
			return firstNum;
		}
			
		return firstNum + reflection(firstNum + 1, lastNum);
	}

}
