package application;

import ActualCode.Dispenser;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class InventoryManagement
{
	private FlowPane flpane;
	private Scene scene;
	private Stage primaryStage;
	private Cart crt;
	
	public InventoryManagement(Stage primaryStage, Cart crt)
	{
		this.crt = crt;
		
		FlowPane flow = new FlowPane();
		flow.setPadding(new Insets(5, 0, 5, 0));
		flow.setVgap(4);
		flow.setHgap(4);
		flow.setPrefWrapLength(170); // preferred width allows for two columns
		flow.setStyle("-fx-background-color: DAE6F3;");

		this.scene = new Scene(flow, 800, 475);

		primaryStage.setTitle("Vending Machine's Inventory");

		ImageView imgview = new ImageView("./application/MountainPainting.jpg");
		imgview.fitWidthProperty().bind(primaryStage.widthProperty());
		imgview.fitHeightProperty().bind(primaryStage.heightProperty());

		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		this.primaryStage = primaryStage;
		this.flpane = flow;
		flpane.setStyle("-fx-background-color: blue");

		flpane.getChildren().add(imgview);
	}

	public void build(Dispenser d)
	{
		BorderPane root = new BorderPane();
		BorderPane.setAlignment(flpane, Pos.CENTER);

		root.setTop(flpane);

		for (int i = 0; i < d.getItems().length; i++)
		{

		}
	}

	public void show()
	{
		
	}
}
