package sample;

public class Veterinarian {
	private String name;
	
	

	public Veterinarian(String name) {
		super();
		this.name = name;
	}
	

	public Veterinarian() {
		super();
	}
	
	
	void treatment(Animal toString) {
		System.out.println("Я ветеринар, меня зовут "+ name +", и я буду лечить " + toString  );
	}
	
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Veterinarian [name=" + name + "]";
	}
	
}


