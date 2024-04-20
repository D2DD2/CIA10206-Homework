package hw7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

//• 請自行建立一個文字檔Sample.txt,內容如下:
//
//Java是一種電腦程式設計語言,擁有跨平台、物件導向、泛型程式設計的特性,廣泛應用於企業級Web應用開發和行動應用開發。
//任職於昇陽電腦的詹姆斯·高斯林等人於1990年代初開發Java語言的雛形,最初被命名為Oak,目標設定在家用電器等小型系統的程
//式語言,應用在電視機、電話、鬧鐘、烤麵包機等家用電器的控制和通訊。由於這些智慧型家電的市場需求沒有預期的高,Sun公
//司放棄了該項計劃。隨著1990年代網際網路的發展,Sun公司看見Oak在網際網路上應用的前景,於是改造了Oak,於1995年5月
//以Java的名稱正式釋出。Java伴隨著網際網路的迅猛發展而發展,逐漸成為重要的網路程式語言。
//Java程式語言的風格十分接近C++語言。繼承了C++語言物件導向技術的核心,Java捨棄了C++語言中容易引起錯誤的指標,改以
//參照取代,同時移除原C++與原來運算子多载,也移除多重繼承特性,改用介面取代,增加垃圾回收器功能。在Java SE 1.5版本中
//引入了泛型程式設計、類型安全的列舉、不定長參數和自動裝/拆箱特性。昇陽電腦對Java語言的解釋是:「Java程式語言是個簡單、
//物件導向、分布式、解釋性、健壯、安全與系統無關、可移植、高效能、多執行緒和動態的語言」
//
//請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
//Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料
public class hw7_1 {
public static void main(String[] args) {
//	File file = new File("C:\\javawork\\Sample.txt");
//	File
	try (	FileInputStream fa =new FileInputStream("C:\\javawork\\Sample.txt");
			FileReader fr = new FileReader("C:\\javawork\\Sample.txt");
			FileReader ff = new FileReader("C:\\javawork\\Sample.txt");
            BufferedReader br = new BufferedReader(fr)) {
//			int i;
          int count =0,count1=0,count2=0;
           while(fa.read() !=-1) {
        	   count2++;
           }
           while ((  ff.read()) != -1) {
               count++;
           }
           String line;
           while((line=br.readLine()) != null) {
        	   if(line.length()>0) { count1++;}// 有陷阱
//        	   System.out.println(line);
           }
           System.out.println("Sample.txt檔案共有"+count2+"個位元組,"+count+"個字元,"+count1+"列資料");
//           br.close();
       } catch (IOException e) { 
           e.getMessage();
       }
   }
}