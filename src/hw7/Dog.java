package hw7;
public class Dog implements Cage{
	private static final long serialVersionUID = 22220605;
	private String name;
	
	public Dog(String name) {
		this.name = name;
	}
	@Override
	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}
