package CPSC;

public class DecoCake implements Cake {
	//Singleton
    private static DecoCake order= new  DecoCake();
 
    private  DecoCake() {}
 
    public static DecoCake order() {
        return  order;
    }


	@Override
	public void updateStatus(DeliveryCake cake) {
		// TODO Auto-generated method stub
		System.out.println("Cake Theme Decoration done");
        cake.setCurrentState(OrderCompleted.order());
		
	}
}