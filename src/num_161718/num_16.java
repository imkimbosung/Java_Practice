package num_161718;
import java.util.Scanner;
import java.util.ArrayList;

public class num_16 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> dogList = new ArrayList<String>();
		
		
		System.out.println("�⸣�� �� 5���� �̸��� ���ٿ� �Է��ϼ���(�ܾ��� ������ ' '��.");
		String inputDog = input.nextLine();
		String Dog[] = inputDog.split(" ");
		
		for(int i = 0; i < Dog.length; i++) {
			dogList.add(Dog[i]) ;
		}
		

		
		System.out.println("���� �տ� ������ ���� ������ �Է��ϼ���.");
		dogList.add(0, input.next());
		
		System.out.println("������ ���� ������ �Է��ϼ���.");
		String delete = input.next();
		for(int i =0 ; i < dogList.size() ; i++) {
			if(delete.equals(dogList.get(i))) {
				dogList.remove(i);
				break;
			}
		}
		
		
		
		System.out.println("�������� ÷���� ���� ������ �Է��ϼ���.");
		String Lastdog = input.next();
		int size = dogList.size();
		dogList.add(size ,Lastdog);
		
		for(int i =0; i < dogList.size() ; i++) {
			System.out.print(dogList.get(i) + " ");
		}
		
	}
}
