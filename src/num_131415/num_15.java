package num_131415;
import java.util.Scanner;
import java.util.StringTokenizer;

public class num_15 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("첫 문장을 입력하세요(단어의 구분은 ' '임)" );
		String firstLine = input.nextLine();
		
		System.out.println("두 번째 문장을 입력하세요(단어의 구분은 ' '임)" );
		String secondLine = input.nextLine();
		
		tokenizer(firstLine,secondLine);
		split(firstLine,secondLine);
		buffer(firstLine,secondLine);
	}
	
	public static void tokenizer(String first, String second) {
		StringTokenizer values = new StringTokenizer(first +" 그러나 "+ second);
		
		for (int i = 1 ; values.hasMoreElements();i++ ) {
			System.out.printf(values.nextToken()+ " ");
		}
		System.out.println();
	}
	
	public static void split(String first, String second) {
		String valuesF[] = first.split(" ");
		String valuesS[] = second.split(" ");
		
		for(int i = 0 ; i < (valuesF.length) ; i++) {
			System.out.printf(valuesF[i] + " ");
		}
		System.out.printf("그러나 ");
		for(int i = 0 ; i < (valuesS.length) ; i++) {
			System.out.printf(valuesS[i] + " ");
		}
			System.out.println();
	}
	
	public static void buffer(String first, String second) {
		StringTokenizer values = new StringTokenizer(first +" 그러나 "+ second);
		StringBuffer sb = new StringBuffer();
		for(int i = 1 ; values.hasMoreElements(); i++) {
			sb.append(values.nextToken() + " ");
		}
		System.out.printf(sb.toString());
	}

}
