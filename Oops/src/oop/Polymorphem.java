package oop;

public class Polymorphem extends Concretecar {
	
	// method overloading
	// same methods name different parameters in same class
	
	public void calculator (int s, int d) {
		int c = (s+d);
		System.out.println(c);
		}
		public void calculator (int s, int d ,int r) {
			int c = (s+d);
			double g= c/r;
		
		System.out.println(g);
		}
		//overriding
		// same method names same parameters in different class (uses extends)
		

		public void autoheadlight(int w) {
			System.out.println("this is polymorphesemclass");
		}
			
	public static void main(String[] args) {
		Polymorphem polymorphesem = new Polymorphem()	;
		polymorphesem.calculator(8,9);
		polymorphesem.calculator(7,9,2);
		 
		polymorphesem.autoheadlight(55);
		
		
	}
	
		
		
	

}
