package decoratorpattern;

public class WeddingCake extends Bakedgood {
	public WeddingCake() {
		description = "Wedding Cake with wedding candles, fondant, and message";
	}
	public double cost() {
		return 74.99;
		}	
}
