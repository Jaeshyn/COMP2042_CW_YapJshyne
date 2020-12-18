package p4_group_8_repo;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class LogsAndTurtles {
public static void start(String[] args) {
		
		MyStage background;
		Animal animal;
			
		Stage retroLevel1 = new Stage();
	    background = new MyStage();
	    BackgroundImage froggerback = new BackgroundImage("file:src/p4_group_8_repo/iKogsKW.png");
	    background.add(froggerback);
		
		//add End object to the game
  		background.add(new End(12,96));
  		background.add(new End(130,96));
  		background.add(new End(248,96));
  		background.add(new End(367,96));
  		background.add(new End(490,96));
  		
  		//add score recorder to display and record score
  		background.add(new Digit(0, 50, 500, 18));
  		
		//add miniLogs to the game 
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 0, 166, 0.9));
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 200, 166, 0.9));
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 440, 166, 0.9));
		
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 50, 285, 0.9));
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 270, 285, 0.9));
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 490, 285, 0.9));
		
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 0, 587, 0.7));
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 200, 587, 0.7));
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 440, 587, 0.7));
		
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 50, 460, 0.7));
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 270, 460, 0.7));
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 490, 460, 0.7));
		
			
		//add Turtle and Wet turtle to the game
		background.add(new WetTurtle(600, 217, -1, 130, 130));
		background.add(new WetTurtle(400, 217, -1, 130, 130));
		background.add(new WetTurtle(200, 217, -1, 130, 130));
		
		background.add(new WetTurtle(600, 510, -1, 130, 130));
		background.add(new WetTurtle(400, 510, -1, 130, 130));
		background.add(new WetTurtle(200, 510, -1, 130, 130));
		
		//add wet turtle to the game
		background.add(new Turtle(500, 340, -1, 130, 130));
		background.add(new Turtle(300, 340, -1, 130, 130));
		background.add(new Turtle(700, 340, -1, 130, 130));
		
		background.add(new Turtle(500, 649, -1, 130, 130));
		background.add(new Turtle(300, 649, -1, 130, 130));
		background.add(new Turtle(700, 649, -1, 130, 130));
		
		//add the frog		
		animal = new Animal("file:src/p4_group_8_repo/froggerUp.png");
		background.add(animal);
		
			
		Scene scene  = new Scene(background,565,800);
		background.start();
		retroLevel1.setScene(scene);
		retroLevel1.show();
		
	}

}
