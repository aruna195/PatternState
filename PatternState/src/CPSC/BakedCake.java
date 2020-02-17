package CPSC;

public class BakedCake implements Cake {
	

	@Override
	public void updateStatus(DeliveryCake cake, String state) {
		
		{
			System.out.println( state + " Cake is Baked");
		    cake.setCurrentState(new DecoCake());
		   
		}
	}
}
	
		
		






 


