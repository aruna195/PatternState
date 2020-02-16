package CPSC;

public class Batter implements Cake {
	
	//Singleton
    private static Batter order = new Batter();
 
    private Batter() {}
 
    public static  Batter order() {
        return  order;
    }
     
    @Override
	public void updateStatus(DeliveryCake cake) {
		    	
    	{
            System.out.println("Cake Batter Ready");
            cake.setCurrentState(BakedCake.order());
        }
		
	}
}



