/*
 * prime number 
 * ���� �ڿ��� ������ ��� �Ҽ��� ǥ�� ��� �Ͽ���.
 */

package num_B567;

import java.util.Scanner;

public class num_B5 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("prime number�� �ִ� ������ �Է��Ͻÿ�. >> ");
		int primeNum = input.nextInt();

		prime(primeNum);

	}

	public static void prime(int primeNum) {
		System.out.printf("�Ҽ��� ����: %d������ prime numbers:\n", primeNum);
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
