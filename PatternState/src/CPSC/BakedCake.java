package CPSC;

public class BakedCake implements Cake {
	
	//Singleton
	private static BakedCake order  = new  BakedCake();

	private  BakedCake() {}

	public static BakedCake order() {
	    return  order;
	}

	@Override
	public void updateStatus(DeliveryCake cake) {
		
		{
		    System.out.println("Cake Baked");
		    cake.setCurrentState(DecoCake.order());
		}
	}
}
	
		
		






 


