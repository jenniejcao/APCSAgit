package journals;

public class Dog extends Animal{
	private String color;
	public Dog(){
		
	}
	public Dog(int s, int a, String col){
		super(s,a);
		color=col;
	
		
		
	}
	public String woof(){
		return "woof";
	}
	public String getColor(){
		return color;
	}
	public static void main(String args[]){
		Animal a = new Animal(5,7);
		System.out.println(a.getAge());
		Dog rover = new Dog(5,7,"red");
		System.out.println(rover.woof());
		System.out.println(rover.getSize());
		System.out.println(rover.getColor());
	}

}
