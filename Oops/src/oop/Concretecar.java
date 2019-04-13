package oop;

public class Concretecar extends Abstracte implements Interface,Interface2 {

	@Override
	public void move() {
	
		System.out.println("moving functionality car------");
	
	}

	
	public void start() {
		System.out.println("starting functionality car car should start---- ");
		
	}
		
	

	
	public void stop() {
		System.out.println("stoping functionality car  car should stop ------" );
	
	}


	@Override
	public void light() {
		System.out.println("interface2 functionality carinterface222222222");
		
	}


	@Override
	public void autobreak() {
		System.out.println("autobreak functionality car");
		
	}


	public void autoheadlight(int w) {
		System.out.println(" autohead light functionalityyyyyyyy ");
		
		
	}	
}
