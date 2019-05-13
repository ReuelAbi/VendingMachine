package application;

import ActualCode.Product;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class CommonButtonProp extends Button
{
	private int count = 0;

	public CommonButtonProp(String name, BorderPane root, Product p, String url, int btnNo, Cart crt)
	{
		try
		{
			// setting the image from the URL:
			ImageView logoView = new ImageView(url);
			logoView.setFitWidth(75);
			logoView.setFitHeight(75);
			setGraphic(logoView);
		} catch (Exception e)
		{

		}
		setText(name);

		setStyle("-fx-background-color: white");
		setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
		setContentDisplay(ContentDisplay.TOP);

		setOnMouseClicked(new EventHandler<MouseEvent>()
		{
			@Override
			public void handle(MouseEvent e)
			{
				count += 1;

				// Create, build, and show Scene 2
				ProductDescription prodes = new ProductDescription();
				root.setCenter(prodes.addVbox(p, crt)); // returning
				root.setRight(crt.addCart(root, count, p));
				
				
			}
		});
	}
}
