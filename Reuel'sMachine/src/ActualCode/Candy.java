package ActualCode;

public class Candy extends Snack // Candy class inherits methods and variables from the Snack class, but not the constructors.
{// class opens
	// initialising variables
	private boolean chocolate;
	
	/**
	 * 
	 */
	public Candy()
	{// candy constructor opens
		super();
		chocolate = false;
	}// candy constructor closes
	
	/**
	 * 
	 * @param name
	 * @param price
	 * @param quantity
	 * @param flavor
	 * @param organic
	 * @param chocolate
	 */
	public Candy(String name, float price, int quantity, boolean isSnack, String url, int itemsBought, String flavor, boolean organic, boolean chocolate)
	{// non-default constructor opens
		super(name, price, quantity, isSnack, url, itemsBought, flavor, organic);
		this.chocolate = chocolate;
	}// non-default constructor closes
	
	/**
	 * 
	 * @param candy
	 */
	public Candy(Candy candy)
	{// copy constructor opens
		super(candy);
		this.chocolate = candy.chocolate;
	}// copy constructor closes
	
	/**
	 * 
	 * @return
	 */
	public boolean isChocolate() {// isChocolate method opens
		return chocolate;
	}// isChocolate method closes

	/**
	 * 
	 * @param chocolate
	 */
	public void setChocolate(boolean chocolate) {// Setter method opens
		this.chocolate = chocolate;
	}// setter method closes

	/**
	 * 
	 */
	public String toString()
	{// toString opens
		return super.toString() + ", chocolate: "  + chocolate;
	}// toString closes
}// class closes
