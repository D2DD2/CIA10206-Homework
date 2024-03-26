package hw2;
/*
• 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
• 請設計一隻Java程式,輸出結果為以下:
1 4 9 16 25 36 49 64 81 100 (3 5 7 9)(x  x+2 )
 */

public class hw2 {
	public static void main(String[] args) {
		System.out.println("1---------------------------");
//		int sum =0;
//		for(int i =1 ; i <= 1000; i++) {
//			if(i%2 ==0) {
//				sum += i;
//			
//			}
//		}
//		System.out.println(" 1~1000的偶數和是" + sum);
		System.out.println("2---------------------------");
		int sum1 =1;
		for (int i =1 ; i <= 10; i++) {
			sum1 *= i;
		}
		System.out.println(sum1);
		System.out.println("3---------------------------");
		int sum2 =1 , i2 =1;
		while(i2 <= 10) {
			sum2 *= i2;
			i2++;
		}
		System.out.println(sum2);
		System.out.println("4---------------------------");
		int i4 =1;
		for (int i3 =1; i4 <100; i3++) {
			i4 = (int)Math.pow(i3, 2);
			System.out.println(i4);
			
		}
		
	}

}
