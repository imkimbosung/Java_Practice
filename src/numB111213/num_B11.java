
/*
 * ��¥ ���� ã��
 * �������� ���� �����⿡ ������ ������ ���Ը� ������ ��¥ ������ �����ִ�. �̸� õĪ�� �̿��Ͽ� ã�� �����Ѵ�.
 * �ּ��� ȸ���� �ݵ�� ã�Ƴ��� �˰����� �����, �����Ͽ���.
 * 1. ��� ������ �ݵ�� �޾ƺ��� ������� �ذ�
 * 2. �������� �Ǵ��� ��ŭ�� �޾ƺ��� ����� ���̰�, 1�Ȱ� ���Ͻÿ�.
 *  (1�� 2����, 2�� 3����)
 * 
 */

package numB111213;

import java.util.Scanner;

public class num_B11 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.printf("��ü ������ ������ �Է��ϼ���. >> ");
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

			System.out.printf(" %d�� �õ��� õĪ ���ʿ� �÷��� ������ %d�� �Դϴ�. \n", i, CoinNumber);
			if (CoinNumber == 1) {
				System.out.printf("  2���ҿ����� ã�� ������ %dȸ ���� �߰��Ͽ���. \n", i);
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

			System.out.printf(" %d�� �õ��� õĪ ���ʿ� �÷��� ������ %d�� �Դϴ�. \n", i, CoinNumber);
			if (CoinNumber == 1) {
				System.out.printf("  3���ҿ����� ã�� ������ %dȸ ���� �߰��Ͽ���. \n", i);
				break;
			}
		}
	}
}
