package num_161718;
import java.util.Scanner;
import java.util.LinkedList;

public class num_18 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		LinkedList<String> dogList = new LinkedList<String>();
		
		
		System.out.println("기르는 개 5종의 이름을 한줄에 입력하세요(단어의 구분은 ' '임.");
		String inputDog = input.nextLine();
		String Dog[] = inputDog.split(" ");
		
		for(int i = 0; i < Dog.length; i++) {
			dogList.add(Dog[i]) ;
		}
		

		
		System.out.println("첫번째에 추가할 개의 이름을 입력하세요.");
		dogList.add(0, input.next());
		
		System.out.println("삭제할 개의 이름을 입력하세요.");
		String delete = input.next();
		for(int i =0 ; i < dogList.size() ; i++) {
			if(delete.equals(dogList.get(i))) {
				dogList.remove(i);
				System.out.println("개의 이름 " + delete + "를 목록에서 삭제하였습니다.");
				break;
			}
		}
		
		
		
		System.out.println("끝에 추가할 개의 이름을 입력하세요.");
		String Lastdog = input.next();
		int size = dogList.size();
		dogList.add(size ,Lastdog);
		
		for(int i =0; i < dogList.size() ; i++) {
			System.out.print(dogList.get(i) + " ");
		}
		int size2 = dogList.size() -1;
		
		System.out.println();
		for(int i = size2; i >= 0 ; i--) {
			System.out.print(dogList.get(i) + " ");
		}
		
	}
}
