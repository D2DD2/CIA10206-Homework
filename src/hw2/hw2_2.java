package hw2;
/*
• 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
• 請設計一隻Java程式,輸出結果為以下:
1 2 3 4 5 6 7 8 9 10
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */

public class hw2_2 {
	public static void main(String[] args) {
		System.out.println("1---------------------------");
		int s = 0;
		for (int i = 1; i <= 49; i++) {
			if (i % 10 == 4) { // 14%10 餘4 24%4 餘4

			} else if (i / 10 == 4) { // 40/10 等於4 41/10 等於4

			} else {
				s++;

			}

		}
		System.out.println(s);
		System.out.println("2---------------------------");
		for (int i = 10; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("3---------------------------");
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (65 + i));
			}
			System.out.println();
		}

	}

}
