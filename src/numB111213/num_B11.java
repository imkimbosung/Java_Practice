
/*
 * 가짜 동전 찾기
 * 여러개의 동전 무더기에 외형은 같으나 무게만 가벼운 가짜 동전이 섞여있다. 이를 천칭을 이용하여 찾아 내려한다.
 * 최소의 회수로 반드시 찾아내는 알고리즘을 만들고, 구현하여라.
 * 1. 모든 동전을 반드시 달아보는 방법으로 해결
 * 2. 논리적으로 판단할 만큼만 달아보는 방법을 보이고, 1안과 비교하시오.
 *  (1안 2분할, 2안 3분할)
 * 
 */

package numB111213;

import java.util.Scanner;

public class num_B11 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.printf("전체 동전의 갯수를 입력하세요. >> ");
		int CoinNumber = input.nextInt();

		firstCase(CoinNumber);

		secondCase(CoinNumber);
	}

	public static void firstCase(int CoinNumber) {
		int number = CoinNumber;

		for (int i = 1; i < number; i++) {
			if (CoinNumber % 2 == 0) {
				CoinNumber = CoinNumber / 2;
			} else {
				CoinNumber = (CoinNumber / 2) + 1;
			}

			System.out.printf(" %d번 시도에 천칭 한쪽에 올려진 동전은 %d개 입니다. \n", i, CoinNumber);
			if (CoinNumber == 1) {
				System.out.printf("  2분할에서는 찾는 동전을 %d회 만에 발견하였다. \n", i);
				break;
			}
		}
	}

	public static void secondCase(int CoinNumber) {
		int number = CoinNumber;
		
		for (int i = 1; i < number; i++) {
			if (CoinNumber % 3 == 0) {
				CoinNumber = CoinNumber / 3;
			} else {
				CoinNumber = (CoinNumber / 3) + 1;
			}

			System.out.printf(" %d번 시도에 천칭 한쪽에 올려진 동전은 %d개 입니다. \n", i, CoinNumber);
			if (CoinNumber == 1) {
				System.out.printf("  3분할에서는 찾는 동전을 %d회 만에 발견하였다. \n", i);
				break;
			}
		}
	}
}
