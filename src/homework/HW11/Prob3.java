package homework.HW11;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

// Author: Nathan Boehning
// Purpose: Draw a face using shapes and arcs
public class Prob3 extends Application
{

	@Override
	public void start(Stage primaryStage)
	{
		Pane pane = new Pane();
		
		// Draw a circle for the head
		Circle head = new Circle();
		head.setCenterX(300);
		head.setCenterY(300);
		head.setRadius(200);
		head.setStroke(Color.BLACK);
		head.setFill(Color.WHITE);
		
		// Draw an ellipse for left eye
		Ellipse eye1 = new Ellipse();
		eye1.setCenterX(225);
		eye1.setCenterY(250);
		eye1.setStroke(Color.BLACK);
		eye1.setFill(Color.WHITE);
		eye1.setRadiusX(50);
		eye1.setRadiusY(25);
		
		// Draw a filled circle for the left iris
		Circle iris1 = new Circle();
		iris1.setCenterX(225);
		iris1.setCenterY(250);
		iris1.setStroke(Color.BLACK);
		iris1.setRadius(15);
		
		// Draw an ellipse for right eye
		Ellipse eye2 = new Ellipse();
		eye2.setCenterX(375);
		eye2.setCenterY(250);
		eye2.setStroke(Color.BLACK);
		eye2.setFill(Color.WHITE);
		eye2.setRadiusX(50);
		eye2.setRadiusY(25);
		
		// Draw a filled circle for the right iris
		Circle iris2 = new Circle();
		iris2.setCenterX(375);
		iris2.setCenterY(250);
		iris2.setStroke(Color.BLACK);
		iris2.setRadius(15);
		
		// Create a polygon for the nose
		Polygon nose = new Polygon();
		nose.getPoints().addAll(new Double[]{
				275.0, 350.0, 
				325.0, 350.0, 
				300.0, 260.0 });
		nose.setStroke(Color.BLACK);
		nose.setFill(Color.WHITE);
		
		// Create an arc for the mouth
		Arc mouth = new Arc(300, 400, 80, 25, 5, -190);
		mouth.setFill(Color.WHITE);
		mouth.setType(ArcType.OPEN);
		mouth.setStroke(Color.BLACK);
		
		// Add all face parts to the pane
		pane.getChildren().add(head);
		pane.getChildren().add(eye1);
		pane.getChildren().add(iris1);
		pane.getChildren().add(eye2);
		pane.getChildren().add(iris2);
		pane.getChildren().add(nose);
		pane.getChildren().add(mouth);
		
		// Add the pane to the scene and display it
		Scene scene = new Scene(pane, 600, 600);
		primaryStage.setTitle("Problem 3");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args)
	{
		Application.launch(args);
	}

}
