package num_789;

import java.util.Scanner;

public class num_9 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		num_9_2[] Point = new num_9_2[1];
		
		System.out.println("��ǥ B���� X,Y ��ǥ ���� ���ʷ� �Է��ϼ���. >> ");
		int pointX = input.nextInt() ;
		int pointY = input.nextInt() ;
		Point[0] = new num_9_2(pointX,pointY);
		
		int route = Point[0].routeCount();	
		System.out.println("��ǥ A���� B�� �����ϴ� �ִ� �Ÿ� route�� ������ "+ route  +"���Դϴ�.");
		
	}
}
