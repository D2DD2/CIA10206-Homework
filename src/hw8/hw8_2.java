package hw8;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//放到每小題
//需使用的集合裡
//- (202, “普悠瑪”, “樹林”, “花蓮”, 400)
//- (1254, “區間”, “屏東”, “基隆”, 700)
//- (118, “自強”, “高雄”, “台北”, 500)
//- (1288, “區間”, “新竹”, “基隆”, 400)
//- (122, “自強”, “台中”, “花蓮”, 600)
//- (1222, “區間”, “樹林”, 七堵, 300)
//- (1254, “區間”, “屏東”, “基隆”, 700)
//• 請寫一隻程式,能印出不重複的Train物件
//
//• 請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出
//
//• 承上,不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件
//
//• (以上三題請根據使用的集合,練習各種取值寫法,如迭代器、for迴圈或foreach等)
public class hw8_2 {
	
	public static void main(String[] args) {
		Set<Train> unstoppable = new HashSet();
//		Train a = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		unstoppable.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		unstoppable.add(new Train(1254, "區間", "屏東", "基隆", 700));
		unstoppable.add(new Train(118, "自強", "高雄", "台北" , 500));
		unstoppable.add(new Train(1288, "區間", "新竹", "基隆", 400));
		unstoppable.add(new Train(122, "自強", "台中", "花蓮", 600));
		unstoppable.add(new Train(1222, "區間", "樹林", "七堵", 300));
		unstoppable.add(new Train(1254, "區間", "屏東", "基隆", 700));
		System.out.println("1.迭代器============================================");
		Iterator<Train> a = unstoppable.iterator();
		while(a.hasNext()) {
		Train aa =a.next();
			System.out.println(aa);
		}
		System.out.println("1.for迴圈============================================");
		for(Train aa:unstoppable) {
			System.out.println(aa);
		}
		System.out.println("3.============================================");
		Set<Train> unstoppable2 = new TreeSet();
		unstoppable2.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		unstoppable2.add(new Train(1254, "區間", "屏東", "基隆", 700));
		unstoppable2.add(new Train(118, "自強", "高雄", "台北" , 500));
		unstoppable2.add(new Train(1288, "區間", "新竹", "基隆", 400));
		unstoppable2.add(new Train(122, "自強", "台中", "花蓮", 600));
		unstoppable2.add(new Train(1222, "區間", "樹林", "七堵", 300));
		unstoppable2.add(new Train(1254, "區間", "屏東", "基隆", 700));
		
		
		System.out.println("3.迭代器============================================");
		Iterator<Train> s = unstoppable2.iterator();
		while(s.hasNext()) {
		Train ss =s.next();
			System.out.println(ss);
		}
		System.out.println("3.for迴圈============================================");
		for(Train aa:unstoppable2) {
			System.out.println(aa);
		}

		
	}
}
