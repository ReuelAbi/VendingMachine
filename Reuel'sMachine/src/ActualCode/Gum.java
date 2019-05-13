package ActualCode;

public class Gum extends Snack {// Gum class inherits methods and variables from the Snack class, but not the constructors
// class opens
	// initialising variables:
	private boolean sugarfree;
	
	/**
	 * 
	 */
	public Gum()
	{// default constructor opens
		super();
		sugarfree = false;
	}// default constructor closes
	
	/**
	 * 
	 * @param name
	 * @param price
	 * @param quantity
	 * @param flavor
	 * @param organic
	 * @param sugarfree
	 */
	public Gum(String name, float price, int quantity, boolean isSnack, String url, int itemsBought, String flavor, boolean organic, boolean sugarfree)
	{// non-default constructor opens
		super(name, price, quantity, isSnack, url, itemsBought, flavor, organic);
		this.sugarfree = sugarfree;
	}// non-default constructor closes
	
	/**
	 * 
	 * @param gum
	 */
	public Gum(Gum gum)
	{// copy constructor opens
		super(gum);
		this.sugarfree = gum.sugarfree;
	}// copy constructor closes

	/**
	 * 
	 * @return
	 */
	public boolean isSugarfree() {// isSugarfree method opens
		return sugarfree;
	}// isSugarfree method closes

	/**
	 * 
	 * @param sugarfree
	 */
	public void setSugarfree(boolean sugarfree) {// Setter method opens
		this.sugarfree = sugarfree;
	}// Setter method closes
	
	/**
	 * 
	 */
	public String toString()
	{// toString method opens
		return super.toString() + ", sugarfree: " + sugarfree;
	}// toString method closes
}// class closes
