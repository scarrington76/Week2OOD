package decoratorpattern;

public class HolidayCake extends Bakedgood {
	public HolidayCake() {
		description = "Holiday Cake with holiday candles, frosting, and message";
	}	
	public double cost() {
		return 12.99;
		}	
}
