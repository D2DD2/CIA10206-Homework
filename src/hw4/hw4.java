package hw4;

public class hw4 {
	public static void main(String[] args) {
		System.out.println("1========================================");
		//有個一維陣列如下:
		//{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
		//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
		//(提示:陣列,length屬性)
		int[] Array1 = {29,100,39,41,50,8,66,77,95,15};
		int sum =0;
		for(int i=0;i<Array1.length ;i++) {
			sum =(sum +Array1[i]);
			
		}
		System.out.println(sum/Array1.length);
		System.out.println();
		for(int i=0;i<Array1.length;i++) {
			if(Array1[i]>(sum/Array1.length)) {
				System.out.println(Array1[i]);
			}
		}
		System.out.println("2========================================");
		//• 請建立一個字串,經過程式執行後,輸入結果是反過來的
		//例如String s = “Hello World”,執行結果即為dlroW olleH
		//(提示:String方法,陣列)
		String[] Array2 = {"H","e","l","l","o"," ","W","o","r","l","d"};
		for(int i=Array2.length -1;i>=0;i--) {
			System.out.print(Array2[i]);
		}
		System.out.println();
		System.out.println("3========================================");
		//• 有個字串陣列如下 (八大行星):
		//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
		//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
		//(提示:字元比對,String方法)
		String[] Eightplanets = {"mercury","venus","earth","mars","jupiter","saturn","uranus","neptune"};
		System.out.println(Eightplanets[0].charAt(0));//查找此陣列第一個元素的第一個字
		int cum1=0,cum2=0,cum3=0,cum4=0,cum5=0;
		for(int i =0;i <Eightplanets.length;i++) {
			
			for(int j=0;j<Eightplanets[i].length();j++) {
//				System.out.println(Eightplanets[i].charAt(j));
				if(Eightplanets[i].charAt(j)=='a') {
					cum1 =cum1 +1;
				}else if(Eightplanets[i].charAt(j)=='e') {
					cum2++;
				}else if(Eightplanets[i].charAt(j)=='i') {
					cum3++;
				}else if(Eightplanets[i].charAt(j)=='o') {
					cum4++;
				}else if(Eightplanets[i].charAt(j)=='u') {
					cum5++;
				}
				

			}
			
		}
		System.out.println("a="+cum1+" e="+cum2+" i="+cum3+" o="+cum4+" u="+cum5);
	}
}
