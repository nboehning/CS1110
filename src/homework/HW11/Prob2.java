package homework.HW11;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Prob2 extends Application
{
	@Override
	public void start(Stage primaryStage)
	{
		// Create an array to store integers for card index
		int[] cardVal = new int[52];
		
		// Set the values of the different index's of the deck to correspond to numbering in file system
		for(int i = 0; i < cardVal.length; i++)
			cardVal[i] = i + 1;
		
		// Create a grid pane
		GridPane grid = new GridPane();
		
		// Align it with the center
		grid.setAlignment(Pos.CENTER);
		grid.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		
		// Set horizontal gap
		grid.setHgap(5.5);
		grid.setVgap(5.5);
		
		// Add the randomized cards to the grid, horizontally
		grid.add(new ImageView("/image/card/" + cardVal[(int) (Math.random() * cardVal.length)] + ".png"), 0, 0);
		grid.add(new ImageView("/image/card/" + cardVal[(int) (Math.random() * cardVal.length)] + ".png"), 1, 0);
		grid.add(new ImageView("/image/card/" + cardVal[(int) (Math.random() * cardVal.length)] + ".png"), 2, 0);
		
		// Create and display the scene
		Scene scene = new Scene(grid);
		primaryStage.setTitle("Problem 2");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Application.launch(args);
	}

}
