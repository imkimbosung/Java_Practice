package num_1;
import java.util.Scanner;

public class Num_1 {
 public static void main(String[] args) {
	 Scanner input =new Scanner(System.in);
	 
	 System.out.println("����� �� �ڿ����� ������ �Է��Ͻÿ� >> ");
	 int size = input.nextInt();
	 int[] number=new int[size];
	 System.out.println(size + "���� �ڿ����� �Է��Ͻÿ� (�����ڴ� ����) >>");
	 	
	 for(int i =0;i < number.length; i++) {
		 number[i] = input.nextInt();
		 System.out.print(number[i] + " ");
		 if(i % 5 == 4) {
			 System.out.println();
		 }
	 }	
 }
 
}

