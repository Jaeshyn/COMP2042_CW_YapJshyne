package p4_group_8_repo;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MiniGameMenu {
public static void showMinigameType(String[] args) { 
		
		Stage MinigameType = new Stage();
			
		//button for game without the logs
	    Button noTurtle = new Button();
	    noTurtle.setText("WITHOUT THE TURTLES");
	    noTurtle.setLayoutX(200);
	    noTurtle.setLayoutY(200);
	    noTurtle.setPrefSize(200, 40);
	    noTurtle.setOnAction((ActionEvent event) -> {
	       WithoutTheTurtles.start(null);
	       MinigameType.close();
	    });
	   
	  	 
	    //button game with only Logs and Turtle
	    Button logsAndTurtle= new Button();
	    logsAndTurtle.setText("LOGS & WET TURTLES");
	    logsAndTurtle.setLayoutX(200);
	    logsAndTurtle.setLayoutY(250);
	    logsAndTurtle.setPrefSize(200, 40);
	    logsAndTurtle.setOnAction((ActionEvent event) -> {
	    	LogsAndTurtles.start(null);
	    	MinigameType.close();
		});
	    
	    
	  //button for game with only car and trucks
	    Button carAndTruck= new Button();
	    carAndTruck.setText("CAR & TRUCK");
	    carAndTruck.setLayoutX(200);
	    carAndTruck.setLayoutY(300);
	    carAndTruck.setPrefSize(200, 40);
	    carAndTruck.setOnAction(e -> {
	    	CarAndTruck.start(null);
	    	MinigameType.close();
	    });
	    
	    Group root = new Group();
	    ObservableList list = root.getChildren();//Retrieving the observable list object  
	    list.addAll(noTurtle,logsAndTurtle,carAndTruck);
	            
	    Scene scene  = new Scene(root,600,600);
	    MinigameType.setTitle("Sample Application"); //Setting title to the Stage 
	    MinigameType.setScene(scene); //Adding scene to the stage 
	    MinigameType.show(); //Displaying the contents of the stage 
	    
		}

	}


