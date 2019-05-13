package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;

public class ItemsPaneProp extends GridPane
{
	public ItemsPaneProp()
	{
		setAlignment(Pos.CENTER);
		setPadding(new Insets(50, 50, 80, 20));

		setHgap(10);
		setVgap(10);
	}
}
