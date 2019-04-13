package oopproject;

public class Concretephone extends Abstractphone implements Interfacephone {


	@Override
	public void vidoecall() {
		System.out.println("vidoecall functionality from abstracta class---------");
		
		
		
	}

	@Override
	public void call() {
		System.out.println("call functionality from interface class");
		
	}

	@Override
	public void text() {
		System.out.println("text functionality from interface class  ========");
		
		
	}

	@Override
	public void charge() {
		System.out.println("charge  functionality from interface class ++++++++++");
		
		
	}

	}
