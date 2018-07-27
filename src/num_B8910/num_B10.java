/*
 * ���� �Ž�����(Gready Method)
 * 1�� ( 500, 100, 50, 10, 1�� ���� �ּ� ������ ������)
 * 2�� ( �ְ������Է�, 100, 50, 10, 1������ �ּ� ������ ������)
 */

package num_B8910;

import java.util.Scanner;

public class num_B10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.printf("1�� ������ �Ž������� �Է��ϼ��� >> ");
		int firstCoin = input.nextInt();
		devied_coin(firstCoin);

		System.out.printf("2�� ������ �Ž������� �ְ��� ������ �ݾ��� �Է��ϼ��� >> ");
		int secandCoin = input.nextInt();
		int maxCoin = input.nextInt();
		devied_coin(secandCoin, maxCoin);
	}

	public static void devied_coin(int firstCoin) {
		int count500 = 0, count100 = 0, count50 = 0, count10 = 0, count1 = 0;
		int count = 0;

		while (firstCoin > 0) {
			count++;
			if ((firstCoin - 500) >= 0) {
				firstCoin = firstCoin - 500;
				count500++;
			} else if ((firstCoin - 100) >= 0) {
				firstCoin = firstCoin - 100;
				count100++;
			} else if ((firstCoin - 50) >= 0) {
				firstCoin = firstCoin - 50;
				count50++;
			} else if ((firstCoin - 10) >= 0) {
				firstCoin = firstCoin - 10;
				count10++;
			} else {
				firstCoin = firstCoin - firstCoin;
				count1 = firstCoin;
			}
		}

		System.out.printf("����� ������ 500��%d��  100��%d�� 50��%d�� 10��%d�� 1��%d�� �� ������ ���� %d�� �̴�.\n", count500, count100, count50,
				count10, count1, count);
	}

	public static void devied_coin(int secandCoin, int maxCoin) {
		int countMax = 0, count100 = 0, count50 = 0, count10 = 0, count1 = 0;
		int count = 0;

		while (secandCoin > 0) {
			count++;
			if ((secandCoin - maxCoin) >= 0) {
				secandCoin = secandCoin - maxCoin;
				countMax++;
			} else if ((secandCoin - 100) >= 0) {
				secandCoin = secandCoin - 100;
				count100++;
			} else if ((secandCoin - 50) >= 0) {
				secandCoin = secandCoin - 50;
				count50++;
			} else if ((secandCoin - 10) >= 0) {
				secandCoin = secandCoin - 10;
				count10++;
			} else {
				secandCoin = secandCoin - secandCoin;
				count1 = secandCoin;
			}
		}

		System.out.printf("����� ������ %d��%d��  100��%d�� 50��%d�� 10��%d�� 1��%d�� �� ������ ���� %d�� �̴�.\n", maxCoin ,countMax, count100, count50,
				count10, count1, count);
	}
	
}
