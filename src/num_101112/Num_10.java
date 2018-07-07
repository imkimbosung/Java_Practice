package num_101112;

import java.util.Scanner;

public class Num_10 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Num_10_1[] Information = new Num_10_1[6];
		String name, major;
		int stuNum;
		int year;
		double grade;

		System.out.println("교무처에서 필요한 3명의 학생 명단을 입력하시오.(구분자는 ' '임)");

		for (int i = 0; i < 3; i++) {
			System.out.println("이름(한글) 학번(정수) 학과 차례로 입력>> ");
			name = input.next();
			stuNum = input.nextInt();
			major = input.next();
			Information[i] = new Num_10_1(name, stuNum, major);
		}

		System.out.println("학과에서 필요한 3명의 학생명단을 입력하시오.(구분자는  ' '임)");

		for (int i = 0; i < 3; i++) {
			System.out.println(
					Information[i].getname() + ", 학번 " + Information[i].getstuNum() + "학생의 학년(자연수)과 학점(실수)을 차례로 입력>> ");
			year = input.nextInt();
			grade = input.nextDouble();
			Information[i + 3] = new Num_10_1(year, grade);
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("이름: " + Information[i].getname() + ", 학번: " + Information[i].getstuNum() + ", 학과: "
					+ Information[i].getmajor() + ", 학년: " + Information[i + 3].getyear() + ", 학점: "
					+ Information[i + 3].getgrade());
		}
	}
}
