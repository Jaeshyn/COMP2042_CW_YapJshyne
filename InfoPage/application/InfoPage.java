 package application;

import javafx.application.Application; 
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.application.Platform;
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.stage.Stage; 
import javafx.scene.image.ImageView; 
import javafx.scene.image.Image;
import javafx.scene.text.Text; 
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import java.io.FileInputStream;



public class InfoPage{
	public static void showInfo(String[] args) { 
		
		Stage InfoScreen = new Stage();
		
		//Frogger Game Screenshot
		  Image gameScreenshot = new Image("file:///C:/Users/Dell/Documents/tryFrog2/src/p4_group_8_repo/arcade.png");
		  ImageView GameView = new ImageView(gameScreenshot);
		  GameView.setX(220); 
		  GameView.setY(40); 
		  GameView.setFitHeight(360); 
		  GameView.setFitWidth(310);
		  GameView.setPreserveRatio(true);
		
		
		  Text title = new Text(); 
		  title.setX(210); 
		  title.setY(460);
		  title.setFont(Font.font("Calibri", FontWeight.BOLD, FontPosture.REGULAR, 50));
		  title.setText("Frogger Froggy");
		  
		  Text gameDesp = new Text(); 
		  gameDesp.setX(30); 
		  gameDesp.setY(500);
		  gameDesp.setFont(Font.font("Calibri",FontPosture.REGULAR, 20));
		  gameDesp.setText("Frogger froggy is an improvise version of the traditional Frogger game. ");
		  
		  
		  //create a next button
	      Button next1 = new Button();
	      next1.setText("Next");
	      next1.setLayoutX(600);
	      next1.setLayoutY(15);
	      next1.setPrefSize(50, 30);
	      next1.setOnAction(e -> {  
	    	  GameCharacter.ShowCharacter(null);
	    	  InfoScreen.close();});
	      
		  
		  Group root = new Group();
	      ObservableList list = root.getChildren();//Retrieving the observable list object 
	      
	    //Setting the text object as a node to the group object
	      list.addAll(next1,GameView,title,gameDesp);
	     
	      Scene scene = new Scene(root,900,900); //Creating a scene object
	      InfoScreen.setTitle("Sample Application"); //Setting title to the Stage 
	      InfoScreen.setScene(scene);
	      InfoScreen.show(); //Displaying the contents of the stage 
		  
	     
	}

}
