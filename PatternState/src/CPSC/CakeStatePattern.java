package CPSC;

public class CakeStatePattern {	

	    public static void main(String[] args) 
	    {
	        DeliveryCake cake = new DeliveryCake(null, 001);          
	         
	        cake.update();
	        cake.update();
	        cake.update();
	        cake.update();
	        cake.update(); 
	    }


}
