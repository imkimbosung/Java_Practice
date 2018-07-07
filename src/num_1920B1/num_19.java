package num_1920B1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class num_19 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Queue que = new LinkedList();

		System.out.println("기르는 개 5종의 이름을 한줄에 입력하세요(구분은 ' ')");
		String Dogs = input.nextLine();

		String arrayDogs[] = Dogs.split(" ");

		for (int i = 0; i < arrayDogs.length; i++) {
			que.offer(arrayDogs[i]);
		}

		System.out.println("끝에 추가할 개의 이름을 입력하세요. ");
		String lastDog = input.next();

		que.offer(lastDog);

		System.out.println("삭제할 개의 이름을 입력하세요. ");
		String deleteDog = input.next();

		String output = (String) que.poll();

		if (deleteDog.equals(output) == false) {
			System.out.println("큐에서는 첫번째 원소만 삭제됩니다. " + output + "를(을) 잘못꺼냈으므로 다시넣었습니다.");
			que.offer(output);

			System.out.println("큐의 첫원소를 꺼낼까요?? (Y/N)");
			String answer = input.next();
			System.out.println(answer);
			if (answer.equals("Y") || answer.equals("y")) {
				deleteDog = (String) que.poll();
				System.out.println("첫번째 원소 " + deleteDog + "를(을) 삭제하였습니다.");
			} else {
				System.out.println("첫번째 원소를 삭제하지 않았습니다. ");
			}

		}else {
			System.out.println(deleteDog + "가 삭제 되었습니다.");
		}
		
		System.out.println("큐에서 모든원소를 꺼내어 목록을 보여줍니다. ");
		while (que.peek() != null) {
			String print = (String) que.poll();
			System.out.printf(print + ", ");
		}
		System.out.printf("\n 큐의끝으로 탐색이 종료됩니다.");
	}

}
