package num_789;

import java.util.Scanner;

public class num_8 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		num_8_2 area = new num_8_2();

		System.out.println("���簢���� ���ο� ���θ� �������� �Է��ϼ���(������ ' ') >>");
		float a = input.nextInt();
		float b = input.nextInt();
		System.out.println(a + "   ====   "+ b);
		float square = area.area(a, b);

		System.out.println("�ﰢ���� ���ο� ���θ� �������� �Է��ϼ���(������ ' ') >>");
		a = input.nextInt();
		b = input.nextInt();
		float triangle = area.area(a, b) / 2;

		System.out.println("���� �������� �Է��ϼ��� >>");
		a = input.nextInt();
		float circle = area.area(a);

		System.out.println("���簢���� ���̴� " + square + "�̰�, �ﰢ���� ���̴� " + triangle + "�̸�, ���� ���̴� " + circle + "�̴�.");

	}

}
