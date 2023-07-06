package sample;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat cat = new Cat("Milk","Black",2,"Jasmin") ;
		System.out.println(cat);
		cat.eat();
		cat.sleep();
		cat.getVoice();
		System.out.println(cat.getVoice());
		System.out.println();
		
		Dog dog = new Dog("Meat","Red",18,"Gera");
		System.out.println(dog);
		dog.eat();
		dog.sleep();
		dog.getVoice();
		System.out.println(dog.getVoice());
		System.out.println();
		
		Veterinarian veterinarian= new Veterinarian("Helen");
		veterinarian.treatment(dog);
		veterinarian.treatment(cat);

	}

	
	

}
