package num_6;

import java.util.Scanner;

public class Num_6 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Num_6 Function = new Num_6();
		int num = 0; // Recursionȣ���� ���� ����.
		
		System.out.println("�迭�� ���Ҹ� �� ���ο� �����Ͽ� �Է��ϼ���(ù ���� ���� ����, ������ ������ ' ')");
		int arraylength = input.nextInt();		
		int array[] = new int[arraylength];
		
		for(int i =0 ; i < arraylength ; i++) {
			array[i] = input.nextInt();
		}
		
		Function.loop(array);
		Function.Recursion(array , num);
	}
	
	void loop(int array[]){
		int arraySum = 0;
		double arrayAverage = 0;
		for(int i = 0; i< array.length; i++) {
			arraySum = arraySum + array[i];
		}
		arrayAverage = arraySum / array.length ;
		
		System.out.println("�ݺ���: ���Ҽ� " + array.length + "���� �迭�� ���� " + arraySum + "�̰�, �����  " + arrayAverage + "�Դϴ�.");
	}
	
	int Recursion(int array[], int num) {
	 
		if(num == (array.length -1) ) {
			double arrayAverage = array[num]/array.length;
			System.out.println("�ݺ���: ���Ҽ� " + array.length + "���� �迭�� ���� " + array[num] + "�̰�, �����  " + arrayAverage + "�Դϴ�.");
			return 0;
		}
		else {
			array[num+1] = array[num] + array[num+1];
			num++;
		} 
		
		return Recursion(array, num);
	}	
}
