package num_5;

import java.util.Scanner;

public class Num_5 {
int number = 14681001;

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Num_5 Print = new Num_5();
		String name = null;
		
		System.out.printf("�л��� �̸��� �Է��ϼ���   >>");
		name = input.next();
		
		Print.print(name);
		
	}	
	
	 void print(String name) {
		System.out.println("���� �й��� " + number + "�̰� �̸��� " + name + "�Դϴ�. ");
	}
}

 
