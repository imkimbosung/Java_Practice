/*
 * 최소값과 최대값 찾기(Linear Search, Sequential Search)
 * 주어진 임의의 정수 배열 값 중에서 최대값과 최소값을 찾아 표준출력해라.
 */

package num_B567;

import java.util.Scanner;

public class num_B6 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.printf("탐색 대상인 정수들의 갯수를 입력하세요. >> ");
		int number = input.nextInt();
		int numArray[] = new int[number];
		System.out.printf("탐색할 %d개의 정수를 한 줄에 차례로 입력하세요(구분자는 ' '임)\n", number);
		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = input.nextInt();
		}

		MinMax(numArray);
	}

	public static void MinMax(int[] numArray) {
		int max = numArray[0], min = numArray[0];

		for (int i = 1; i < numArray.length; i++) {
			max = max > numArray[i] ? max : numArray[i];
			min = min < numArray[i] ? min : numArray[i];			
		}
		
		System.out.printf("최소값은 %d 이고, 최대값은 %d 이다.", min, max);
	}
}
