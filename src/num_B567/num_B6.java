/*
 * �ּҰ��� �ִ밪 ã��(Linear Search, Sequential Search)
 * �־��� ������ ���� �迭 �� �߿��� �ִ밪�� �ּҰ��� ã�� ǥ������ض�.
 */

package num_B567;

import java.util.Scanner;

public class num_B6 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.printf("Ž�� ����� �������� ������ �Է��ϼ���. >> ");
		int number = input.nextInt();
		int numArray[] = new int[number];
		System.out.printf("Ž���� %d���� ������ �� �ٿ� ���ʷ� �Է��ϼ���(�����ڴ� ' '��)\n", number);
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
		
		System.out.printf("�ּҰ��� %d �̰�, �ִ밪�� %d �̴�.", min, max);
	}
}
