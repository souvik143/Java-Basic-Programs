package oops.abstraction;

public class RepairShop {
	
	public static void repairCar(Car car) {
		
		System.out.println("Car is repaired");
		}
    
	public static void main(String[] args) {
		
        WagnoR wagnoR = new WagnoR();
        Audi audi = new Audi();
        
        repairCar(wagnoR);
        repairCar(audi);
	}

}
