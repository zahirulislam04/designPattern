import java.awt.FlowLayout;

public class DucksWorld {

	public static void main(String[] args) {
		
		Ducks rubberDuck = new RubberDuck();
		Ducks cityDuck = new CityDuck();
		
		System.out.println("Rubber Duck: " + rubberDuck.flytype.fly());
		System.out.println("City Duck: " + cityDuck.flytype.fly());
		
		rubberDuck.FlyIt(new CanFly());
		System.out.println("Rubber Duck: " + rubberDuck.flytype.fly());
	}

}
