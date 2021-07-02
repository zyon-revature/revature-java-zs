/**
 * 
 */

/**
 * @author zyonsavery
 *
 */
public class MethodDeclaration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create a class instance 
		MethodDeclaration md = new MethodDeclaration();
		
		
		// call your first method here
		md.talk();
		md.talk();
		md.talk();
	}
	
	public void talk() {
		System.out.println("Inside of the talk method");
	}

}
