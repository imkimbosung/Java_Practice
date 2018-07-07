package num_789;

import java.util.Scanner;

public class num_9 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		num_9_2[] Point = new num_9_2[1];
		
		System.out.println("목표 B점의 X,Y 좌표 값을 차례로 입력하세요. >> ");
		int pointX = input.nextInt() ;
		int pointY = input.nextInt() ;
		Point[0] = new num_9_2(pointX,pointY);
		
		int route = Point[0].routeCount();	
		System.out.println("좌표 A에서 B에 도달하는 최단 거리 route의 갯수는 "+ route  +"개입니다.");
		
	}
}
