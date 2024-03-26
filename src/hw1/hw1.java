package hw1;

/*
 請設計一隻Java程式，計算12，6這兩個數值的和與積
• 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
• 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
• 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
金加利息共有多少錢 (用複利計算，公式請自行google)
• 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
5 + 5
5 + ‘5’
5 + “5”
並請用註解各別說明答案的產生原因
 */
public class hw1 {
	public static void main(String[] args) {
		System.out.println("1--------------------------------");

		int number1 = 12, number2 = 6;
		System.out.println("12 + 6 =" + (number1 + number2));
		System.out.println("12 * 6 =" + number1 * number2);
		System.out.println("2--------------------------------");
		int egg = 200;
		int dozen = 200 / 12;
		int rem = 200 % 12;
		System.out.println("200顆雞蛋總共是" + dozen + "打加" + rem + "顆");
		System.out.println("3--------------------------------");
		int total = 256559;
		int oneD = 86400;
		int day = total / oneD; // 256559 /86400 =2
		int oneH = 3600;
		int hours = (total % oneD) / oneH; // 256559 %86400 餘83759 除3600 =23
		int oneM = 60;
		int min = ((total % oneD) % oneH) / oneM; // 83759 %3600 餘959 除 60 =15
		int sec = ((total % oneD) % oneH) % oneM;
		System.out.println(total + "秒為" + day + "天" + hours + "小時" + min + "分與" + sec + "秒");
		System.out.println("4--------------------------------");
//		char pi ='\u03c0';
		double pi = 3.1415;
		double ca = 5 * 5 * pi; // circle area 圓面積
		double cf = 5 * 2 * pi;
		System.out.println("半徑為5的圓面積為" + ca + "圓周長為" + cf);
		System.out.println("5--------------------------------");
		int p = 1_500_000;
		double i = 0.02;
		int n = 10;
		double s = p * Math.pow((1 + i), n);
		System.out.println("本金加利息共" + s); // System.out.printf("%.2f",s) 只保留2位小數
		System.out.println("6--------------------------------");
		System.out.println(5 + 5); // 運算元(5)加運算子(+)
		System.out.println(5 + '5'); // '5'是char字符 字符加數字 字符會轉換成萬國編碼 萬國編碼十進位是53 列印動作默認是十進位
		System.out.println(5 + "5"); // "5"為字符串 前後的加等於串接
	}

}
