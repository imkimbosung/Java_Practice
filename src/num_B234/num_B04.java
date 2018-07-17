/*  
  	Factorial
  	������ �ڿ��� n�� ���� ���� n ! �� ���.
  	1. �ݺ���  2. ����Լ�
*/

package num_B234;

import java.util.Scanner;

public class num_B04 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.printf("������ �ڿ����� �Է��Ͻÿ� >> ");
		int Number = input.nextInt();

		control(Number);
		reflection(Number);
		System.out.printf("\n����Լ�: %d! = %d �Դϴ�.", Number, reflection(Number));
	}

	public static void control(int Number) {
		int factorial = 1;
		for (int i = 1; i <= Number; i++) {
			factorial = factorial * i;
		}
		System.out.printf("�ݺ���: %d! = %d �Դϴ�.", Number, factorial);
	}

	public static int reflection(int Number) {
		if (Number == 1)
			return Number;

		return reflection(Number - 1) * Number;
	}

}
