package num_131415;
import java.util.Scanner;

public class num_13 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("ù ������ �Է��ϼ���(�ܾ��� ������ ' '��)" );
		String firstLine = input.nextLine();
		
		System.out.println("�� ��° ������ �Է��ϼ���(�ܾ��� ������ ' '��)" );
		String secondLine = input.nextLine();
		
		String concat = firstLine.concat(" �׷��� "+ secondLine);
		
		System.out.println(concat);
		
	}
}
