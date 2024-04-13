package hwExt;
//建立父類別Pen
//• (1) 兩個屬性：品牌(brand)、價格(price) (封裝設計)
//• (2) 建構子設計：一個無參數與一個根據屬性而設計
//• (3) 定義Getter/Setter方法
//• (4) 宣告一個抽象方法write()
public abstract class Pen {
	private String brand;
	private double price;
	
	public Pen() {
		
	}
	public Pen(String brand,double price) {
		this.brand =brand;
		this.price =price;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price =price;
	}
	public abstract void write();
}
