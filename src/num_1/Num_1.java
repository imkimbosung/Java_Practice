package num_1;
import java.util.Scanner;

public class Num_1 {
 public static void main(String[] args) {
	 Scanner input =new Scanner(System.in);
	 
	 System.out.println("입출력 할 자연수의 갯수를 입력하시오 >> ");
	 int size = input.nextInt();
	 int[] number=new int[size];
	 System.out.println(size + "개의 자연수를 입력하시오 (구분자는 공백) >>");
	 	
	 for(int i =0;i < number.length; i++) {
		 number[i] = input.nextInt();
		 System.out.print(number[i] + " ");
		 if(i % 5 == 4) {
			 System.out.println();
		 }
	 }	
 }
 
}

