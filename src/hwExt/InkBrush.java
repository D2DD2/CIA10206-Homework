package hwExt;

public class InkBrush  extends Pen{
	public InkBrush(String brand,double price) {
		super(brand,price);
	}
	public double getPrice() {
		return super.getPrice()*0.9;
	}

	@Override
	public void write() {
		System.out.println("沾墨汁在寫");
	}

}
