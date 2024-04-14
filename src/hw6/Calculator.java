package hw6;

import java.util.Scanner;

//請設計三個類別Calculator.java,CalException.java與CalTest.java
//在Calculator.java裡有個自訂
//方法為powerXY(int x, int y),功能是會計算x的y次方並回傳結果。
public class Calculator {
//	private int x;
//	private int y;
//	
//	
//	public Calculator() {
//		
//	}
//	public Calculator(int x,int y) {
//		this.x=x;
//		this.y=y;
//				
//	}
	public void powerXY(int x,int y)throws CalException {
		if(y<0) { throw new CalException("不給過");
		}
		if(x !=0&& y !=0) {
		 System.out.println((int)Math.pow(x, y));
		 }else
		throw new CalException("朕不准");
		
//		System.out.println(a);
	}
//	public int getX() {
//		return x;
//		
//	}
//	public void setX(int x) {
//			this.x=x;
//	}
//	public int getY() {
//		return y;
//	}
//	public void setY(int y) {
//		this.y=y;
//	}
//	
}
