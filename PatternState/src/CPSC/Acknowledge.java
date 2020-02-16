package CPSC;

public class Acknowledge implements Cake {
	
	//Singleton
    private static Acknowledge  order = new Acknowledge();
 
    private Acknowledge() {}
 
    public static Acknowledge order() {
        return order;
    }
    
  
	@Override
	public void updateStatus(DeliveryCake cake) {
		  
	        System.out.println("Cake Details received by Baker");
	        cake.setCurrentState( Batter.order());
	    }
	}

		
	
	


