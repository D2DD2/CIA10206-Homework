package hw5;

import java.util.Scanner;

//請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形
public class hw5_1 {

	public static void main(String[] args) {
		Scanner a =new Scanner(System.in);
		System.out.println("輸入");
		int w =a.nextInt();
		Scanner b=new Scanner(System.in);
		int h=b.nextInt();
		starSquare(w,h);
		
	}
	public static void starSquare(int width,int height) {
		for(int i=1;i<=height;i++) {
			for(int j =1;j<=width;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
