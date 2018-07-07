package num_4;
import java.io.*;


public class Num_4 {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
					
	
			bw.write("임의 자연수의 범위와 찾을 목표 값을 연속 입력하세요. (구분자는 공백) >> \n");
			bw.flush();	// 버퍼가 다 차지 않아도 출력해준다.	
		
			String EX[] = br.readLine().split(" "); // 버퍼로 읽어 들어오면서 공백으로 나눈다.
			BinarySearch(Integer.parseInt(EX[0]), Integer.parseInt(EX[1]));
			bw.close();	
	}
	
	public static void BinarySearch(int max, int goal) {
		
		int count = 0 , low = 0 , pivot = 0;		
		
		int[] dataArr = new int[max+1]; // 원하는 범위랑 배열 이랑 같게 해준다.
		
		// 배열 크기에 하나씩 넣어준다.
		for(int i = 0 ; i < dataArr.length; i++){
				dataArr[i] = i;
			}  
		
		while(low <= max) {
			count++;
			pivot = (low + max) /2;
			System.out.println("binary search의 현재 pivot은 " + pivot + "이다.");
			if(dataArr[pivot] > goal) {max = pivot -1 ; }			
			else if(dataArr[pivot] < goal) {low = pivot + 1; }			
			else break;
			
		}
		System.out.println("찾는 값을 " + count + " 회 만에 발견하였다.");
			
	}
}
