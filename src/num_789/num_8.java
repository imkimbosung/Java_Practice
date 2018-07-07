package num_789;

import java.util.Scanner;

public class num_8 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		num_8_2 area = new num_8_2();

		System.out.println("직사각형의 가로와 세로를 연속으로 입력하세요(구분은 ' ') >>");
		float a = input.nextInt();
		float b = input.nextInt();
		System.out.println(a + "   ====   "+ b);
		float square = area.area(a, b);

		System.out.println("삼각형의 가로와 세로를 연속으로 입력하세요(구분은 ' ') >>");
		a = input.nextInt();
		b = input.nextInt();
		float triangle = area.area(a, b) / 2;

		System.out.println("원의 반지름을 입력하세요 >>");
		a = input.nextInt();
		float circle = area.area(a);

		System.out.println("직사각형의 넓이는 " + square + "이고, 삼각형의 넓이는 " + triangle + "이며, 원의 넓이는 " + circle + "이다.");

	}

}
