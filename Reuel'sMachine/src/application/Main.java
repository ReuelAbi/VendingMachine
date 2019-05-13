package application;

import ActualCode.Dispenser;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application
{
	@Override
	public void start(Stage primaryStage)
	{
		try
		{	
			Dispenser dis = new Dispenser();
			

			// Every Button has a Cart.
			Cart crt = new Cart();
			
			
			SnacksOrDrinks sndr = new SnacksOrDrinks(primaryStage, crt);
			sndr.build(dis);
			sndr.show();			
			
			primaryStage.setTitle("Vending Machine");
			primaryStage.show();
			
			CheckOut ch = new CheckOut(primaryStage);

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}
