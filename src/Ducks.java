
public class Ducks {
	
	public DuckFly flytype;
	
	public String TryFly() {
		return flytype.fly();
	}
	
	public void FlyIt(DuckFly fly) {
		flytype = fly;
	}
}
