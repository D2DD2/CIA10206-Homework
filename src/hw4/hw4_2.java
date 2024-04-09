package hw4;
//阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//表如下:
//
//請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//員工編號: 25 19 27 共 3 人!」
//(提示:Scanner,二維陣列)

import java.util.Scanner;

public class hw4_2 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int a=s.nextInt();
		int cum =0;
		int[] money= {2500,800,500,1000,1200};
		int[] no = {25,32,8,19,27};

		System.out.println();
		System.out.println("編號");
		for(int i =0;i<money.length;i++) {
			if(money[i]>=a) {
				cum++;
				System.out.println(no[i]);
			}
		}
		System.out.println("共"+cum);
	}
}
