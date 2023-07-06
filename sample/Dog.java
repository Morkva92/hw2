package sample;

public class Dog extends Animal{
	
	String name;
	

		public Dog(String ration, String color, int weight, String name) {
		super(ration, color, weight);
		this.name = name;
	}
		
		public Dog(String ration, String color, int weight) {
			super(ration, color, weight);
		}
		

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getVoice() {
		return "Dog say Gav-Gav!";

}
		public void eat() {
			System.out.println("Dog is Eating");
		}
		public void sleep() {
			System.out.println("Dog is Sleeping");
		}

		@Override
		public String toString() {
			return "Dog [name=" + name + "]";
		}
		
}