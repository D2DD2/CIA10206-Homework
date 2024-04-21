package hw7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class hw7_2 {
	public static void main(String[] args) {
//		• 請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 (請使用
//		append功能讓每次執行結果都能被保存起來)
		try {
			FileOutputStream a =new FileOutputStream("c:\\javawork\\Data.txt",true);
			for(int i=1;i<=10;i++) {
				int g;
				g=(int) (Math.random()*1000+1);
				PrintStream s =new PrintStream(a);
				s.println(g);
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	

	}

}
