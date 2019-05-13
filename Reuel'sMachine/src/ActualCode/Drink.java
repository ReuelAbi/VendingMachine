package ActualCode;

public class Drink extends Product implements Comparable<Product>// <--- that's inheritance: extend keyword pull in all the methods from the product class
{// class opens
	// Initialising variables:
	private boolean soda;
	private float floz;
	
	/**
	 * 
	 */
	public Drink()
	{// default constructor opens
		super();
		soda = false;
		floz = 0;
	}// constructor closes
	
	/**
	 * 
	 * @param name
	 * @param price
	 * @param quantity
	 * @param soda
	 * @param floz
	 */
	public Drink(String name, float price, int quantity, boolean isSnack, String url, int itemsBought, boolean soda, float floz)
	{// non-default constructor opens
		super(name, price, quantity, isSnack, url, itemsBought);
		super.setSnack(false);
		this.soda = soda;
		this.floz = floz;
	}// constructor closes
	
	/**
	 * 
	 * @param drink
	 */
	public Drink(Drink drink)
	{// opening up copy constructor
		super(drink);
		this.soda = drink.soda;
		this.floz = drink.floz;
	}// closing the copy constructor

	/**
	 * 
	 * @return
	 */
	public boolean isSoda() {// opening up the getter method
		return soda;
	}// closing the getter method

	/**
	 * 
	 * @param soda
	 */
	public void setSoda(boolean soda) {// opening up the setter method
		this.soda = soda;
	}// closing the setter method

	/**
	 * 
	 * @return
	 */
	public float getFloz() {// opening up the getter method
		return floz;
	}// closing the getter method

	/**
	 * 
	 * @param floz
	 */
	public void setFloz(float floz) {// opening up the setter method
		this.floz = floz;
	}// closing the setter method
	
	/**
	 * 
	 */
	public String toString()
	{// opening up the toString method
		return super.toString() + ", soda: " + soda + ", floz: " + floz;
	}// closing the toString method

	/**
	 * 
	 */
	@Override
	public int compareTo(Product obj)
	{
		if (this.getName().compareTo(obj.getName()) < 0)
		{
			return -1;
		}

		else if (this.getName().compareTo(obj.getName()) == 0)
		{
			if (this.getPrice() < obj.getPrice())
			{
				return -1;
			}
			else if(this.getPrice() > obj.getPrice())
			{
				return 1;
			}
			else
				return 0;
		} 
		else
			return 1;
	}
}// class closes
