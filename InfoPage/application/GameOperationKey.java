package application;

import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GameOperationKey {
	public static void ShowKey(String[] args) {
		
		Stage GameKeyScreen = new Stage();
		
		 //#Game Operation Key explanation--
		  Text title = new Text(); 
		  title.setX(50); 
		  title.setY(70);
		  title.setFont(Font.font("Calibri", FontWeight.BOLD, FontPosture.REGULAR, 40));
		  title.setText("Game Operation Key");
		  
		  
		  //create a "W" key object
		  Button buttonW = new Button("W");
		  buttonW.setTranslateX(95);
		  buttonW.setTranslateY(120);
		  buttonW.setPrefSize(40, 40);
		  //key"W" description
		  Text keyW_Desp = new Text(); 
		  keyW_Desp.setX(50); 
		  keyW_Desp.setY(180);
		  keyW_Desp.setFont(Font.font("Calibri",FontPosture.REGULAR, 20));
		  keyW_Desp.setText("\t Key'W' \nClicked on this key\nto move forward");
		  
		  
		  //create a "S" key object
		  Button buttonS = new Button("S");
		  buttonS.setTranslateX(310);
		  buttonS.setTranslateY(120);
		  buttonS.setPrefSize(40, 40);
		  //key"S" description
		  Text keyS_Desp = new Text(); 
		  keyS_Desp.setX(270); 
		  keyS_Desp.setY(180);
		  keyS_Desp.setFont(Font.font("Calibri",FontPosture.REGULAR, 20));
		  keyS_Desp.setText("\t Key'S' \nClicked on this key\nto move backward");
		  
		  
		//create a "A" key object
		  Button buttonA = new Button("A");
		  buttonA.setTranslateX(95);
		  buttonA.setTranslateY(300);
		  buttonA.setPrefSize(40, 40);
		  //key"A" description
		  Text keyA_Desp = new Text(); 
		  keyA_Desp.setX(50); 
		  keyA_Desp.setY(360);
		  keyA_Desp.setFont(Font.font("Calibri",FontPosture.REGULAR, 20));
		  keyA_Desp.setText("\t Key'A' \nClicked on this key\nto move to the left");
		  
		  
		//create a "D" key object
		  Button buttonD = new Button("D");
		  buttonD.setTranslateX(320);
		  buttonD.setTranslateY(300);
		  buttonD.setPrefSize(40, 40);
		  //key"D" description
		  Text keyD_Desp = new Text(); 
		  keyD_Desp.setX(270); 
		  keyD_Desp.setY(360);
		  keyD_Desp.setFont(Font.font("Calibri",FontPosture.REGULAR, 20));
		  keyD_Desp.setText("\t   Key'D' \nClicked on this key\nto move to the right");
		  
		//create a back to home page button
	      Button homePage = new Button();
	      homePage.setText("Home Page");
	      homePage.setLayoutX(400);
	      homePage.setLayoutY(15);
	      homePage.setPrefSize(90, 30);
	      homePage.setOnAction(e -> {
	    	  //BeginPage.launch(null);
	    	  GameKeyScreen.close();
	    	  });
		  
		  
		  Group root = new Group();
	      ObservableList list = root.getChildren();//Retrieving the observable list object 
	      
	    //Setting the text object as a node to the group object
	      list.addAll(title,buttonW,keyW_Desp,buttonS,keyS_Desp,buttonA,keyA_Desp,buttonD,keyD_Desp,homePage);
	     
	      Scene scene = new Scene(root,500,500); //Creating a scene object
	      GameKeyScreen.setTitle("Sample Application"); //Setting title to the Stage 
	      GameKeyScreen.setScene(scene);
	      GameKeyScreen.show(); //Displaying the contents of the stage 
	}

}
