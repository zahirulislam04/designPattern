package decorator_car;

public abstract class CarDecorator implements ICar {
	ICar simpleCar;
	public CarDecorator(ICar car) {
		simpleCar=car;
	}
	
	public String ShowDetails() {
		return simpleCar.ShowDetails();
	}
}
