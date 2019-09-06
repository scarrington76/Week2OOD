package decoratorpattern;


//Abstract class
public abstract class Bakedgood {
	String description = "Unknown Baked Good";
	String candles;
	String frosting;
	String message;
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();	
}




