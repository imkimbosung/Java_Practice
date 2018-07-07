package num_789;

public class num_9_2 {
	int pointX;
	int pointY;

	num_9_2(int pointX, int pointY) {
		this.pointX = pointX;
		this.pointY = pointY;

	}

	public int routeCount() {
		int array[] = new int[(pointX + 1) * (pointY + 1)];
		int max = (pointX > pointY ? pointX : pointY); // ������ �Ǵ� ���� �����Ѵ�.
		int count = 0;
		
		// 1�� �־��ش�.
		for (int i = 0; i < array.length; i++) {
			array[i] = 1;
		}

		// i+4 = i+3 +i ���� ����
		for (int i = 1; i < array.length; i++) {
			array[i + max + 1] = array[i + max] + array[i];
			count++;
			
			if ((i + max + 1) == (array.length - 1)) {
				break;
			}
			
			if (max == count) {
				i++;
				count = 0;
			}
			
			
		}
		return array[array.length - 1];
	}

}
