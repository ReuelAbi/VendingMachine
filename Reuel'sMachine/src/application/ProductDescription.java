package application;

import java.util.ArrayList;

import ActualCode.Candy;
import ActualCode.Chips;
import ActualCode.Dispenser;
import ActualCode.Drink;
import ActualCode.Gum;
import ActualCode.Product;
import ActualCode.Snack;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ProductDescription
{
	private Stage primaryStage;
	private Product p;
	private Cart crt;

	public VBox addVbox(Product p, Cart crt)
	{
		this.crt = crt;
		this.p = p;
		VBox vbox = new VBox();
		VBox outerVbox = new VBox();

		vbox.setPadding(new Insets(10));
		vbox.setSpacing(8);

		outerVbox.setPadding(new Insets(10));
		outerVbox.setSpacing(8);

		Text title = new Text("Product Description");
		title.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
		outerVbox.getChildren().add(title);

		Label label1 = new Label(
				"Name: " + p.getName() + '\n' + "Price: $" + p.getPrice() + '\n' + "Quantity: " + p.getQuantity());
		label1.setFont(Font.font("Times New Roman", FontWeight.MEDIUM, 16));
		if (p instanceof Chips)
		{
			Chips c = (Chips) p;

			label1.setText(label1.getText() + '\n' + "Is it Salty? : " + c.isSalted() + '\n' + "Flavour: "
					+ c.getFlavor() + '\n' + "Organic: " + c.isOrganic());
		}

		else if (p instanceof Gum)
		{
			Gum c = (Gum) p;

			label1.setText(label1.getText() + '\n' + "Is it Sugarfree? : " + c.isSugarfree() + '\n' + "Flavour: "
					+ c.getFlavor() + '\n' + "Organic: " + c.isOrganic());
		}

		else if (p instanceof Candy)
		{
			Candy c = (Candy) p;

			label1.setText(label1.getText() + '\n' + "Is it Chocolaty? : " + c.isChocolate() + '\n' + "Flavour: "
					+ c.getFlavor() + '\n' + "Organic: " + c.isOrganic());
		}

		else if (p instanceof Drink)
		{
			Drink d = (Drink) p;

			label1.setText(
					label1.getText() + '\n' + "Liquid Quantity: " + d.getFloz() + '\n' + "Is it Soda? : " + d.isSoda());
		}

		Button add = new Button("Add Item");
		Button remove = new Button("Remove Item");

		add.setOnMouseClicked(new EventHandler<MouseEvent>()
		{
			@Override
			public void handle(MouseEvent e)
			{
				crt.addItems(p);
			}
		});

		remove.setOnMouseClicked(new EventHandler<MouseEvent>()
		{
			@Override
			public void handle(MouseEvent e)
			{
				crt.addItems(p);
			}
		});

		vbox.getChildren().add(label1);
		vbox.getChildren().add(add);
		vbox.getChildren().add(remove);
		outerVbox.getChildren().add(vbox);

		return outerVbox;
	}
}
