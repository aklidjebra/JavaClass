package homework;

	public class Class1 {
	int year;	
	int price=20000;
	String model= "Toyota";
	String name = "Camry";
	static int seats =4;
	boolean diesel= false;
	// call variables
	public void differentclass() {
System.out.println(price +" " +model+" "+diesel);
	}
  //Constructor 
	public Class1() {}
	public Class1(int year) {
		this.year=year;
		System.out.println(year);
		//void method
		
	}
	public void methodV() {
		System.out.println("this is my void method");}
		// no static method return type 
	public int  returntyp (int a ,int b) {
		int total = a + b;
		System.out.println(total);
		return total; 
	}
	
}		