package ActualCode;

public class Chips extends Snack // Chips class inherits methods and variables from the Snack class, but not the constructors
{// class opens
	// initialising variables
	private boolean salted;
	
	/**
	 * 
	 */
	public Chips()
	{// default constructor opens
		super();
		salted = false;
	}// default constructor closes
	
	/**
	 * 
	 * @param name
	 * @param price
	 * @param quantity
	 * @param flavor
	 * @param organic
	 * @param salted
	 */
	public Chips(String name, float price, int quantity, boolean isSnack, String url, int itemsBought, String flavor, boolean organic, boolean salted)
	{// non-default constructor opens
		super(name, price, quantity, isSnack, url, itemsBought, flavor, organic);
		this.salted = salted;
	}// non-default constructor closes
	
	/**
	 * 
	 * @param chips
	 */
	public Chips(Chips chips)
	{// copy constructor opens
		super(chips);
		this.salted = chips.salted;
	}// copy constructor closes

	/**
	 * 
	 * @return
	 */
	public boolean isSalted() {// isSalted method opens
		return salted;
	}// isSalted method closes

	/**
	 * 
	 * @param salted
	 */
	public void setSalted(boolean salted) {// Setter method opens
		this.salted = salted;
	}// Setter method closes
	
	/**
	 * 
	 */
	public String toString()
	{// toString method opens
		return super.toString() + ", salted: " + salted;
	}// toString method closes
}// class closes
