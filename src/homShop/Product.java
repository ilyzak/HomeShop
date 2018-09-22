package homShop;

public class Product {
    String name;
    String description;
    double price;
    
    public Product(String name,String description,double price) {
    	this.name=name;
    	this.description=description;
    	this.price=price;
    }
    /**
     * Display a full description of the product
     */
    public void look() {
        System.out.println(String.format(name + " : " + price + "%n" + description));
    }

    public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	/**
     * Add the product to a Bill
     * @param bill the concerned bill
     * @param quantity the quantity to add
     */
    public void buy(Bill bill, Integer quantity) {

    }
	public Double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	
	
}
	


