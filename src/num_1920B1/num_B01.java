package num_1920B1;

import java.util.Scanner;

public class num_B01 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.printf("2�� ���� ���� �� ���ο� ���ʷ� �Է��Ͻÿ�>> ");
		int a = input.nextInt();
		int b = input.nextInt();
		Changevalue(a, b);
		
		System.out.println("����° ���� ���� �Է��Ͻÿ�");
		int c = input.nextInt();
		Changevalue(b,a,c);
		
		System.out.println("�迭 ���� ���� ���� ���� �� �ٿ� ���ʷ� �Է��Ͻÿ� ");
		int number = input.nextInt();
		int array[] = new int[number+1];
		int arrayLe = array.length;
		for(int i = 0; i < arrayLe-1 ; i++) {
			array[i] = input.nextInt();
		}
		ChangeArray(array, arrayLe);
	}

	public static void Changevalue(int a, int b) {
		int pin = 0;
		pin = a;
		a = b;
		b = pin;
		System.out.printf("\n �κ����� ��ȯ�� ���� a=[" + a + "], b=[" + b + "] �Դϴ�. \n");
	}

	public static void Changevalue(int a, int b, int c) {
		int pin = 0;
		pin = a;
		a = b;
		b = c;
		c = pin;
		System.out.println("�������� ��ȯ�� ���� a=[" + a +"], b=[" + b + "], c=[" + c + "] �Դϴ�.");
	}
	
	public static void ChangeArray(int array[], int arrayLe) {
		array[arrayLe-1] = array[0];
		for(int i=0 ; i < array.length-1 ; i++) {
			array[i] = array[i+1];
		}
		array[arrayLe-2] = array[arrayLe-1];
		
		for(int i=0 ; i < array.length-1 ; i++) {
			System.out.printf("[ " + array[i] +" ] ");
		}
		
	}
}
