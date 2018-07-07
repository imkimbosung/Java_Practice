package num_101112;

import java.util.Random;
import java.util.Scanner;

public class Num_11 extends Thread {
	int seq;
	static volatile int sflag = 100;

	public Num_11(int seq) {
		this.seq = seq;
	}

//	Random r = new Random();

	public synchronized int getFlag() {
		return sflag;
	}
	
	public void run() {

		try {
			sflag -= 1;
			int localflag = sflag;
			Thread.sleep(10 * this.seq);
			System.out.println(Thread.currentThread().getName() + " 동기화 된" + getFlag() + " 필드" + localflag);
		} catch (Exception e) {

		}

	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("===== Flag 뺏기프로그램 =====");
		System.out.println("생성할 스레드 수를 입력하시오>> ");
		int threadNum = input.nextInt();

		Num_11 pracThread;
		for (int i = 0; i < threadNum; i++) {
			pracThread = new Num_11(i);
			pracThread.start();
		}
		System.out.println("쓰레드 상태와 관계없이 Main 프로세스를 종료합니다!!");

	}
}
