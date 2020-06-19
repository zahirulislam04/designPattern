
public interface DuckFly {
	String fly();
}

class CanFly implements DuckFly{

	public String fly() { 
		return "It can fly";
	}
	
}

class CantFly implements DuckFly{

	public String fly() { 
		return "It can not fly";
	}
	
}