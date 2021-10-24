package constructor;

public class revString extends constructorConcept {
	
	public void r() {
	constructorConcept c=new constructorConcept();
	c.ruchi();
	}
	

	public static void main(String[] args) {
		
		
		String s="Sunday is Sunday";
		String rev="";
		String[] r= s.split("\\s");
		
		System.out.println(r.length);
		
		
		
		  for(int i=r.length-1;i>=0;i--) { 
			  rev=rev + " " + r[i];
			  } 
		  System.out.println(rev);
		  
			
			
			/*
			 * if(s.contains(" ")){ s.replace(" ",""); System.out.println(s); }
			 */
			 
		  String a=rev.stripLeading();
		  
		 System.out.println(a);
		 System.out.println(s);
		
		
		
		
		  if(s.equalsIgnoreCase(a)) { System.out.println("yes"); } else { System.out.println("no"); }
		 
	}

}
