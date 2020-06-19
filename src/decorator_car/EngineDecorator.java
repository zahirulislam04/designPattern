package decorator_car;

public class EngineDecorator extends CarDecorator {

	public EngineDecorator(ICar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	
	public String ShowDetails() {
		return simpleCar.ShowDetails() + AddEngine();
	}
	
	public String AddEngine() {
		return " + Engine added";
	}

}
