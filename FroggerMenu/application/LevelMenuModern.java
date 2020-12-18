package application;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class LevelMenuModern {
		public static void showLevelModern(String[] args) { 
		
		Stage levelModern = new Stage();
			
		//button for the normal level
	    Button normal = new Button();
	    normal.setText("Exit");
	    normal.setLayoutX(185);
	    normal.setLayoutY(340);
	    normal.setPrefSize(200, 40);
	    normal.setOnAction((ActionEvent event) -> {
	        //LevelMenuRetro.exit();
	    });
	   
	  	 
	    //button for the hard level
	    Button hard= new Button();
	    hard.setText("Game Info");
	    hard.setLayoutX(185);
	    hard.setLayoutY(390);
	    hard.setPrefSize(200, 40);
	    hard.setOnAction(e -> {
	  	  //LevelMenuModern.exit();
	    });
	    
	    
	  //button for the advanced level
	    Button advanced= new Button();
	    advanced.setText("Game Info");
	    advanced.setLayoutX(185);
	    advanced.setLayoutY(390);
	    advanced.setPrefSize(200, 40);
	    advanced.setOnAction(e -> {
	  	  //LevelMenuModern.exit();
	    });
	    
	    	    
	    Group root = new Group();
	    ObservableList list = root.getChildren();//Retrieving the observable list object  
	    list.addAll(normal,hard,advanced);//Setting the text object as a node to the group object
	            
	    Scene scene = new Scene(root, 600, 600); //Creating a scene object 
	    levelModern.setTitle("Sample Application"); //Setting title to the Stage 
	    levelModern.setScene(scene); //Adding scene to the stage 
	    levelModern.show(); //Displaying the contents of the stage 
	    
		}

	}


