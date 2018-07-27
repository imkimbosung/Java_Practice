/*
 * 배열 속의 목표 값 찾기(Recursive Binary Search)
 * 재귀 메소드로 구현하여 찾은 값이 있는 배열의 인덱스를 표준출력 해라.
 */

package num_B8910;
import java.util.Scanner;

public class num_B8 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
				
		System.out.println("정렬된 정수 배열의 원소수, 원소들의 값, 끝에 목표값을 입력하세요. ");
		int array[] = new int[input.nextInt()];
		
		for(int i = 0; i < array.length ; i++) {
			array[i] = input.nextInt();
		}
		
		int goal = input.nextInt();
		int pivot = array.length/2;
		int min = 0;
		Binary(array, goal, pivot, min);
		
	}
	
	public static int Binary(int[] array, int goal,int pivot, int min) {
		if(array[pivot] == goal) {
			System.out.printf("탐색 pivot의 인덱스는 %d이고, 원소들의 값은 %d이다. \n" , pivot, array[pivot]);
			System.out.printf("찾는 값 %d를 인덱스 %d에서 발견하였다. " , goal, pivot);
			return 0;
		}
		else if(array[pivot] > goal) {
			System.out.printf("탐색 pivot의 인덱스는 %d이고, 원소들의 값은 %d이다. \n" , pivot, array[pivot]);
			pivot = (min + pivot)/2;
		}else if(array[pivot] < goal) {
			System.out.printf("탐색 pivot의 인덱스는 %d이고, 원소들의 값은 %d이다. \n" , pivot, array[pivot]);
			min = pivot;
			pivot = (pivot + array.length)/2;
		}
		
		return Binary(array,  goal, pivot, min);
	}
}
