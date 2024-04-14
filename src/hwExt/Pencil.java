package hwExt;

public  class Pencil extends Pen {
	//呼叫父類
	public Pencil(String brand,double price) {
		super(brand,price);
	}
	//沒呼叫父類這邊不能用
	public double getPrice() {
		return super.getPrice()*0.8;
	}
	@Override
	public void write() {
		System.out.println("削鉛筆在寫");
	}
}
