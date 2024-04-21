package hw7;
public class Cat implements Cage  {
//	private static final long serialVersionUID = 222220605;
	private String name;

	
	public Cat(String name) {
		this.name = name;

	}
	@Override
	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}
	
}
