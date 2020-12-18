package application;


import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class MenuType {
public static void showTypeMenu(String[] args) { 
		
		Stage Gametype = new Stage();
		
		//creating an Image object          
		  Image frogIconRetro = new Image("file:///C:/Users/Dell/Documents/tryFrog2/src/p4_group_8_repo/icon-frogger-pixel-512x512.png");
		  ImageView retroIcon = new ImageView(frogIconRetro);
		  retroIcon.setX(70); 
		  retroIcon.setY(160); 
		  retroIcon.setFitHeight(140); 
		  retroIcon.setFitWidth(140);
		  retroIcon.setPreserveRatio(true);
		  
		//button for old school version
	      Button retro = new Button();
	      retro.setText("RETRO");
	      retro.setLayoutX(50);
	      retro.setLayoutY(340);
	      retro.setPrefSize(200, 80);
	      retro.setOnAction((ActionEvent event) -> {
	          LevelMenuRetro.showLevelRetro(null);
	      });
	      
	      
	    	      
	    //creating an Image object          
		  Image frogIconModern = new Image("file:///C:/Users/Dell/Documents/tryFrog2/src/p4_group_8_repo/smiiling-big-eyed-green-frog-clipart-6926.jpg");
		  ImageView ModernIcon = new ImageView(frogIconModern);
		  ModernIcon.setX(370); 
		  ModernIcon.setY(160); 
		  ModernIcon.setFitHeight(170); 
		  ModernIcon.setFitWidth(170);
		  ModernIcon.setPreserveRatio(true);
	     
	      //button for modern version
	      Button modern= new Button();
	      modern.setText("MODERN");
	      modern.setLayoutX(360);
	      modern.setLayoutY(340);
	      modern.setPrefSize(200, 80);
	      modern.setOnAction(e -> {
	    	  LevelMenuModern.showLevelModern(null);
	    	 
	      	});
	      
	      Group root = new Group();
	      ObservableList list = root.getChildren();//Retrieving the observable list object  
	      list.addAll(retroIcon,ModernIcon,retro,modern);//Setting the text object as a node to the group object
	              
	      Scene scene = new Scene(root, 600, 600); //Creating a scene object 
	      
	      Gametype.setTitle("Sample Application"); //Setting title to the Stage 
	      Gametype.setScene(scene); //Adding scene to the stage 
	      Gametype.show(); //Displaying the contents of the stage 

}
}