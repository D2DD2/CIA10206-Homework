package hw5;
//身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
//genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//與數字的亂數組合
public class hw5_5 {

	public static void main(String[] args) {
			//char =48~57 65~90 97~122
		System.out.println("本次隨機產生驗證碼為:");
		for(int i=0;i<7;i++) {
			int a=0;
//			int a=(int)(Math.random()*74)+48;
			for(int j=0;j<1;) {
				a=(int)(Math.random()*74)+48;
			if(!(a>57 && a<65)&&!(a>90 && a<97)) { j++;}
//			if(a>90 && a<97) { a=(int)(Math.random()*74)+48;}
			
			}
			char b =(char)a;
//			System.out.println(a);
			System.out.print(b);
		}
	}

}
