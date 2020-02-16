package CPSC;

public class DeliveryCake {
	
	private Cake currentState;
    public int cakeOrderId;
     
    public DeliveryCake(Cake currentState, int cakeOrderID) 
    {
        super();
        this.currentState = currentState;
        this.cakeOrderId = cakeOrderID;
        
        System.out.println( "Cake Order Number:" +cakeOrderId);
         
        if(currentState == null) {
            this.currentState = Acknowledge.order();
        }
    }
 
    public Cake getCurrentState() {
        return currentState;
    }
 
    public void setCurrentState(Cake currentState) {
        this.currentState = currentState;
    }
     
    public int getCakeOrderId() {
        return cakeOrderId;
    }
 
    public void setCakeOrderId(int cakeOrderId) {
        this.cakeOrderId = cakeOrderId;
    }
 
    public void update() {
        currentState.updateStatus(this);
        
    }
	
	

}
