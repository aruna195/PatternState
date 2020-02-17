package CPSC;

public class DecoCake implements Cake {


	@Override
	public void updateStatus(DeliveryCake cake, String state) {
		// TODO Auto-generated method stub
		System.out.println("Cake is Decorated with " + state);
       cake.setCurrentState(new OrderCompleted());
		
	}
}