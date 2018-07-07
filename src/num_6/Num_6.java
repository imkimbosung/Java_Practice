package num_6;

import java.util.Scanner;

public class Num_6 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Num_6 Function = new Num_6();
		int num = 0; // Recursion호출을 위한 숫자.
		
		System.out.println("배열의 원소를 한 라인에 연속하여 입력하세요(첫 수는 원소 갯수, 숫자의 구분은 ' ')");
		int arraylength = input.nextInt();		
		int array[] = new int[arraylength];
		
		for(int i =0 ; i < arraylength ; i++) {
			array[i] = input.nextInt();
		}
		
		Function.loop(array);
		Function.Recursion(array , num);
	}
	
	void loop(int array[]){
		int arraySum = 0;
		double arrayAverage = 0;
		for(int i = 0; i< array.length; i++) {
			arraySum = arraySum + array[i];
		}
		arrayAverage = arraySum / array.length ;
		
		System.out.println("반복문: 원소수 " + array.length + "개인 배열의 합은 " + arraySum + "이고, 평균은  " + arrayAverage + "입니다.");
	}
	
	int Recursion(int array[], int num) {
	 
		if(num == (array.length -1) ) {
			double arrayAverage = array[num]/array.length;
			System.out.println("반복문: 원소수 " + array.length + "개인 배열의 합은 " + array[num] + "이고, 평균은  " + arrayAverage + "입니다.");
			return 0;
		}
		else {
			array[num+1] = array[num] + array[num+1];
			num++;
		} 
		
		return Recursion(array, num);
	}	
}
