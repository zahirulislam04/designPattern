package decorator_car;

public class CarManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICar myCar = new EngineDecorator(new ColorDecorator(new SimpleCar()));
		System.out.println(myCar.ShowDetails());
	}

}
