package num_161718;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class num_17 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
				
		System.out.println("기르는 개종의 식별번호와 이름을 한줄에 입력하세요 구분은 ' ' 임");
		String Dogs = input.nextLine();
		
		String arrDog[] = Dogs.split(" ");
	
		for(int i = 0 ; i + 1 < arrDog.length ; i = i+2) {
			map.put(new Integer(arrDog[i]), arrDog[i+1]);
		}
		
		System.out.println("추가할 개의 식별번호와 이름을 입력하세요.");
		map.put(input.nextInt(), input.next());
		
		System.out.println("삭제할 개의 식별번호를 입력하세요.");
		map.remove(input.nextInt());
		
		System.out.println("추가할 개의 식별번호와 이름을 입력하세요.");
		map.put(input.nextInt(), input.next());
		
		Iterator<Integer> iterator = map.keySet().iterator();
		
	    while (iterator.hasNext()) {	 
	    	Integer key = (Integer) iterator.next();	        
	        System.out.println(key + "번 "+map.get(key) + "가 등록되었습니다.");
	    }
	    
	    System.out.println("검색할 2 종의 식별번호를 한줄에 라례로 입력하세요.");
	    int a = input.nextInt();
	    int b = input.nextInt();
	    
	   
	    	if(map.containsKey(a)) {	    		
	    		System.out.println(a + "번 "+map.get(a) + "을(를) 찾았습니다.");
	    	}else {
	    		System.out.println("킷값에 해당하는 개가 없습니다.");
	    	}
	    	
	    	if(map.containsKey(b)){	    		
	    		System.out.println(b + "번 "+map.get(b) + "을(를) 찾았습니다.");
	    	}else {
	    		System.out.println("킷값에 해당하는 개가 없습니다.");
	    	}
	    	
		
	}
}
