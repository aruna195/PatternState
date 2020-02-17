package CPSC;

public class CakeStatePattern {	

	    public static void main(String[] args) 
	    {
	        DeliveryCake cake = new DeliveryCake();          
	        cake.update("Cake Order");
	        cake.update("Chocolate");
	        cake.update("Strawberries");
	        cake.update("OrderComplete");
	       
	        
	        
	      
	    }


}
