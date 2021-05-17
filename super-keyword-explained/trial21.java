import java.util.*;
public class trial21 extends trial2{
	String name ="BMW";
	trial21(){
		super();
		System.out.println("Calling BMW class");
	}
	public void getName()
	{
		System.out.println(name);
		System.out.println(super.name);
	}

	public void run(){
		System.out.println("BMW is running");
		super.run();

	}
	public static void main(String[] args) {
		// trial2 car = new trial2();
		// System.out.println(name);
		// car.run();
		trial21 bmw = new trial21();
		bmw.getName();
		bmw.run();
	}
}