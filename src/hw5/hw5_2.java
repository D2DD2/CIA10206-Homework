package hw5;
//請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
public class hw5_2 {

	public static void main(String[] args) {
		randAvg();
	}
	public static void randAvg() {
		int sum =0;
		System.out.println("本次亂數結果:");
		for(int i=0;i<10;i++) {
			int a=(int)(Math.random()*101);
			System.out.println(a);
			sum+=a;
		}
		double an =sum/(double)10;
		System.out.println("平均值:"+an);
	}
}
