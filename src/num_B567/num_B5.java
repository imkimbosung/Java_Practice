/*
 * prime number 
 * 임의 자연수 이하의 모든 소수를 표준 출력 하여라.
 */

package num_B567;

import java.util.Scanner;

public class num_B5 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("prime number의 최대 범위를 입력하시오. >> ");
		int primeNum = input.nextInt();

		prime(primeNum);

	}

	public static void prime(int primeNum) {
		System.out.printf("소수의 정의: %d이하의 prime numbers:\n", primeNum);
		for (int i = 2; i < primeNum; i++) {
			int count = 0;
			for (int j = 2; j < primeNum; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 1)
				System.out.printf("%d ", i);
		}
	}
}
