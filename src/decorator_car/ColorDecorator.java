package decorator_car;

import javax.script.SimpleScriptContext;

public class ColorDecorator extends CarDecorator {

	public ColorDecorator(ICar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	
	public String ShowDetails() {
		return simpleCar.ShowDetails() + AddColor();
	}
	public String AddColor() {
		return " + Blue color"; 
	}
}
