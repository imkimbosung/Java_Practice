/*  
  	��Ŭ������ �ִ� ����� ���ϱ�(Largest Common Devider)
	���� �� �ڿ����� �ִ� ������� ������ ������� ���Ѵ�.
	1. ��Ŭ������ ������ + ����Լ�,  2. ��Ŭ������ ȣ���� + ���
	3. ��Ŭ������ ȣ���� + ����Լ�,  4. �츮�� ���������� Ǫ�� ���μ� ���ع�
*/

package num_B234;

import java.util.Scanner;

public class num_B03 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.printf("������ 2�� �ڿ����� ���� �Է��ϼ���(�����ڴ� ����). >> ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();

		Euclidean_control(number1, number2);
		System.out.printf("\n��Ŭ���� ȣ����(���): �� �� %d�� %d�� �ִ� ������� %d�Դϴ�.", number1, number2,
				Euclidean_control(number1, number2));
		Euclidean_reflection(number1, number2);
		System.out.printf("\n��Ŭ���� ȣ����(���): �� �� %d�� %d�� �ִ� ������� %d�Դϴ�.", number1, number2,
				Euclidean_reflection(number1, number2));
		prime_factorization(number1, number2);
	}

	public static int Euclidean_control(int number1, int number2) {
		int result = 0;
		while (true) {
			result = number1 % number2;
			number1 = number2;
			number2 = result;
			if (number2 == 0)
				break;
		}
		return number1;

	}

	public static int Euclidean_reflection(int number1, int number2) {
		if (number2 == 0)
			return number1;
		number1 = number1 % number2;

		return Euclidean_reflection(number2, number1);
	}
	
	public static int prime_factorization(int number1, int number2) {
		
		return 0;
	}
}
