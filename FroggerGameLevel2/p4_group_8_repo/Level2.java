package p4_group_8_repo;

import java.io.File;
import java.util.List;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Level2{
	
		public static void start(String args[]){
		AnimationTimer timer;
		MyStage background;
		Animal animal;
		
		Stage retroLevel2 = new Stage();
	    background = new MyStage();
	    BackgroundImage froggerback = new BackgroundImage("file:src/p4_group_8_repo/iKogsKW.png");
	    background.add(froggerback);
		
		//add End object to the game
		background.add(new End(12,96));
		background.add(new End(130,96));
		background.add(new End(248,96));
		background.add(new End(367,96));
		background.add(new End(480,96));
		
		//add score recorder
		background.add(new Digit(0, 50, 500, 18));
		
		//add miniLogs to the game 
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 0, 166, 0.85));
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 200, 166, 0.85));
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 440, 166, 0.85));
		
		
		//add Logs to the game, place in between miniLogs
		background.add(new Log("file:src/p4_group_8_repo/logs.png", 300, 0, 276, -3));
		background.add(new Log("file:src/p4_group_8_repo/logs.png", 300, 400, 276, -3));
		
		//add and Wet turtle to the game
		background.add(new WetTurtle(600, 217, -2, 130, 130));
		background.add(new WetTurtle(400, 217, -2, 130, 130));
		background.add(new WetTurtle(200, 217, -2, 130, 130));
		
		//add Turtle to the game
		background.add(new Turtle(500, 340, -2, 130, 130));
		background.add(new Turtle(300, 340, -2, 130, 130));
		background.add(new Turtle(700, 340, -2, 130, 130));
		
		
		
		
		animal = new Animal("file:src/p4_group_8_repo/froggerUp.png");
		background.add(animal);
		
		//add car to the game
		background.add(new Obstacle("file:src/p4_group_8_repo/car1Left.png", 500, 460, -5, 50, 50));
		
		background.add(new Obstacle("file:src/p4_group_8_repo/car1Left.png", 100, 587, -2, 50, 50));
		background.add(new Obstacle("file:src/p4_group_8_repo/car1Left.png", 250, 587, -2, 50, 50));
		background.add(new Obstacle("file:src/p4_group_8_repo/car1Left.png", 400, 587, -2, 50, 50));
		background.add(new Obstacle("file:src/p4_group_8_repo/car1Left.png", 550, 587, -2, 50, 50));
		
	
		//add truck to the game
		background.add(new Obstacle("file:src/p4_group_8_repo/truck2Right.png", 0, 510, 2, 200, 200));
		background.add(new Obstacle("file:src/p4_group_8_repo/truck2Right.png", 500, 510, 2, 200, 200));
		
		//add miniTruck to the game
		background.add(new Obstacle("file:src/p4_group_8_repo/truck1"+"Right.png", 0, 649, 2, 120, 120));
		background.add(new Obstacle("file:src/p4_group_8_repo/truck1"+"Right.png", 300, 649, 2, 120, 120));
		background.add(new Obstacle("file:src/p4_group_8_repo/truck1"+"Right.png", 600, 649, 2, 120, 120));
		
		
		
		Scene scene  = new Scene(background,565,800);
		background.start();
		retroLevel2.setScene(scene);
		retroLevel2.show();
		
	}
}