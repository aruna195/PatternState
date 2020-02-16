package CPSC;

public class OrderCompleted implements Cake {
	
	
	
	//Singleton
    private static OrderCompleted order = new OrderCompleted();
 
    private OrderCompleted()  {}
 
    public static OrderCompleted order() {
        return order;
    }
     
    @Override
	public void updateStatus(DeliveryCake cake) {
		// TODO Auto-generated method stub   
        System.out.println("Cake is ready for Delivery as per Cake Order");
    }
}