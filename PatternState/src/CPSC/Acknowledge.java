package CPSC;

public class Acknowledge implements Cake {
	
	
  

	

	@Override
	public void updateStatus(DeliveryCake cake, String state) {
		// TODO Auto-generated method stub
		System.out.println(state + " in Process");
        cake.setCurrentState( new BakedCake());
}

		
	}
	


		
	
	


