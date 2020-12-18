package p4_group_8_repo;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class WithoutTheTurtles {
	
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
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 0, 166, 0.7));
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 200, 166, 0.7));
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 440, 166, 0.7));
		
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 50, 285, 0.7));
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 270, 285, 0.7));
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 490, 285, 0.7));
		
		//add the frog		
		animal = new Animal("file:src/p4_group_8_repo/froggerUp.png");
		background.add(animal);
		
		//add car to the game
		background.add(new Obstacle("file:src/p4_group_8_repo/car1Left.png", 0, 217, -3, 50, 50));
		background.add(new Obstacle("file:src/p4_group_8_repo/car1Left.png", 500, 217, -3, 50, 50));
		
		background.add(new Obstacle("file:src/p4_group_8_repo/car1Left.png", 100, 587, -3, 50, 50));
		background.add(new Obstacle("file:src/p4_group_8_repo/car1Left.png", 250, 587, -3, 50, 50));
		background.add(new Obstacle("file:src/p4_group_8_repo/car1Left.png", 400, 587, -3, 50, 50));
		background.add(new Obstacle("file:src/p4_group_8_repo/car1Left.png", 550, 587, -3, 50, 50));
		
		background.add(new Obstacle("file:src/p4_group_8_repo/car1Left.png", 500, 460, -3, 50, 50));
		
		//add truck to the game
		background.add(new Obstacle("file:src/p4_group_8_repo/truck2Right.png", 0, 340, 2, 200, 200));
		background.add(new Obstacle("file:src/p4_group_8_repo/truck2Right.png", 500, 340, 2, 200, 200));
		
		background.add(new Obstacle("file:src/p4_group_8_repo/truck1"+"Right.png", 0, 649, 2, 120, 120));
		background.add(new Obstacle("file:src/p4_group_8_repo/truck1"+"Right.png", 300, 649, 2, 120, 120));
		background.add(new Obstacle("file:src/p4_group_8_repo/truck1"+"Right.png", 600, 649, 2, 120, 120));
		
		background.add(new Obstacle("file:src/p4_group_8_repo/truck2Right.png", 0, 510, 2, 200, 200));
		background.add(new Obstacle("file:src/p4_group_8_repo/truck2Right.png", 500, 510, 2, 200, 200));
		
		
		Scene scene  = new Scene(background,565,800);
		background.start();
		retroLevel1.setScene(scene);
		retroLevel1.show();
		
	}
	
}