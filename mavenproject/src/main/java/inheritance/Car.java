package inheritance;

public class Car extends Vehicle {

	String colour= "Blue";
	public void display()
	{
		System.out.println(colour);
	}
	public static void main(String[] args) {
		Car obj= new Car();
		obj.display();
		obj.method();
		System.out.println(obj.speed);
		System.out.println(obj.colour);
		

	}

}
