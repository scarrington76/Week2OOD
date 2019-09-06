package decoratorpattern;

//Main Class to enter Pastry orders
public class PastryShop {

	public static void main(String[] args) {
		// Customer first Order = 1 WeddingCake
		Bakedgood weddingcake = new WeddingCake();
		System.out.println(weddingcake.getDescription() + " $" + weddingcake.cost());
		
		// Customer second order = 1 Birthday Cake
		Bakedgood birthdaycake = new BirthdayCake();
		System.out.println(birthdaycake.getDescription() + " $" + birthdaycake.cost());
		
		// Customer third order = 1 Holiday Cake
		Bakedgood holidaycake = new HolidayCake();
		System.out.println(holidaycake.getDescription() + " $" + holidaycake.cost());
		
	}

}
