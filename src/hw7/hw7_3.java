package hw7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//• 請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。呼叫此方法時,第一個參數所
//代表的檔案會複製到第二個參數代表的檔案
public class hw7_3 {
	public static void main(String[] args) throws IOException {
		File in =new File("c:\\javawork\\hw7out3.txt");
		File out =new File("c:\\javawork\\hw7in3.txt");
		
		copyFile(in,out);
		
}
	public static void copyFile(File in,File out) throws IOException{
		
		try {
			FileInputStream in1 =new FileInputStream(in);
			FileOutputStream out1=new FileOutputStream(out);
			int a;
			while((a=in1.read()) != -1) {
				out1.write(a);
				System.out.println("傳送中...");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("已完成");
	}
}
