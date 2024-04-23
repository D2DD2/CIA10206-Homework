package hw9;
//開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的
//競賽過程。
//• 每個動作都以 Thread.sleep()暫停一下,以達到顯示效果。
//Sleep時間由亂數產生500~3000之間的毫秒數,如圖所示
//• 參考範例:CounterRunnable.java
//• 需留意主執行緒執行順序
public class hw9_1 {
	public static void main(String[] args) {
		Mutant a = new Mutant();
		Thread s = new Thread(a);
		Mutant aa = new Mutant();
		Thread ss = new Thread(aa);
		a.setName("TheFlash");
		aa.setName("SuperMan");
		s.start();
		ss.start();
		
		
		try {
			s.join();
			ss.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("比賽結束");
		
	}
	public static class Mutant implements Runnable {
		public static boolean ready = false;
		int a = 1;
		private String name;
		public Mutant() {
			
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		
		public void run() {
			
			while(a<=10) {
				System.out.println(name+"已經繞了地球"+a+"圈");
				a++;
			
			
			try {
				int s =(int)(Math.random()*2501)+500;
				Thread.sleep(s);
//				System.out.println("喘"+s);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			}
			
		}
	}
}
