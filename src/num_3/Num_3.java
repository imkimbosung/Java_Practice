package num_3;

import java.util.Scanner;

public class Num_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("������ 2�ڸ� ���� 2���� ���� �Է��ϼ���(�����ڴ� ����). >> ");
		int fnum = input.nextInt();
		int snum = input.nextInt();
		
		// ���� ����
		int multi1 = (fnum * snum);
		
		// �ϻ� ����
		int multi2 = ((fnum/10)*(snum/10)*100 + (fnum%10)*(snum%10)) + ((fnum/10)*(snum%10) + (snum/10)*(fnum%10))*10 ;
		
		System.out.println("�ϻ� �˰��� ����� " + multi2 +  "�̰�, ���� ���� ����� " + multi1 + "�Դϴ�. ");

	}
}
