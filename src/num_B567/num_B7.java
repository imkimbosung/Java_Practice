/*
 * 배열 속의 목표 값 찾기(Binary Search)
 * 정렬된 정수 배열에서 찾고자 하는 목표 값을 가장 작은 탐색 시도로 찾아가는 과정과 시도한 횟수를 표준출력하시오.
 */

package num_B567;

import java.util.Scanner;

public class num_B7 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.printf("정렬된 정수 배열의 원소수와 찾는 목표값을 입력하세요(구분자는 공백) >>");
		int arrayNum = input.nextInt();
		int wantNum = input.nextInt();

		int array[] = new int[arrayNum];
		System.out.println("배열의 원소 값들을 차례로 한 줄에 입력하세요(구분자는 공백).");
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
				System.out.printf("binary search의 현 pivot 인덱스는 %d이고 원소 값은  %d이다.\n", pivot, array[pivot]);
				pivot = (pivot+max) / 2;
			} else if (array[pivot] > wantNum) {
				count++;
				System.out.printf("binary search의 현 pivot 인덱스는 %d이고 원소 값은  %d이다.\n", pivot, array[pivot]);
				pivot = pivot / 2;
			} else {
				count++;
				System.out.printf("binary search의 현 pivot 인덱스는 %d이고 원소 값은  %d이다.\n", pivot, array[pivot]);
				System.out.println("찾는 값을 " + count + "회 만에 발견하였다.");
				break;
			}
		}

	}
}
