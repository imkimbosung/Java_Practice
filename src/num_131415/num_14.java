package num_131415;

import java.util.Scanner;

public class num_14 {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer();
		Scanner input = new Scanner(System.in);

		System.out.println("ù ������ �Է��ϼ���(�ܾ��� ������ ' '��)");
		String firstLine = input.nextLine();

		System.out.println("�� ��° ������ �Է��ϼ���(�ܾ��� ������ ' '��)");
		String secondLine = input.nextLine();

		sb.append(firstLine);
		sb.append(" �׷��� ");
		sb.append(secondLine);

		System.out.println(sb.toString());

	}
}
