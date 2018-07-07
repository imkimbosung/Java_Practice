package num_789;

import java.util.Scanner;

public class num_7 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("������ ��� A, B�� ��� ���� ���ڸ� �����Ͽ� �Է��ϼ���(������ ' ')");
		
		int row = input.nextInt();
		int column = input.nextInt();
		
		int arrayA[][] = new int[row][column];
		int arrayB[][] = new int[row][column];
		
		System.out.println(row +" X " + column + " ��� A�� ���� " + (row*column) + "���� �����Ͽ� �Է��ϼ���(������ ����)");
		for (int i = 0 ; i < row ; i++) {
			for(int j = 0; j < column ; j++) {
				arrayA[i][j] = input.nextInt();
			}
		}
		
		System.out.println(row +" X " + column + " ��� B�� ���� " + (row*column) + "���� �����Ͽ� �Է��ϼ���(������ ����)");
		for (int i = 0 ; i < row ; i++) {
			for(int j = 0; j < column ; j++) {
				arrayB[i][j] = input.nextInt();
			}
		}
		
		int array[][] = arraySum(arrayA, arrayB);
		
		for (int i = 0 ; i < row ; i++) {
			for(int j = 0; j < column ; j++) {
				System.out.print("[" + array[i][j] + "] ");
			}
			System.out.println();
		}
		
	}
	
	static int[][] arraySum(int arrayA[][], int arrayB[][]) {
		for (int i = 0 ; i < arrayB.length ; i++) {
			for(int j = 0; j < arrayB[i].length  ; j++) {
				arrayA[i][j] += arrayB[i][j];
			}
		}
		return arrayA;
	}
}
