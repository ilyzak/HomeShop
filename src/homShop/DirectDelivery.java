package homShop;

public class DirectDelivery implements Delivery{

	 @Override
	    public double getPrice() {
	        return 4.99;}
	 
	       public String getInfo() {
	        	return "Livraison a Domicile 4.99€" ;
	        }
	
}
