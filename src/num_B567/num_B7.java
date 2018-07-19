/*
 * �迭 ���� ��ǥ �� ã��(Binary Search)
 * ���ĵ� ���� �迭���� ã���� �ϴ� ��ǥ ���� ���� ���� Ž�� �õ��� ã�ư��� ������ �õ��� Ƚ���� ǥ������Ͻÿ�.
 */

package num_B567;

import java.util.Scanner;

public class num_B7 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.printf("���ĵ� ���� �迭�� ���Ҽ��� ã�� ��ǥ���� �Է��ϼ���(�����ڴ� ����) >>");
		int arrayNum = input.nextInt();
		int wantNum = input.nextInt();

		int array[] = new int[arrayNum];
		System.out.println("�迭�� ���� ������ ���ʷ� �� �ٿ� �Է��ϼ���(�����ڴ� ����).");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

		binary(array, wantNum);

	}

	public static void binary(int[] array, int wantNum) {
		int max = array.length - 1;
		int pivot = max / 2;
		int count = 0;

		while (true) {
			if (array[pivot] < wantNum) {
				count++;
				System.out.printf("binary search�� �� pivot �ε����� %d�̰� ���� ����  %d�̴�.\n", pivot, array[pivot]);
				pivot = (pivot+max) / 2;
			} else if (array[pivot] > wantNum) {
				count++;
				System.out.printf("binary search�� �� pivot �ε����� %d�̰� ���� ����  %d�̴�.\n", pivot, array[pivot]);
				pivot = pivot / 2;
			} else {
				count++;
				System.out.printf("binary search�� �� pivot �ε����� %d�̰� ���� ����  %d�̴�.\n", pivot, array[pivot]);
				System.out.println("ã�� ���� " + count + "ȸ ���� �߰��Ͽ���.");
				break;
			}
		}

	}
}
