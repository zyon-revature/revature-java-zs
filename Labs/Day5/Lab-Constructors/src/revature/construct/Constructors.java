package revature.construct;

public class Constructors {
	
	public Constructors(int value) {
		System.out.println(value);
	}
	
	public Constructors() {
		System.out.println("Default constructor ran.");
	}
	
	public static void main(String[] args) {
		//create instance of of Constructors
		Constructors c = new Constructors(5839);
		
		//no argument constructor 
		Constructors cNoArg = new Constructors();
		

	}

}
