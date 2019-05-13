package application;

import ActualCode.Dispenser;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SnacksOrDrinks
{
	private BorderPane root;
	private Stage primaryStage;
	private Scene scene;
	private Cart crt;

	public SnacksOrDrinks(Stage primaryStage, Cart crt)
	{
		BorderPane root1 = new BorderPane();		
		this.scene = new Scene(root1, 800, 475);
		this.crt = crt;

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
		// ItemsPaneProp extends GridPane and stores the common properties shared in other classes.
		ItemsPaneProp pane = new ItemsPaneProp();		

		// Header Created: 
		CommHeaderProp header = new CommHeaderProp("Lopes Vending Machine");
		BorderPane.setAlignment(header, Pos.CENTER);
		root.setTop(header);
		
		// Create a Line: 
		Line line = new Line(100, 10, 300, 10);
		line.setFill(Color.GOLDENROD);
		line.setStrokeWidth(2);
		line.setSmooth(true);
		pane.add(line, 0, 0);
		
		// Create all the Scene's Components and setup the Event Handlers
		ImageView img = new ImageView("./application/softdrink.jpg");
		img.setFitWidth(75);
		img.setFitHeight(75);
		Button btn1 = new Button("Select to get Drinks", img);
		btn1.setStyle("-fx-background-color: white");
		btn1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
		btn1.setContentDisplay(ContentDisplay.TOP);
		pane.add(btn1, 0, 1);

		ImageView img1 = new ImageView("./application/potato-chips.png");
		img1.setFitWidth(75);
		img1.setFitHeight(75);
		Button btn2 = new Button("Select to get Snacks", img1);
		btn2.setStyle("-fx-background-color: white");
		btn2.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
		btn2.setContentDisplay(ContentDisplay.TOP);
		pane.add(btn2, 1, 1);

		root.setCenter(pane);

		btn1.setOnMouseClicked(new EventHandler<MouseEvent>()
		{
			@Override
			public void handle(MouseEvent e)
			{
				// Create, build, and show Scene 2
				DrinksList scene = new DrinksList(primaryStage, crt);
				scene.build(dis);
				scene.show();
			}
		});

		btn2.setOnMouseClicked(new EventHandler<MouseEvent>()
		{
			@Override
			public void handle(MouseEvent e)
			{
				// Create, build, and show Scene 2
				SnacksList scene = new SnacksList(primaryStage, crt);
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
