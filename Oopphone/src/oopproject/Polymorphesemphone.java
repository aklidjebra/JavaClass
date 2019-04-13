package oopproject;

public class Polymorphesemphone extends Testphone {

	// method overloading
		// same methods name different parameters in same class
	public void methode(int A , int B) {
		int C= A+B;
		
		System.out.println(C);
	}
	public void methode(int A , int B, int D) {
		int C= A+B;
		double E= C/D;
		System.out.println(E);
	}
	
	//overriding
			// same method names same parameters in different class (uses extends)
			
	public void facetime() {
		System.out.println("tis is facetime for plymorphesem  class////");
		
	}
	
	
	
	
	
	
	

	
	public static void main(String[] args) {
		
		Polymorphesemphone polymorphesemphone= new Polymorphesemphone();
		polymorphesemphone.methode(9,15,2);
		polymorphesemphone.facetime();
		
		
		
		
	}

}
