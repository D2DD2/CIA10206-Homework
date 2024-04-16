package hw3;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class hw3 {
	public static void main(String[] args) {
//		請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//		三角形、其它三角形或不是三角形
		System.out.println("1===================================");
		Scanner yy =new Scanner(System.in);
//		System.out.println("輸入三個數字");
//		int no1 = yy.nextInt();
//		int no2 = yy.nextInt();
//		int no3 = yy.nextInt();
////		System.out.println(no1+no2+ no3);
//		if(no1+no2>no3 && no1+no3>no2 && no2+no3>no1) {
//		if(no1 == no2 && no2 == no3 && no1 == no3) {
//			System.out.println("正正正");
//		}else if(no1 == no2 || no2 == no3 || no1 == no3) {
//			System.out.println("等腰");
//		}else {
//			System.out.println("其它三角形");
//		}
//		
//		}else {
//			System.out.println("不是三角形");
//		}
//		請設計一隻程式，會亂數產生一個0～ 9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//		對則顯示正確訊息
		System.out.println("2===================================");
//		Scanner y1 = new Scanner(System.in);
//		int guss =(int)(Math.random()*10);
//		
//		int a =0;
//		do {
//			System.out.println("給我猜");
//			 a = y1.nextInt();
//			if(guss>a) {
//				System.out.println("BOOOOOOOOM");
//			}else if(guss<a){
//				System.out.println("BOOM");
//			}
//		}while(a != guss);
//		if(a == guss) {
//			System.out.println("\t");
//			System.out.println("yes");
//		}
//		阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//		厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)， 畫面會顯示他可以選擇
//		的號碼與總數
		System.out.println("3===================================");
//		Scanner y3 =new Scanner(System.in);
//		System.out.println("輸入1~9內");
//		int choose =y3.nextInt();
//		int count = 0;
//		System.out.println("所輸入的是"+choose);
		
		
		
//		for(int i =1; i<=49;i++) {
//			if(choose<10) {
//			if(i!=choose) {
//				System.out.println("\t"+i);
////				System.out.print(i);
//				count++;
//			}
//			
//			}
//			else {System.out.println("輸入錯誤");break;}
//		}
//		System.out.println("剩餘可選總數"+count);
//		(進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複)
		System.out.println("==========================================");
//	
////	}
	Set set = new HashSet();
	while(set.size() !=6){
		int w =(int) ((Math.random()*49)+1);
		set.add(w);
	}
	Iterator objs = set.iterator();
	while (objs.hasNext())
		System.out.println(objs.next());
	}
}
