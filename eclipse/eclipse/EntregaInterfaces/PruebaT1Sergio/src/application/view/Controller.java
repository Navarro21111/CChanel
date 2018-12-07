package application.view;

import java.io.IOException;

import application.control.Main;
import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class Controller {

	@FXML
	Stage stage;
	
	ImageView imagen; 

	// Main main;
	// Stage stage;
	//
	// public void main(Stage stage, Main main) {
	// this.main = main;
	// this.stage = stage;
	// }

	
	public void showHome() {
		try {
			// Load the fxml file and create a new stage for the popup.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("../view/GetMe.fxml"));
			AnchorPane page = (AnchorPane) loader.load();
			Stage homeStage = new Stage();
			homeStage.setTitle("Main Menu");
			Scene scene = new Scene(page);
			homeStage.setScene(scene);
			homeStage.setMaximized(true);
			homeStage.show();
			System.out.println("second stage ok");
			//Para hacer el efecto de transparencia
			FadeTransition fadeTransition1=new FadeTransition(Duration.seconds(10),imagen);
	        fadeTransition1.setFromValue(1);
	        fadeTransition1.setToValue(0);
	        fadeTransition1.play();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("second stage ko");
		}
	}
/**
 * Método para abrir la nueva pantalla
 */
	public void nuevaVentana() {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource(
				"../view/GetMe.fxml"));
        AnchorPane pane;
		try {
			pane = loader.load();
			Scene scene = new Scene(pane);

	        stage.setScene(scene);
	        stage.setTitle("Nueva Ventana");
	        stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
/**
 * Método para cerrar la ejecución
 */
	public void cerrar() {
		System.exit(0);
	}

}
