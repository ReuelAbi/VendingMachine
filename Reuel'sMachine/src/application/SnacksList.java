package application;

import java.util.ArrayList;

import ActualCode.Dispenser;
import ActualCode.Product;
import ActualCode.Snack;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SnacksList
{
	private BorderPane root;
	private Stage primaryStage;
	private Scene scene;
	ArrayList<Product> prodlist = new ArrayList<Product>();
	private Cart crt;

	public SnacksList(Stage primaryStage, Cart crt)
	{
		this.crt = crt;
		BorderPane root1 = new BorderPane();
		this.scene = new Scene(root1, 850, 525);

		ImageView imgview = new ImageView("./application/MountainPainting.jpg");
		imgview.fitWidthProperty().bind(primaryStage.widthProperty());
		imgview.fitHeightProperty().bind(primaryStage.heightProperty());

		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		this.primaryStage = primaryStage;
		this.root = root1;
		root.setStyle("-fx-background-color: blue");

		root.getChildren().add(imgview);
	}

	public void build(Dispenser dis)
	{

		for (Product i : dis.getItems())
		{
			if (i != null)
				if (i.isSnack())
				{
					prodlist.add(i);
				}
		}

		// ItemsPaneProp extends GridPane and stores the common properties shared in
		// other classes.
		ItemsPaneProp pane = new ItemsPaneProp();

		

		HBox hbox = new HBox();
		hbox.setPadding(new Insets(15, 12, 15, 12));
		hbox.setSpacing(10);
		BorderPane.setAlignment(hbox, Pos.TOP_LEFT);

		Button back = new Button("Back");
		back.setPrefSize(50, 20);

		Button inv = new Button("Inventory (View all items)");
		inv.setPrefSize(150, 20);

		hbox.getChildren().addAll(back, inv);

		// Header Created:
		CommHeaderProp header = new CommHeaderProp("Lopes Vending Machine");
		BorderPane.setAlignment(header, Pos.CENTER);
		root.setTop(header);

		root.setTop(hbox);

		// Create all the Scene's Components and setup the Event Handlers
		int count = 0;
		for (int i = 0; i < dis.getNumItems(); i++)
		{
			if (dis.getItems()[i].isSnack())
			{
				CommonButtonProp btn = new CommonButtonProp(dis.getItems()[i].getName(), root, dis.getItems()[i],
						dis.getItems()[i].getUrl(), i, crt);
				pane.add(btn, count % 2, count / 2);
				count++;
			}
		}

		root.setLeft(pane);

		back.setOnMouseClicked(new EventHandler<MouseEvent>()
		{
			@Override
			public void handle(MouseEvent e)
			{
				// Create, build, and show Scene 2
				SnacksOrDrinks scene = new SnacksOrDrinks(primaryStage, crt);
				scene.build(dis);
				scene.show();
			}
		});

		inv.setOnMouseClicked(new EventHandler<MouseEvent>()
		{
			@Override
			public void handle(MouseEvent e)
			{
				// Create, build, and show Scene 2
				InventoryManagement scene = new InventoryManagement(primaryStage, crt);
				scene.build(dis);
				scene.show();
			}
		});
	}

	public void show()
	{
		primaryStage.setScene(scene);
	}
}
