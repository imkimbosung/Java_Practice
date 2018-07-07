package num_131415;
import java.util.Scanner;

public class num_13 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("첫 문장을 입력하세요(단어의 구분은 ' '임)" );
		String firstLine = input.nextLine();
		
		System.out.println("두 번째 문장을 입력하세요(단어의 구분은 ' '임)" );
		String secondLine = input.nextLine();
		
		String concat = firstLine.concat(" 그러나 "+ secondLine);
		
		System.out.println(concat);
		
	}
}
