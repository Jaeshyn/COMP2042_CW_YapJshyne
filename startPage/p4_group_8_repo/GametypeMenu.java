package p4_group_8_repo;

import p4_group_8_repo.MiniGameMenu;
import p4_group_8_repo.ClassicFroggerMenu;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class GametypeMenu {
public static void showTypeMenu(String[] args) { 
		
		Stage Gametype = new Stage();
		
		//creating an Image object          
		  Image frogIconRetro = new Image("file:src/p4_group_8_repo/icon-frogger-pixel-512x512.png");
		  ImageView retroIcon = new ImageView(frogIconRetro);
		  retroIcon.setX(70); 
		  retroIcon.setY(160); 
		  retroIcon.setFitHeight(140); 
		  retroIcon.setFitWidth(140);
		  retroIcon.setPreserveRatio(true);
		  
		//button for the ususal frogger game
	      Button retro = new Button();
	      retro.setText("RETRO FROGGER");
	      retro.setLayoutX(50);
	      retro.setLayoutY(340);
	      retro.setPrefSize(200, 80);
	      retro.setOnAction((ActionEvent event) -> {
	    	  ClassicFroggerMenu.showLevelRetro(null);
	    	  Gametype.close();
	      });
	      
	      
	    	      
	    //creating an Image object          
		  Image frogIconModern = new Image("file:src/p4_group_8_repo/smiiling-big-eyed-green-frog-clipart-6926.jpg");
		  ImageView ModernIcon = new ImageView(frogIconModern);
		  ModernIcon.setX(370); 
		  ModernIcon.setY(160); 
		  ModernIcon.setFitHeight(170); 
		  ModernIcon.setFitWidth(170);
		  ModernIcon.setPreserveRatio(true);
	     
	      //button for Minigames
	      Button Minigames= new Button();
	      Minigames.setText("MINI GAMES");
	      Minigames.setLayoutX(360);
	      Minigames.setLayoutY(340);
	      Minigames.setPrefSize(200, 80);
	      Minigames.setOnAction(e -> {
	    	  MiniGameMenu.showMinigameType(null);
	    	  Gametype.close();
	    	 
	      	});
	      
	      Group root = new Group();
	      ObservableList list = root.getChildren();//Retrieving the observable list object  
	      list.addAll(retroIcon,ModernIcon,retro, Minigames);
	              
	      Scene scene = new Scene(root, 600, 600); //Creating a scene object 
	      
	      Gametype.setTitle("Sample Application"); //Setting title to the Stage 
	      Gametype.setScene(scene); //Adding scene to the stage 
	      Gametype.show(); //Displaying the contents of the stage 

}
}


