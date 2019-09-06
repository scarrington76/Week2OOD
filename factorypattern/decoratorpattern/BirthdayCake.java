package decoratorpattern;

public class BirthdayCake extends Bakedgood {
	public BirthdayCake() {
		description = "Birthday Cake with birthday candles, frosting, and message";
	}
	
	public double cost() {
		return 10.99;
		}	
		
}
