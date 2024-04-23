package hw8;
//請設計一個Train類別,並包含以下屬性:
//- 班次 number,型別為int - 車種 type,型別為String - 出發地 start,型別為String
//- 目的地 dest,型別為String - 票價 price,型別為double
//• 設計對應的getter/setter方法,並在main方法裡透過建構子產生以下7個Train的物件
public class Train implements Comparable<Train>{
	@Override
	public int compareTo(Train o) {
		if(this.number >o.number) {
			return 1;
		}else if(this.number ==o.number){
		return 0;
		}else {
			return -1;
		}
	}
	@Override
	public String toString() {
		return number+""+type+""+start+""+dest+""+price;
	}
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
	public Train() {
		
	}
	public Train(int number,String type,String start,String dest,double price) {
		this.number =number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;		
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number =number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start =start;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest =dest;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
