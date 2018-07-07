package num_4;
import java.io.*;


public class Num_4 {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
					
	
			bw.write("���� �ڿ����� ������ ã�� ��ǥ ���� ���� �Է��ϼ���. (�����ڴ� ����) >> \n");
			bw.flush();	// ���۰� �� ���� �ʾƵ� ������ش�.	
		
			String EX[] = br.readLine().split(" "); // ���۷� �о� �����鼭 �������� ������.
			BinarySearch(Integer.parseInt(EX[0]), Integer.parseInt(EX[1]));
			bw.close();	
	}
	
	public static void BinarySearch(int max, int goal) {
		
		int count = 0 , low = 0 , pivot = 0;		
		
		int[] dataArr = new int[max+1]; // ���ϴ� ������ �迭 �̶� ���� ���ش�.
		
		// �迭 ũ�⿡ �ϳ��� �־��ش�.
		for(int i = 0 ; i < dataArr.length; i++){
				dataArr[i] = i;
			}  
		
		while(low <= max) {
			count++;
			pivot = (low + max) /2;
			System.out.println("binary search�� ���� pivot�� " + pivot + "�̴�.");
			if(dataArr[pivot] > goal) {max = pivot -1 ; }			
			else if(dataArr[pivot] < goal) {low = pivot + 1; }			
			else break;
			
		}
		System.out.println("ã�� ���� " + count + " ȸ ���� �߰��Ͽ���.");
			
	}
}
