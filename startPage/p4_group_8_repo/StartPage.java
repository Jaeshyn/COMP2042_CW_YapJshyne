package p4_group_8_repo;

import java.io.File;
import java.util.List;

import p4_group_8_repo.GametypeMenu;
import p4_group_8_repo.infoPage;
import javafx.application.Application; 
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
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

public class StartPage  { 
	public static void StartingMenu(String[] args) {
		Stage homeScreen = new Stage();  
		   
		  //creating an Image object          
		  Image frogIcon = new Image("file:src/p4_group_8_repo/smiiling-big-eyed-green-frog-clipart-6926.jpg");
		  ImageView startPageIcon = new ImageView(frogIcon);
		  startPageIcon.setX(210); 
		  startPageIcon.setY(50); 
		  startPageIcon.setFitHeight(130); 
		  startPageIcon.setFitWidth(130);
		  startPageIcon.setPreserveRatio(true);
		   
	      //Creating a Text object 
	      Text text = new Text(); 
	      text.setX(55); 
	      text.setY(220);
	      text.setFont(Font.font("Ravie", FontWeight.BOLD, FontPosture.REGULAR, 50));
	      text.setText("Frogger Froggy"); 
	      
	    //create a start button
	      Button start = new Button();
	      start.setText("Start");
	      start.setLayoutX(185);
	      start.setLayoutY(290);
	      start.setPrefSize(200, 40);
	      start.setOnAction(e -> {
	    	  GametypeMenu.showTypeMenu(null);
	    	  homeScreen.close();
	      	});
	      
	     //create an exit button 
	      Button exit = new Button();
	      exit.setText("Exit");
	      exit.setLayoutX(185);
	      exit.setLayoutY(340);
	      exit.setPrefSize(200, 40);
	      exit.setOnAction((ActionEvent event) -> {
	          Platform.exit();
	      });
	     
	      //create an info button
	      Button info = new Button();
	      info.setText("Game Info");
	      info.setLayoutX(185);
	      info.setLayoutY(390);
	      info.setPrefSize(200, 40);
	      info.setOnAction(e -> {
	    	  infoPage.showInfo(null);
	    	  homeScreen.close();
	      	});
	      
	       
	      Group root = new Group();
	      ObservableList list = root.getChildren();//Retrieving the observable list object  
	      list.addAll(startPageIcon,text,start,exit,info);//Setting the text object as a node to the group object
	              
	      Scene scene = new Scene(root, 600, 600); //Creating a scene object 
	      homeScreen.setTitle("Sample Application"); //Setting title to the Stage 
	      homeScreen.setScene(scene); //Adding scene to the stage 
	      homeScreen.show(); //Displaying the contents of the stage 
	   }   
	    
}
