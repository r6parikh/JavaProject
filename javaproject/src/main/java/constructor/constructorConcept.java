package constructor;

public class constructorConcept {
	
	public void ruchi() {
		System.out.println("Ruchi");
		
	}
	
	static {
	System.out.println("static block");	
	
	}
	
	constructorConcept(){
		System.out.println("constructor");	
		}
	
	
	{
		System.out.println("hello");
	}
	
	
	
	public static void main(String[] args) {
		
		constructorConcept obj = new constructorConcept();
		obj.ruchi();

	}

}
