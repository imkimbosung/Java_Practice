package num_1920B1;

import java.util.Scanner;
import java.util.Stack;

public class num_20 {
	public static void main(String args[]) {		
		System.out.println("수식의 괄호 짝 맞추기 프로그램입니다.");
		while (true) {
			Scanner input = new Scanner(System.in);
			Stack myStack = new Stack();

			
			System.out.println("소괄호 '(' ')'가 있는 연산식을 입력하세요. ");
		    String line = input.nextLine();

			String inputStack[] = line.split("");

			// Stack에 정보넣기
			for (int i = 0; i < inputStack.length; i++) {
				myStack.push(inputStack[i]);
			}

			// 괄호 수 계산
			int Count[] = count(myStack);
			
			//Count[0] = left ,[1] = right
			if (Count[0] == Count[1]) {
				System.out.println("괄호들의 짝이 맞습니다. ");
			}else if(Count[0] > Count[1]) {
				System.out.println("왼쪽 괄호가 많습니다.");
				System.out.println("입력한 전체 연산식: " + line);
			}else if(Count[0] < Count[1]) {
				System.out.println("오른쪽 괄호가 많습니다.");
				System.out.println("오류가 발견된 위치까지는 못하겠습니다~!!! ");
			}

			System.out.printf("연산식이 더 있습니까? (Y/N) >>");
			String YesOrNo = input.next();

			if (YesOrNo.equals("N") || YesOrNo.equals("n")) {
				System.out.println("\n 괄호 짝 맞추기 프로그램을 종료합니다.");
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
