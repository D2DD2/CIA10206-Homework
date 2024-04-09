package hw4;
//請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//
//例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//
//(提示1:Scanner,陣列)
//(提示2:需將閏年條件加入)
//(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
import java.util.Scanner;
public class hw4_3 {
	public static void main(String[] args) {
		int[] gg = {31,28,31,30,31,30,31,31,30,31,30,31};
  
		Scanner scan =new Scanner(System.in);
		System.out.println("西元");
		int yy =scan.nextInt();
		System.out.println("月");
		int mm =scan.nextInt();
		if((yy%4 ==0 && yy%100!=0)||yy%400==0) {gg[1]=29;}
		int dd;
		System.out.println("日");
		dd=scan.nextInt();
//		if(mm!=2) {
//			System.out.println("日");
//			dd=scan.nextInt();
//		do {
//			System.out.println("日");
//			dd=scan.nextInt();
//			if(dd>28) {System.out.println("二月不能超過28");}else break;
//		}while(mm==2&&!((yy%4 ==0 && yy%100!=0)||yy%400==0));
	
		
		if(mm==2) {
			if(!((yy%4 ==0 && yy%100!=0)||yy%400==0) ) {
				
			if(dd>28) {System.out.println("二月不能超過28");System.out.println("日");
			dd=scan.nextInt(); }
			}
		}
//		
		int sum =0;
		for(int i =0;i<mm-1;i++) {
			sum +=gg[i];
		}
		sum+=dd;
		System.out.println(sum);
		
				
		
				
//	}
	}
}
