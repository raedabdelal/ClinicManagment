/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Views;

import GUI.Root;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;

/**
 *
 * @author user771
 */
public class Photo extends Root {

    StackPane mImage;
    Label mTitle;

    public Photo(String url) {
        mImage = new StackPane();
        mImage.setMaxSize(USE_COMPUTED_SIZE, USE_COMPUTED_SIZE);
        mImage.setStyle("-fx-background-image:url('" + url + "'); -fx-background-size: stretch; -fx-background-size: stretch;");
        addView(mImage);

    }
    
        public Photo(String url, int width, int height) {
         mImage = new StackPane();
        mImage.setMaxSize(USE_COMPUTED_SIZE, USE_COMPUTED_SIZE);
        mImage.setStyle("-fx-background-image:url('" + url + "'); -fx-background-size: stretch;-fx-background-size: stretch;");
        addView(mImage);
        mImage.setPrefSize(width, height);
        

    }
    
    public void setPhotoSize(){
  

    }
}
