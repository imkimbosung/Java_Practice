package num_161718;
import java.util.Scanner;
import java.util.LinkedList;

public class num_18 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		LinkedList<String> dogList = new LinkedList<String>();
		
		
		System.out.println("�⸣�� �� 5���� �̸��� ���ٿ� �Է��ϼ���(�ܾ��� ������ ' '��.");
		String inputDog = input.nextLine();
		String Dog[] = inputDog.split(" ");
		
		for(int i = 0; i < Dog.length; i++) {
			dogList.add(Dog[i]) ;
		}
		

		
		System.out.println("ù��°�� �߰��� ���� �̸��� �Է��ϼ���.");
		dogList.add(0, input.next());
		
		System.out.println("������ ���� �̸��� �Է��ϼ���.");
		String delete = input.next();
		for(int i =0 ; i < dogList.size() ; i++) {
			if(delete.equals(dogList.get(i))) {
				dogList.remove(i);
				System.out.println("���� �̸� " + delete + "�� ��Ͽ��� �����Ͽ����ϴ�.");
				break;
			}
		}
		
		
		
		System.out.println("���� �߰��� ���� �̸��� �Է��ϼ���.");
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
