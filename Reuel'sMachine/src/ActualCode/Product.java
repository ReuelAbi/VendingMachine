package ActualCode;

public abstract class Product // the keyword abstract makes a class abstract
{// class opens
	// initialising variables
	private String name; 
	private float price; 
	private int quantity; 
	private boolean isSnack; 
	private String url; 
	private int itemsBought;
	
	/**
	 * 
	 */
	public Product()
	{// opening default constructor
		name = "";
		price = 0;
		quantity = 0;
		isSnack = false; 
		url = "";
		itemsBought = 0;
	}// closing the default constructor

	/**
	 * 
	 * @param name
	 * @param price
	 * @param quantity
	 */
	public Product(String name, float price, int quantity, boolean isSnack, String url, int itemsB)
	{// opening up the non-default constructor		
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.isSnack = isSnack;
		this.url = url;
		this.itemsBought = itemsB;
	}// closing the non-default constructor
	
	/**
	 * 
	 * @param prod
	 */
	public Product(Product prod)
	{// opening up the copy constructor
		this(prod.name, prod.price, prod.quantity, prod.isSnack, prod.url, prod.itemsBought);
		/*
		 * In, other words:
		 * this.name = prod.name;
		 * this.price = prod.price;
		 * this.quantity = prod.quantity;
		 */
	}// closing the copy constructor
	
	/**
	 * 
	 * @return
	 */
	public String getName()
	{// opening up the getter method
		return name;
	}// closing the getter method
	
	/**
	 * 
	 * @param name
	 */
	public void setName(String name)
	{// opening up the setter method
		this.name = name;
	}// closing the setter method

	/**
	 * 
	 * @return
	 */
	public float getPrice() {// opening up the getter method
		return price;
	}// closing the getter method

	/**
	 * 
	 * @param price
	 */
	public void setPrice(float price) {// opening the setter method
		this.price = price;
	}// closing the setter method

	/**
	 * 
	 * @return
	 */
	public int getQuantity() {// opening the getter method
		return quantity;
	}// closing the getter method

	/**
	 * 
	 * @param quantity
	 */
	public void setQuantity(int quantity) {// opening up the setter method
		this.quantity = quantity;
	}// closing the setter method
	
	/**
	 * @return the isSnack
	 */
	public boolean isSnack()
	{
		return isSnack;
	}

	/**
	 * @param isSnack the isSnack to set
	 */
	public void setSnack(boolean isSnack)
	{
		this.isSnack = isSnack;
	}

	/**
	 * @return the url
	 */
	public String getUrl()
	{
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url)
	{
		this.url = url;
	}

	/**
	 * @return the itemsBought
	 */
	public int getItemsBought()
	{
		return itemsBought;
	}

	/**
	 * @param itemsBought the itemsBought to set
	 */
	public void setItemsBought(int itemsBought)
	{
		this.itemsBought = itemsBought;
	}

	/**
	 * 
	 */
	public String toString()
	{// opening up the toString method
		return "Name: " + name + ", Price: " + price + ", Quantity: " + quantity;
 	}// closing the toString method
	
	/**
	 * 
	 * @param obj
	 * @return
	 */
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
