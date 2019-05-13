package application;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class CommHeaderProp extends Text
{
	public CommHeaderProp(String header)
	{
		setText(header);
		setFill(Color.WHITE);
		setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 20));
	}
}
