package sample;

public class Cat extends Animal{
	
	String name ;
	
	public Cat(String ration, String color, int weight, String name) {
		super(ration, color, weight);
		this.name = name;
	}
	
	public Cat(String ration, String color, int weight) {
		super(ration, color, weight);
	}

	
	public String getVoice() {
		
		return "Cat say Meow-Meow!";
}
	public  void eat() {
		System.out.println("Cat is Eating");
	}
	public  void sleep() {
		System.out.println("Cat is Sleeping");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + "]";
	}

	
	
}
