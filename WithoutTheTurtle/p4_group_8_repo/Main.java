package p4_group_8_repo;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {
	
	AnimationTimer timer;
	MyStage background;
	Animal animal;
	public void start(Stage primaryStage) throws Exception {
		StartPage.StartingMenu(null);
		
		
	}
	public static void main(String[] args) {
		launch(args);
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

