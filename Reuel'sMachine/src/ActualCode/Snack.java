package ActualCode;

public abstract class Snack extends Product implements Comparable<Product>// <--- abstract class inheriting the
																			// attributes from the Product class
{// class opens
	// Initialising variables	
	private String flavor;
	private boolean organic;

	/**
	 * 
	 */
	public Snack()
	{// default constructor opens
		super(); 
		super.setSnack(true);
		flavor = "";
		organic = false;
	}// non-default constructor closes

	/**
	 * 
	 * @param name
	 * @param price
	 * @param quantity
	 * @param flavor
	 * @param organic
	 */
	public Snack(String name, float price, int quantity, boolean isSnack, String url, int itemsBought, String flavor, boolean organic)
	{// non-default constructor opens
		super(name, price, quantity, isSnack, url, itemsBought);
		super.setSnack(true);
		this.flavor = flavor;
		this.organic = organic;
	}// non-default constructor closes

	/**
	 * 
	 * @param snack
	 */
	public Snack(Snack snack)
	{// copy constructor opens
		super(snack);
		this.flavor = snack.flavor;
		this.organic = snack.organic;
	}// copy constructor closes

	/**
	 * 
	 * @return
	 */
	public String getFlavor()
	{// getter method opens
		return flavor;
	}// getter method closes

	/**
	 * 
	 * @param flavor
	 */
	public void setFlavor(String flavor)
	{// setter method opens
		this.flavor = flavor;
	}// setter method closes

	/**
	 * 
	 * @return
	 */
	public boolean isOrganic()
	{// isOrganic method opens
		return organic;
	}// Organic method closes

	/**
	 * 
	 * @param organic
	 */
	public void setOrganic(boolean organic)
	{// setter method opens
		this.organic = organic;
	}// setter method closes

	/**
	 * 
	 */
	public String toString()
	{// toString method opens
		return super.toString() + ", Flavor: " + flavor + ", Organic: " + organic;
	}// toString method closes

	/**
	 * 
	 */
	public int compareTo(Product obj)
	{// compareTo method opens
		if (this.getName().compareTo(obj.getName()) < 0)
		{// if statement compares strings and returns an int.
			return -1;
		}

		else if (this.getName().compareTo(obj.getName()) == 0)
		{// else if method opens and compares prices if strings are equal: 
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
		} // else if method closes. 
		else
			return 1; // returning an int value. 
	}// compareTo method closes 
}// class closes. 
