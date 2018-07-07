package num_1920B1;

import java.util.Scanner;

public class num_B01 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.printf("2개 변수 값을 한 라인에 차례로 입력하시오>> ");
		int a = input.nextInt();
		int b = input.nextInt();
		Changevalue(a, b);
		
		System.out.println("세번째 변수 값을 입력하시오");
		int c = input.nextInt();
		Changevalue(b,a,c);
		
		System.out.println("배열 원소 수와 원소 값을 한 줄에 차례로 입력하시오 ");
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
		System.out.printf("\n 두변수를 교환한 값은 a=[" + a + "], b=[" + b + "] 입니다. \n");
	}

	public static void Changevalue(int a, int b, int c) {
		int pin = 0;
		pin = a;
		a = b;
		b = c;
		c = pin;
		System.out.println("세변수를 교환한 값은 a=[" + a +"], b=[" + b + "], c=[" + c + "] 입니다.");
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
