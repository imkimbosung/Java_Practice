package num_1920B1;

import java.util.Scanner;
import java.util.Stack;

public class num_20 {
	public static void main(String args[]) {		
		System.out.println("������ ��ȣ ¦ ���߱� ���α׷��Դϴ�.");
		while (true) {
			Scanner input = new Scanner(System.in);
			Stack myStack = new Stack();

			
			System.out.println("�Ұ�ȣ '(' ')'�� �ִ� ������� �Է��ϼ���. ");
		    String line = input.nextLine();

			String inputStack[] = line.split("");

			// Stack�� �����ֱ�
			for (int i = 0; i < inputStack.length; i++) {
				myStack.push(inputStack[i]);
			}

			// ��ȣ �� ���
			int Count[] = count(myStack);
			
			//Count[0] = left ,[1] = right
			if (Count[0] == Count[1]) {
				System.out.println("��ȣ���� ¦�� �½��ϴ�. ");
			}else if(Count[0] > Count[1]) {
				System.out.println("���� ��ȣ�� �����ϴ�.");
				System.out.println("�Է��� ��ü �����: " + line);
			}else if(Count[0] < Count[1]) {
				System.out.println("������ ��ȣ�� �����ϴ�.");
				System.out.println("������ �߰ߵ� ��ġ������ ���ϰڽ��ϴ�~!!! ");
			}

			System.out.printf("������� �� �ֽ��ϱ�? (Y/N) >>");
			String YesOrNo = input.next();

			if (YesOrNo.equals("N") || YesOrNo.equals("n")) {
				System.out.println("\n ��ȣ ¦ ���߱� ���α׷��� �����մϴ�.");
				return;
			}

		}
	}

	public static int[] count(Stack myStack) {
		int leftCount = 0;
		int rightCount = 0;
		String compare;
		while (!myStack.isEmpty()) {
			compare = (String) myStack.pop();
			if (compare.equals(")")) {
				rightCount++;
			} else if (compare.equals("(")) {
				leftCount++;
			}

		}
			
		int Count[] = new int[2];
		Count[0] = leftCount;
		Count[1] = rightCount;
		return Count;
	}
}
