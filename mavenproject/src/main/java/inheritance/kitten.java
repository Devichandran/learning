package inheritance;

public class kitten extends cat {
	
	String look="cute";
	
	{
		System.out.println(look);
	}
	

	public static void main(String[] args) {
		kitten obj = new kitten();
		obj.display();
		obj.method();
		System.out.println(obj.eyes);
		System.out.println(obj.look);
		
		
		
	}

}
