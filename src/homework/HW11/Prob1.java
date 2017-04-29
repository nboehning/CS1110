package homework.HW11;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

// Author: Nathan Boehning
// Purpose: Place 4 images into a grid pane.
public class Prob1 extends Application
{
	@Override
	public void start(Stage primaryStage)
	{
		// TODO Auto-generated method stub
		GridPane grid = new GridPane();
		
		grid.setAlignment(Pos.CENTER);
		grid.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		
		grid.setHgap(5.5);
		grid.setVgap(5.5);
		
		grid.add(new ImageView("/image/card/1.png"), 0, 0);
		grid.add(new ImageView("/image/card/2.png"), 0, 1);
		grid.add(new ImageView("/image/card/3.png"), 1, 0);
		grid.add(new ImageView("/image/card/4.png"), 1, 1);
		
		Scene scene = new Scene(grid);
		primaryStage.setTitle("Problem 1");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args)
	{
		Application.launch(args);
	}
}
