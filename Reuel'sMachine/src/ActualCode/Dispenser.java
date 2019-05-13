// Reuel Abishai Maddela
// CST-135 (Java II)
// February 23, 2018
// Mark Reha
// This is my own work.

package ActualCode;

import java.util.ArrayList;

public class Dispenser
{// class opens

	private Product[] items;
	private int numItems; 

	public Product[] getItems()
	{
		return items;
	}

	public void setItems(Product[] items)
	{
		this.items = items;
	}

	/**
	 * 
	 */
	public Dispenser()
	{// opening a default constructor
		items = new Product[20];// initialised an array

		// Polymorphism is being implemented: 
		items[0] = new Drink("Aquafina", (float) 1.25, 20, false, "./application/Aquafina.jpg", 0, false, (float) 6.5);
		items[1] = new Drink("Dasani", (float) 1.25, 20, false, "./application/Dasani.jpg", 0, false, (float) 6.5);
		items[2] = new Drink("Coca-Cola", (float) 1.50, 20, false, "./application/Coca-Cola.jpg", 0, true, (float) 6.5);
		items[3] = new Drink("Dr.Pepper", (float) 1.50, 20, false, "./application/Dr_pepper.jpg", 0, true, (float) 6.5);
		items[4] = new Drink("Stampede", (float) 2.50, 20, false, "./application/Stampede.png", 0, true, (float) 6.5);
		items[5] = new Drink("Apple Juice", (float) 1.30, 20, false, "./application/AppleJuice.jpg", 0, false, (float) 6.5);
		items[6] = new Chips("Doritos", (float) 1.00, 20, true, "./application/doritos-original[1].jpg", 0, "Spicy", false, true);
		items[7] = new Chips("C-Chips", (float) 1.00, 20, true, "./application/chips-packet-md[1].png", 0, "Classic", true, true);
		items[8] = new Candy("M&M", (float) 0.90, 20, true, "./application/M&M.png", 0, "All", false, true);
		items[9] = new Candy("Cadbury", (float) 1.00, 20, true, "./application/Cadbury.jpg", 0, "Milk Chocolate", true, true);
		items[10] = new Gum("Doublemint", (float) 1.00, 20, true, "./application/Doublemint.jpg", 0, "mint", false, true);
		items[11] = new Gum("Orbit", (float) 0.80, 20, true, "./application/Orbit.jpg", 0, "original", false, false);
		
		numItems = 12; // stores in the length of the items array.
//		items[7] = new Gum("Orbit", (float) 0.80, )
		sort(items, numItems);
	}// closing the constructor

	/**
	 * 
	 * @param arr
	 * @param n
	 * @return
	 */
	public Product[] sort(Product[] arr, int n)
	{// sort method of the type Product opens
		if(n == 1)// if the value is 1
			return arr;
		Product temp;
		for(int i = 0; i < (n-1); i++)
		{
			if(arr[i+1].compareTo(arr[i]) < 0)
			{
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		return (sort(arr, n-1));
	}// sort method closes
	
	/**
	 * 
	 */
	public void displayProducts()
	{// opening the displayProducts method

		for (Product prod : items)
		{// for loop opens

			System.out.println(prod);

		} // for loop closes

	}// closing the displayProducts method

	public static void main(String args[])
	{
		Dispenser d = new Dispenser();
		d.displayProducts();
	}
	
	
	/**
	 * @return the numItems
	 */
	public int getNumItems()
	{
		return numItems;
	}

	/**
	 * @param numItems the numItems to set
	 */
	public void setNumItems(int numItems)
	{
		this.numItems = numItems;
	}
}// class closes
