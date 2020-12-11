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

public class GameNormal {
	AnimationTimer timer;
	MyStage background;
	Animal animal;
	
	
	public void start(Stage primaryStage) {
		
		
	    background = new MyStage();
	    Scene scene  = new Scene(background,565,800);
	   
	  	  		
	    BackgroundImage froggerback = new BackgroundImage("file:src/p4_group_8_repo/iKogsKW.png");
	    
		background.add(froggerback);
		
		//add End object to the game
  		background.add(new End(12,96));
  		background.add(new End(130,96));
  		background.add(new End(248,96));
  		background.add(new End(367,96));
  		background.add(new End(490,96));
  		
		//add miniLogs to the game 
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 0, 166, 0.5));
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 200, 166, 0.5));
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 440, 166, 0.5));
		
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 50, 285, 0.5));
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 270, 285, 0.5));
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 490, 285, 0.5));
		
			
		//add Turtle and Wet turtle to the game
		background.add(new WetTurtle(600, 217, -1, 130, 130));
		background.add(new WetTurtle(400, 217, -1, 130, 130));
		background.add(new WetTurtle(200, 217, -1, 130, 130));
		
		//add wet turtle to the game
		background.add(new Turtle(500, 340, -1, 130, 130));
		background.add(new Turtle(300, 340, -1, 130, 130));
		background.add(new Turtle(700, 340, -1, 130, 130));
		
		
		
		
		
		animal = new Animal("file:src/p4_group_8_repo/froggerUp.png");
		background.add(animal);
		background.add(new Obstacle("file:src/p4_group_8_repo/truck1"+"Right.png", 0, 649, 1, 120, 120));
		background.add(new Obstacle("file:src/p4_group_8_repo/truck1"+"Right.png", 300, 649, 1, 120, 120));
		background.add(new Obstacle("file:src/p4_group_8_repo/truck1"+"Right.png", 600, 649, 1, 120, 120));
		//background.add(new Obstacle("file:src/p4_group_8_repo/truck1"+"Right.png", 720, 649, 1, 120, 120));
		background.add(new Obstacle("file:src/p4_group_8_repo/car1Left.png", 100, 587, -1, 50, 50));
		background.add(new Obstacle("file:src/p4_group_8_repo/car1Left.png", 250, 587, -1, 50, 50));
		background.add(new Obstacle("file:src/p4_group_8_repo/car1Left.png", 400, 587, -1, 50, 50));
		background.add(new Obstacle("file:src/p4_group_8_repo/car1Left.png", 550, 587, -1, 50, 50));
		background.add(new Obstacle("file:src/p4_group_8_repo/truck2Right.png", 0, 510, 1, 200, 200));
		background.add(new Obstacle("file:src/p4_group_8_repo/truck2Right.png", 500, 510, 1, 200, 200));
		background.add(new Obstacle("file:src/p4_group_8_repo/car1Left.png", 500, 460, -3, 50, 50));
		background.add(new Digit(0, 30, 360, 25));
		
		
		background.start();
		primaryStage.setScene(scene);
		primaryStage.show();
		start();  
	}
	public void createTimer() {
        timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
            	if (animal.changeScore()) {
            		setNumber(animal.getPoints());
            	}
            	if (animal.getStop()) {
            		System.out.print("STOP:");
            		background.stopMusic();
            		stop();
            		background.stop();
            		Alert alert = new Alert(AlertType.INFORMATION);
            		alert.setTitle("You Have Won The Game!");
            		alert.setHeaderText("Your High Score: "+animal.getPoints()+"!");
            		alert.setContentText("Highest Possible Score: 800");
            		alert.show();
            	}
            }
        };
    }
	public void start() {
		background.playMusic();
    	createTimer();
        timer.start();
    }

    public void stop() {
        timer.stop();
    }
    
    public void setNumber(int n) {
    	int shift = 0;
    	while (n > 0) {
    		  int d = n / 10;
    		  int k = n - d * 10;
    		  n = d;
    		  background.add(new Digit(k, 30, 360 - shift, 25));
    		  shift+=30;
    		}
    }
}