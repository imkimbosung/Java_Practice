package num_101112;

import java.util.Scanner;

public class Num_10 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Num_10_1[] Information = new Num_10_1[6];
		String name, major;
		int stuNum;
		int year;
		double grade;

		System.out.println("����ó���� �ʿ��� 3���� �л� ����� �Է��Ͻÿ�.(�����ڴ� ' '��)");

		for (int i = 0; i < 3; i++) {
			System.out.println("�̸�(�ѱ�) �й�(����) �а� ���ʷ� �Է�>> ");
			name = input.next();
			stuNum = input.nextInt();
			major = input.next();
			Information[i] = new Num_10_1(name, stuNum, major);
		}

		System.out.println("�а����� �ʿ��� 3���� �л������ �Է��Ͻÿ�.(�����ڴ�  ' '��)");

		for (int i = 0; i < 3; i++) {
			System.out.println(
					Information[i].getname() + ", �й� " + Information[i].getstuNum() + "�л��� �г�(�ڿ���)�� ����(�Ǽ�)�� ���ʷ� �Է�>> ");
			year = input.nextInt();
			grade = input.nextDouble();
			Information[i + 3] = new Num_10_1(year, grade);
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("�̸�: " + Information[i].getname() + ", �й�: " + Information[i].getstuNum() + ", �а�: "
					+ Information[i].getmajor() + ", �г�: " + Information[i + 3].getyear() + ", ����: "
					+ Information[i + 3].getgrade());
		}
	}
}
