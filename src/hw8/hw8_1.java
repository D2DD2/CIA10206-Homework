package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//請建立一個Collection物件並將以下資料加入:
//Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//Object物件、“Snoopy”、BigInteger(“1000”)
//
//• 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
//• 移除不是java.lang.Number相關的物件
//• 再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功
public class hw8_1 {
	public static void main(String[] args) {
		List a =new ArrayList();
		a.add(new Integer(100));
		a.add(new Double(3.14));
		a.add(new Long(21L));
		a.add(new Short("100"));
		a.add(new Double(5.1));
		a.add( "Kitty");
		a.add(new Integer(100));
		a.add(new Object());
		a.add("Snoopy");
		a.add(new BigInteger("1000"));
		
		Iterator s =  a.iterator();
		while(s.hasNext()) {
			System.out.println(s.next());
		}
			System.out.println("===================================");
		for(int i =0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
			System.out.println("===================================");
		for(Object aa : a) {
			System.out.println(aa);
		}
			System.out.println("===================================");
			Iterator ss =  a.iterator();
			while(ss.hasNext()) {
				
			if(!(ss.next() instanceof Number)) {
				ss.remove();
				}
			}
			for(Object sss:a) {
				System.out.println(sss);
				}
	}
	
}
