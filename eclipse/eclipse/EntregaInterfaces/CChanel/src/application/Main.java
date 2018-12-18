package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;



public class Main extends Application {
	
	private AnchorPane mypane;
	@Override
	public void start(Stage stage) {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("chanel.fxml"));
		
		try {
			mypane = (AnchorPane) loader.load();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		stage.setTitle("Where´s the squirrel");
		stage.setScene(new Scene(mypane));
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
