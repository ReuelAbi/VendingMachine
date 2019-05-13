package application;

import java.util.ArrayList;

import ActualCode.Dispenser;
import ActualCode.Product;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class Cart
{
	private ItemsPaneProp gp = new ItemsPaneProp();
	private VBox vbox = new VBox();
	private Button crt;
	private ArrayList<Product> selectedItems = new ArrayList<Product>();

	public VBox addCart(BorderPane root, int count, Product p)
	{
		/*
		 * Product p passed here is the specific product that was clicked.
		 */

		// Setting the up the cart button: 
		ImageView img = new ImageView("./application/CartCheckout.jpg");
		img.setFitWidth(75);
		img.setFitHeight(75);

		crt = new Button("Check Out", img);
		
		addItems(p);
		deleteItems(p);

		/*
		 * gp.setHgap(3); gp.setVgap(3);
		 */

		/*
		 * for (int i = 0; i < count; i++) {// for loop opens to populate the GridPane
		 * 
		 * System.out.println(p.isSnack());
		 * 
		 * if (p.isSnack()) { System.out.println("if statement: ");
		 * 
		 * // arrangeItems(i, count, p);
		 * 
		 * Text txt = new Text(); txt.setText(p.getName());
		 * txt.setFont(Font.font("Times New Roman", FontWeight.BOLD,
		 * FontPosture.REGULAR, 18)); gp.add(txt, 0, i);
		 * 
		 * Text txt1 = new Text(); float price = p.getPrice();
		 * txt1.setText(Float.toString(price)); gp.add(txt1, 1, i); }
		 * 
		 * else if (!p.isSnack()) { System.out.println("else if statement: ");
		 * 
		 * Text txt = new Text(); txt.setText(p.getName());
		 * txt.setFont(Font.font("Times New Roman", FontWeight.BOLD,
		 * FontPosture.REGULAR, 18)); gp.add(txt, 0, i);
		 * 
		 * Text txt1 = new Text(); float price = p.getPrice();
		 * txt1.setText(Float.toString(price)); gp.add(txt1, 1, i); } }
		 */

		
		vbox.getChildren().removeAll(vbox.getChildren());
		vbox.getChildren().addAll(gp, crt);

		BorderPane.setAlignment(vbox, Pos.CENTER);
		root.setRight(vbox);

		return vbox;
	}

	public void deleteItems(Product p)
	{
		/*
		 * populate the arraylist itemsBought with the item clicked
		 */
		selectedItems.remove(p);

	}

	public void addItems(Product p)
	{
		selectedItems.add(p);
	}

	/*
	 * public void addItems(int i, int count, Product p) { for (int j = 0; j <
	 * selectedItems.size(); j++) {//
	 * 
	 * 
	 * Product p (the product that was clicked) has access to 1) Name, 2) Price, 3)
	 * Items to be bought, 4) isSnack 5) Quantity
	 * 
	 * } }
	 */

	/**
	 * @return the gp
	 */
	public ItemsPaneProp getGp()
	{
		return gp;
	}

	/**
	 * @param gp the gp to set
	 */
	public void setGp(ItemsPaneProp gp)
	{
		this.gp = gp;
	}
}
