package zadaca11;

abstract class Bike1 {
	Bike1(){System.out.println("Bike is created");}
	abstract void run();
	void changeGear() {System.out.println("gear changed");}
}