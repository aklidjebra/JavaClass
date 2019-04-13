package homework;

public class Execution {
	
	public static void main(String[] args) {
		
		// call variables fromclass1
		Class1 objectvar = new Class1(2017);
		objectvar.differentclass();
		System.out.println(objectvar.year);
		//Constructor
		
		//Object Creation 
		Class1 object = new Class1 ();
		System.out.println(object.name);
		//void method 
		Class1 objectmeth = new Class1(); 
		objectmeth.methodV();
		// static void 
		System.out.println(Class1.seats);
		// no static return type }
		
		Class1 retobject = new Class1(); 
		retobject.returntyp(10,12); 
		// conditional 
		int age =3;
		if (age ==5 ){
			System.out.println("the car is accepted");
	}else {
		
		System.out.println("the car is not accepted");
	}
		// Arithmetic Operations
		
		double note1 = 15;
		double note2 =18;
		double AVG = (note1 + note2)/2;
		System.out.println(AVG);
	}
}
