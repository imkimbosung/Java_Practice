package num_1920B1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class num_19 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Queue que = new LinkedList();

		System.out.println("�⸣�� �� 5���� �̸��� ���ٿ� �Է��ϼ���(������ ' ')");
		String Dogs = input.nextLine();

		String arrayDogs[] = Dogs.split(" ");

		for (int i = 0; i < arrayDogs.length; i++) {
			que.offer(arrayDogs[i]);
		}

		System.out.println("���� �߰��� ���� �̸��� �Է��ϼ���. ");
		String lastDog = input.next();

		que.offer(lastDog);

		System.out.println("������ ���� �̸��� �Է��ϼ���. ");
		String deleteDog = input.next();

		String output = (String) que.poll();

		if (deleteDog.equals(output) == false) {
			System.out.println("ť������ ù��° ���Ҹ� �����˴ϴ�. " + output + "��(��) �߸��������Ƿ� �ٽó־����ϴ�.");
			que.offer(output);

			System.out.println("ť�� ù���Ҹ� �������?? (Y/N)");
			String answer = input.next();
			System.out.println(answer);
			if (answer.equals("Y") || answer.equals("y")) {
				deleteDog = (String) que.poll();
				System.out.println("ù��° ���� " + deleteDog + "��(��) �����Ͽ����ϴ�.");
			} else {
				System.out.println("ù��° ���Ҹ� �������� �ʾҽ��ϴ�. ");
			}

		}else {
			System.out.println(deleteDog + "�� ���� �Ǿ����ϴ�.");
		}
		
		System.out.println("ť���� �����Ҹ� ������ ����� �����ݴϴ�. ");
		while (que.peek() != null) {
			String print = (String) que.poll();
			System.out.printf(print + ", ");
		}
		System.out.printf("\n ť�ǳ����� Ž���� ����˴ϴ�.");
	}

}
