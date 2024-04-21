package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//• 請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。注
//意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾
//
public class hw7_4 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File a1 =new File("c:\\data");
		if(!a1.exists()) {
			a1.mkdir();
		}
		File a =new File("c:\\data\\Object.ser");
		Cage[] cage =new Cage[4];
		cage[0]= new Cat("luna");
		cage[1] = new Dog("Max");
		cage[2] = new Cat("lulu"); 
		cage[3] = new Dog("popo");
		
		wObject(a,cage);
		readObject(a);
	}
	public static void wObject(File a,Cage[] cage) {
		try (FileOutputStream s = new FileOutputStream(a);
				ObjectOutputStream ss = new ObjectOutputStream(s);){
			
			for(int i =0;i<cage.length;i++) {
				ss.writeObject(cage[i]);
				
			
				System.out.println("抓捕中...");
			}
		
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		//• 承上題,請寫一個程式,能讀取Object.ser這四個物件,並執行speak()方法觀察結果如何 (請利用多
		//型簡化本題的程式設計)
		
		
	public static void readObject(File a) throws IOException, ClassNotFoundException {
		try (FileInputStream d = new FileInputStream(a);
				ObjectInputStream dd = new ObjectInputStream(d);){
			
			while(true) {
				((Cage)dd.readObject()).speak();
				System.out.println("");
				}
		} catch (EOFException e) {
			
			System.err.println("寂靜");
		}
		
	}

}
