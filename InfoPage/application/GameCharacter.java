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



public class GameCharacter{
	
	public static void ShowCharacter(String args[]){ 
		
		Stage CharacterScreen = new Stage();
		
	      //#game icon explanation--
	      Text title2 = new Text(); 
		  title2.setX(250); 
		  title2.setY(33);
		  title2.setFont(Font.font("Ravie", FontWeight.BOLD, FontPosture.REGULAR, 40));
		  title2.setText("Game Characters");
		  
		  //frog as main character
		  Image frogIcon = new Image("file:///C:/Users/Dell/Documents/tryFrog1/src/p4_group_8_repo/froggerUp.png");
		  ImageView frog = new ImageView(frogIcon);
		  frog.setX(90); 
		  frog.setY(80); 
		  frog.setFitHeight(50); 
		  frog.setFitWidth(50);
		  frog.setPreserveRatio(true);
		  //frog description
		  Text frogDesp = new Text(); 
		  frogDesp.setX(10); 
		  frogDesp.setY(150);
		  frogDesp.setFont(Font.font("Calibri",FontPosture.REGULAR, 20));
		  frogDesp.setText("\t\t   Frog \nThe main character that are\nable to move up, down,left\nand right to avoid obstacle.");
		  
		//Timer as a time recorder
		  Image TimerIcon = new Image("file:///C:/Users/Dell/Documents/tryFrog1/src/p4_group_8_repo/5.png");
		  ImageView Timer = new ImageView(TimerIcon);
		  Timer.setX(395); 
		  Timer.setY(80); 
		  Timer.setFitHeight(50); 
		  Timer.setFitWidth(50);
		  Timer.setPreserveRatio(true);
		  //timer description
		  Text TimerDesp = new Text(); 
		  TimerDesp.setX(320); 
		  TimerDesp.setY(150);
		  TimerDesp.setFont(Font.font("Calibri",FontPosture.REGULAR, 20));
		  TimerDesp.setText("\t\t Timer\nA device that is use to record\nand display the time.");
		  
		//car as a moving obstacle
		  Image carIcon = new Image("file:///C:/Users/Dell/Documents/tryFrog1/src/p4_group_8_repo/car1Left.png");
		  ImageView car = new ImageView(carIcon);
		  car.setX(710); 
		  car.setY(80); 
		  car.setFitHeight(60); 
		  car.setFitWidth(60);
		  car.setPreserveRatio(true);
		  //car description
		  Text carDesp = new Text(); 
		  carDesp.setX(620); 
		  carDesp.setY(150);
		  carDesp.setFont(Font.font("Calibri",FontPosture.REGULAR, 20));
		  carDesp.setText("\t\t\tCar\nA mobile obstacle which moves\nfrom left to right.");
		  
		
		  
		//green turtle as a moving obstacle
		  Image greenTurtleIcon = new Image("file:///C:/Users/Dell/Documents/tryFrog1/src/p4_group_8_repo/TurtleAnimation3Wet.png");
		  ImageView greenTurtle = new ImageView(greenTurtleIcon);
		  greenTurtle.setX(90); 
		  greenTurtle.setY(310); 
		  greenTurtle.setFitHeight(130); 
		  greenTurtle.setFitWidth(100);
		  greenTurtle.setPreserveRatio(true);
		  //green turtle description
		  Text greenTurtleDesp = new Text(); 
		  greenTurtleDesp.setX(15); 
		  greenTurtleDesp.setY(370);
		  greenTurtleDesp.setFont(Font.font("Calibri",FontPosture.REGULAR, 20));
		  greenTurtleDesp.setText("\t\tGreen Turtle\nA mobile obstacle which moves\nfrom left to right.");
		  
		//miniTruck as a moving obstacle
		  Image minitruckIcon = new Image("file:///C:/Users/Dell/Documents/tryFrog1/src/p4_group_8_repo/truck1Right.png");
		  ImageView miniTruck = new ImageView(minitruckIcon);
		  miniTruck.setX(393); 
		  miniTruck.setY(310); 
		  miniTruck.setFitHeight(100); 
		  miniTruck.setFitWidth(100);
		  miniTruck.setPreserveRatio(true);
		  //miniTruck description
		  Text miniTruckDesp = new Text(); 
		  miniTruckDesp.setX(320); 
		  miniTruckDesp.setY(370);
		  miniTruckDesp.setFont(Font.font("Calibri",FontPosture.REGULAR, 20));
		  miniTruckDesp.setText("\t\tMini Truck \nA mobile obstacle which moves\nfrom left to right.");
		  
		 //truck as a moving obstacle
		  Image truckIcon = new Image("file:///C:/Users/Dell/Documents/tryFrog1/src/p4_group_8_repo/truck2Right.png");
		  ImageView truck = new ImageView(truckIcon);
		  truck.setX(660); 
		  truck.setY(310); 
		  truck.setFitHeight(130); 
		  truck.setFitWidth(150);
		  truck.setPreserveRatio(true);
		  //truck description
		  Text truckDesp = new Text(); 
		  truckDesp.setX(620); 
		  truckDesp.setY(370);
		  truckDesp.setFont(Font.font("Calibri",FontPosture.REGULAR, 20));
		  truckDesp.setText("\t\t   Truck\nA mobile obstacle which moves\nfrom left to right.");
		  
		  		  
		  //redTurtle as a moving obstacle
		  Image redTurtleIcon = new Image("file:///C:/Users/Dell/Documents/tryFrog1/src/p4_group_8_repo/TurtleAnimation1.png");
		  ImageView redTurtle = new ImageView(redTurtleIcon);
		  redTurtle.setX(87); 
		  redTurtle.setY(525); 
		  redTurtle.setFitHeight(130); 
		  redTurtle.setFitWidth(100);
		  redTurtle.setPreserveRatio(true);
		  //redTurtle description
		  Text redTurtleDesp = new Text(); 
		  redTurtleDesp.setX(15); 
		  redTurtleDesp.setY(580);
		  redTurtleDesp.setFont(Font.font("Calibri",FontPosture.REGULAR, 20));
		  redTurtleDesp.setText("\t\t  Red Turtle\nA mobile obstacle comes in a\nset of three which moves from\nleft to right.");
		  
		  
		  //miniLog as a moving obstacle
		  Image miniLogIcon = new Image("file:///C:/Users/Dell/Documents/tryFrog1/src/p4_group_8_repo/log2.png");
		  ImageView miniLog = new ImageView(miniLogIcon);
		  miniLog.setX(373); 
		  miniLog.setY(525); 
		  miniLog.setFitHeight(150); 
		  miniLog.setFitWidth(120);
		  miniLog.setPreserveRatio(true);
		  //miniLog description
		  Text miniLogDesp = new Text(); 
		  miniLogDesp.setX(320); 
		  miniLogDesp.setY(580);
		  miniLogDesp.setFont(Font.font("Calibri",FontPosture.REGULAR, 20));
		  miniLogDesp.setText("\t\tMini Log \nA mobile obstacle comes in a\nset of three which moves\nfrom left to right.");
		  
		//Log as a moving obstacle
		  Image LogIcon = new Image("file:///C:/Users/Dell/Documents/tryFrog1/src/p4_group_8_repo/logs.png");
		  ImageView Log = new ImageView(LogIcon);
		  Log.setX(630); 
		  Log.setY(515); 
		  Log.setFitHeight(150); 
		  Log.setFitWidth(200);
		  Log.setPreserveRatio(true);
		  //miniLog description
		  Text LogDesp = new Text(); 
		  LogDesp.setX(620); 
		  LogDesp.setY(580);
		  LogDesp.setFont(Font.font("Calibri",FontPosture.REGULAR, 20));
		  LogDesp.setText("\t\t\tLog\nA mobile obstacle comes in a\nset of three which moves\n from left to right.");
		  
		  
		//create a next button
	      Button next2 = new Button();
	      next2.setText("Next");
	      next2.setLayoutX(810);
	      next2.setLayoutY(15);
	      next2.setPrefSize(50, 30);
	      next2.setOnAction(e -> {
	    	  GameOperationKey.ShowKey(null);
	    	  CharacterScreen.close();
	    	  });
		  
	      
		  Group root = new Group();
	      ObservableList list = root.getChildren();//Retrieving the observable list object 
	      
	    //Setting the text object as a node to the group object
	      list.addAll(title2,frog,frogDesp,Timer,TimerDesp,car,carDesp,miniTruck,miniTruckDesp,truck,truckDesp,redTurtle,redTurtleDesp,greenTurtle,greenTurtleDesp,miniLog,miniLogDesp,Log,LogDesp,next2);
	     
	      Scene scene = new Scene(root,900,700); //Creating a scene object
	      CharacterScreen.setTitle("Sample Application"); //Setting title to the Stage 
	      CharacterScreen.setScene(scene);
	      CharacterScreen.show(); //Displaying the contents of the stage 
		  
	     
	}
	
}
