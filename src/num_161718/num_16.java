package num_161718;
import java.util.Scanner;
import java.util.ArrayList;

public class num_16 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> dogList = new ArrayList<String>();
		
		
		System.out.println("기르는 개 5종의 이름을 한줄에 입력하세요(단어의 구분은 ' '임.");
		String inputDog = input.nextLine();
		String Dog[] = inputDog.split(" ");
		
		for(int i = 0; i < Dog.length; i++) {
			dogList.add(Dog[i]) ;
		}
		

		
		System.out.println("제일 앞에 삽입할 개의 종류를 입력하세요.");
		dogList.add(0, input.next());
		
		System.out.println("삭제할 개의 종류를 입력하세요.");
		String delete = input.next();
		for(int i =0 ; i < dogList.size() ; i++) {
			if(delete.equals(dogList.get(i))) {
				dogList.remove(i);
				break;
			}
		}
		
		
		
		System.out.println("마지막에 첨가할 개의 종류를 입력하세요.");
		String Lastdog = input.next();
		int size = dogList.size();
		dogList.add(size ,Lastdog);
		
		for(int i =0; i < dogList.size() ; i++) {
			System.out.print(dogList.get(i) + " ");
		}
		
	}
}
