package application;

import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class CheckOut
{
	private BorderPane root; 
	private Stage primaryStage;
	private Scene scene;
	
	public CheckOut(Stage primaryStage)
	{		
		root = new BorderPane();
		this.primaryStage = primaryStage;
		this.scene = new Scene (root, 850, 525);
		
		ImageView imgview = new ImageView("./application/MountainPainting.jpg");
		imgview.fitWidthProperty().bind(primaryStage.widthProperty());
		imgview.fitHeightProperty().bind(primaryStage.heightProperty());
		
		root.getChildren().add(imgview);
	}
	
	public void build()
	{
		FlowPane fp = new FlowPane();
		
	}
	
	public void show()
	{
		primaryStage.setScene(scene);
	}
	
	
}
