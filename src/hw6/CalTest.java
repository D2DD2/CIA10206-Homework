package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		
		try {
			Calculator a = new Calculator();
			System.out.println("輸入第一次");
			Scanner t1 = new Scanner(System.in);
			int x =t1.nextInt();
			System.out.println("輸入第二次");
			Scanner t2 = new Scanner(System.in);
			int y = t2.nextInt();
			a.powerXY(x, y);
		} catch (CalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(InputMismatchException g) {
			System.out.println("You cannot pass!");
		}
//		System.out.println(aa);
	}
}
