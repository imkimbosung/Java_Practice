/*
 * �迭 ���� ��ǥ �� ã��(������ : Interpolation Search)
 * ���� Ž���� �� ������ ����Ž�� ����� ��� �޼ҵ带 �����Ͽ� �����ϰ� ��ǥ ���� ã�� �迭�� �ε����� ǥ������ض�.
 */

package num_B8910;
import java.util.Scanner;

public class num_B9 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("���ĵ� ���� �迭�� ���Ҽ�, ���ҵ��� ��, ���� ��ǥ ���� �Է��ϼ���(�����ڴ� ����). ");
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
		// Interpolation Search����
		pivot = min + (max - min) * (goal - array[min]) / (array[max] - array[min]);
		
		if(array[pivot] == goal) {
			System.out.printf("Ž�� pivot�� �ε����� %d�̰�, ���ҵ��� ���� %d�̴�. \n" , pivot, array[pivot]);
			System.out.printf("ã�� �� %d�� �ε��� %d���� �߰��Ͽ���. " , goal, pivot);
			return 0;
		}else if(array[pivot] < goal) {
			System.out.printf("Ž�� pivot�� �ε����� %d�̰�, ���ҵ��� ���� %d�̴�. \n" , pivot, array[pivot]);
			min = pivot + 1;
		}else if(array[pivot] > goal) {
			System.out.printf("Ž�� pivot�� �ε����� %d�̰�, ���ҵ��� ���� %d�̴�. \n" , pivot, array[pivot]);
			max = pivot - 1;
		}
		
		return interpolation(array, goal, pivot, min, max);
	}
}

