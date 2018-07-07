package num_2;
import java.util.Scanner;


public class Num_2 {
 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 
	 System.out.println("검증할 문장을 입력하세요(단어의 구분은 공백 입니다.)");
	 
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
