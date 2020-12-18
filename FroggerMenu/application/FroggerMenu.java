package application;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class FroggerMenu {
	public static void showLevelRetro(String[] args) { 

		Stage levelRetro = new Stage();
		
	    
		//button for the normal level
	    Button normal = new Button();
	    normal.setText("NORMAL");
	    normal.setLayoutX(200);
	    normal.setLayoutY(200);
	    normal.setPrefSize(200, 40);
	    normal.setOnAction((ActionEvent event) -> {
	       //Level1.start(null);
	       levelRetro.close();
	    });
	   
	  	 
	    //button for the hard level
	    Button hard= new Button();
	    hard.setText("HARD");
	    hard.setLayoutX(200);
	    hard.setLayoutY(250);
	    hard.setPrefSize(200, 40);
	    hard.setOnAction((ActionEvent event) -> {
	    	//Level1.start(null);
	    	levelRetro.close();
		});
	    
	    
	  //button for the advanced level
	    Button advanced= new Button();
	    advanced.setText("ADVANCED");
	    advanced.setLayoutX(200);
	    advanced.setLayoutY(300);
	    advanced.setPrefSize(200, 40);
	    advanced.setOnAction((ActionEvent event) -> {
	    	//Level3.start(null);
	    	levelRetro.close();
	    });
	    
	    Group root = new Group();
	    ObservableList list = root.getChildren();//Retrieving the observable list object  
	    list.addAll(normal,hard,advanced);//Setting the text object as a node to the group object
	            
	    Scene scene  = new Scene(root,600,600);
	    levelRetro.setTitle("Sample Application"); //Setting title to the Stage 
	    levelRetro.setScene(scene); //Adding scene to the stage 
	    levelRetro.show(); //Displaying the contents of the stage 
	    
		}


}
