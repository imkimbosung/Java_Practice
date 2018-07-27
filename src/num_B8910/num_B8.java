/*
 * �迭 ���� ��ǥ �� ã��(Recursive Binary Search)
 * ��� �޼ҵ�� �����Ͽ� ã�� ���� �ִ� �迭�� �ε����� ǥ����� �ض�.
 */

package num_B8910;
import java.util.Scanner;

public class num_B8 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
				
		System.out.println("���ĵ� ���� �迭�� ���Ҽ�, ���ҵ��� ��, ���� ��ǥ���� �Է��ϼ���. ");
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
			System.out.printf("Ž�� pivot�� �ε����� %d�̰�, ���ҵ��� ���� %d�̴�. \n" , pivot, array[pivot]);
			System.out.printf("ã�� �� %d�� �ε��� %d���� �߰��Ͽ���. " , goal, pivot);
			return 0;
		}
		else if(array[pivot] > goal) {
			System.out.printf("Ž�� pivot�� �ε����� %d�̰�, ���ҵ��� ���� %d�̴�. \n" , pivot, array[pivot]);
			pivot = (min + pivot)/2;
		}else if(array[pivot] < goal) {
			System.out.printf("Ž�� pivot�� �ε����� %d�̰�, ���ҵ��� ���� %d�̴�. \n" , pivot, array[pivot]);
			min = pivot;
			pivot = (pivot + array.length)/2;
		}
		
		return Binary(array,  goal, pivot, min);
	}
}
