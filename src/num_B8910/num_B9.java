/*
 * 배열 속의 목표 값 찾기(보간법 : Interpolation Search)
 * 이진 탐색을 더 개선한 보간탐색 방법과 재귀 메소드를 결합하여 구현하고 목표 값을 찾은 배열의 인덱스를 표준출력해라.
 */

package num_B8910;
import java.util.Scanner;

public class num_B9 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("정렬된 정수 배열의 원소수, 원소들의 값, 끝에 목표 값을 입력하세요(구분자는 공백). ");
		int array[] = new int[input.nextInt()];
		
		for(int i = 0; i < array.length ; i++) {
			array[i] = input.nextInt();
		}
		
		int goal = input.nextInt();
		int pivot = 0;
		int min = 0;
		int max = array.length - 1;
		interpolation(array, goal, pivot, min, max);
		
	}
	
	public static int interpolation(int[] array, int goal, int pivot, int min, int max) {
		// Interpolation Search공식
		pivot = min + (max - min) * (goal - array[min]) / (array[max] - array[min]);
		
		if(array[pivot] == goal) {
			System.out.printf("탐색 pivot의 인덱스는 %d이고, 원소들의 값은 %d이다. \n" , pivot, array[pivot]);
			System.out.printf("찾는 값 %d를 인덱스 %d에서 발견하였다. " , goal, pivot);
			return 0;
		}else if(array[pivot] < goal) {
			System.out.printf("탐색 pivot의 인덱스는 %d이고, 원소들의 값은 %d이다. \n" , pivot, array[pivot]);
			min = pivot + 1;
		}else if(array[pivot] > goal) {
			System.out.printf("탐색 pivot의 인덱스는 %d이고, 원소들의 값은 %d이다. \n" , pivot, array[pivot]);
			max = pivot - 1;
		}
		
		return interpolation(array, goal, pivot, min, max);
	}
}

