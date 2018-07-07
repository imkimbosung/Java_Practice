package num_131415;

import java.util.Scanner;

public class num_14 {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer();
		Scanner input = new Scanner(System.in);

		System.out.println("첫 문장을 입력하세요(단어의 구분은 ' '임)");
		String firstLine = input.nextLine();

		System.out.println("두 번째 문장을 입력하세요(단어의 구분은 ' '임)");
		String secondLine = input.nextLine();

		sb.append(firstLine);
		sb.append(" 그러나 ");
		sb.append(secondLine);

		System.out.println(sb.toString());

	}
}
