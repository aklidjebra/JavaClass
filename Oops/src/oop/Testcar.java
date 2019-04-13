package oop;

public class Testcar {
	
public static void main(String[] args) {
	
Concretecar concretecar = new Concretecar();
concretecar.move();
concretecar.stop();
concretecar.start();
concretecar.light();
concretecar.autobreak();
Bmw bmw = new Bmw();
bmw.method1();
}
}
