package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Ellipse;

public class Controlador {

	@FXML
    private ImageView imageView;   
	private Ellipse ellipse;

	
	@FXML
    public void setclip() {           
        ellipse = new Ellipse();
//        circle = new Circle((imageView.getFitWidth())*0.2);

        ellipse.centerXProperty().setValue(120);
        ellipse.centerYProperty().setValue(40);
        ellipse.radiusXProperty().setValue(90);
        ellipse.radiusYProperty().setValue(90);
        
//        importing and modifying sizes
//    	ellipse.radiusXProperty().setValue(imageView.getFitWidth()*0.1);
//    	ellipse.radiusYProperty().setValue(imageView.getFitHeight()*0.17);
        
        imageView.setClip(ellipse);

////apply a shadow effect.
//        imageView.setEffect(new DropShadow(10, Color.BLACK));

    }

	@FXML
    public void abrir() {           
		
    }
	
	@FXML
	private void cerrar() {
	
	        System.exit(0);
	}
}
