package num_2;
import java.util.Scanner;


public class Num_2 {
 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 
	 System.out.println("������ ������ �Է��ϼ���(�ܾ��� ������ ���� �Դϴ�.)");
	 
	 String[] Line = new String[50];
	 
	 for(int i = 0; i < Line.length; i++) {
		 Line[i] = input.next();
		 if(i%5 == 0) {
			 System.out.println();
		 }
		 System.out.print(Line[i] + ", ");
		 
	 }
	 
	 
 }
}
