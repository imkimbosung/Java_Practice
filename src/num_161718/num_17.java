package num_161718;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class num_17 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
				
		System.out.println("�⸣�� ������ �ĺ���ȣ�� �̸��� ���ٿ� �Է��ϼ��� ������ ' ' ��");
		String Dogs = input.nextLine();
		
		String arrDog[] = Dogs.split(" ");
	
		for(int i = 0 ; i + 1 < arrDog.length ; i = i+2) {
			map.put(new Integer(arrDog[i]), arrDog[i+1]);
		}
		
		System.out.println("�߰��� ���� �ĺ���ȣ�� �̸��� �Է��ϼ���.");
		map.put(input.nextInt(), input.next());
		
		System.out.println("������ ���� �ĺ���ȣ�� �Է��ϼ���.");
		map.remove(input.nextInt());
		
		System.out.println("�߰��� ���� �ĺ���ȣ�� �̸��� �Է��ϼ���.");
		map.put(input.nextInt(), input.next());
		
		Iterator<Integer> iterator = map.keySet().iterator();
		
	    while (iterator.hasNext()) {	 
	    	Integer key = (Integer) iterator.next();	        
	        System.out.println(key + "�� "+map.get(key) + "�� ��ϵǾ����ϴ�.");
	    }
	    
	    System.out.println("�˻��� 2 ���� �ĺ���ȣ�� ���ٿ� ��ʷ� �Է��ϼ���.");
	    int a = input.nextInt();
	    int b = input.nextInt();
	    
	   
	    	if(map.containsKey(a)) {	    		
	    		System.out.println(a + "�� "+map.get(a) + "��(��) ã�ҽ��ϴ�.");
	    	}else {
	    		System.out.println("Ŷ���� �ش��ϴ� ���� �����ϴ�.");
	    	}
	    	
	    	if(map.containsKey(b)){	    		
	    		System.out.println(b + "�� "+map.get(b) + "��(��) ã�ҽ��ϴ�.");
	    	}else {
	    		System.out.println("Ŷ���� �ش��ϴ� ���� �����ϴ�.");
	    	}
	    	
		
	}
}
