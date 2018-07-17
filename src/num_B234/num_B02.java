/*  
  	���ӵ� ������ �� ���ϱ�
	���ӵ� �ڿ����� ù ���� ������ ���� �Է¹޾� ��ü ���ڵ��� �� ���� ���ض�.
	1. ��� 2. ���콺 ���� 3. ��� ȣ��
*/

package num_B234;

import java.util.Scanner;

public class num_B02 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.printf("�� ������ ù  ���� ������ ���� �Է��Ͻÿ�(������ ' ' ��). >> ");
		int firstNum = input.nextInt();
		int lastNum = input.nextInt();

		control(firstNum, lastNum);
		gauss(firstNum, lastNum);
		reflection(firstNum, lastNum);
		System.out.printf("\n ��� ȣ���� ���: �ڿ��� " + firstNum + "���� " + lastNum + "������ ���� " + reflection(firstNum, lastNum) + "�Դϴ�.");
	}

	public static void control(int firstNum, int lastNum) {
		int Sum = 0;
		for (int i = firstNum; i <= lastNum; i++) {
			Sum = Sum + i;
		}
		System.out.printf("\n ��� ���: �ڿ��� " + firstNum + "���� " + lastNum + "������ ���� " + Sum + "�Դϴ�.");
	}

	public static void gauss(int firstNum, int lastNum) {
		int sum = 0, num = 0, result = 0;

		sum = firstNum + lastNum;
		num = lastNum - firstNum + 1;
		result = sum * num / 2;

		System.out.printf("\n ���콺 ���� �˰��� ���: �ڿ��� " + firstNum + "���� " + lastNum + "������ ���� " + result + "�Դϴ�.");

	}

	public static int reflection(int firstNum, int lastNum) {
		if ( firstNum == lastNum) {			
			return firstNum;
		}
			
		return firstNum + reflection(firstNum + 1, lastNum);
	}

}
