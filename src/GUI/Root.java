/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static adminclinic.AdminClinic.HEIGHT;
import static adminclinic.AdminClinic.WIDTH;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.StackPane;

/**
 *
 * @author user771
 */
public class Root extends StackPane {
    
    double width, height;
    
    public Root(){
       width = WIDTH;
       height = HEIGHT;
        setMaxWidth(USE_COMPUTED_SIZE);
        setMaxHeight(USE_COMPUTED_SIZE);
        setAlignment(Pos.CENTER_LEFT);
    }
     
    public void setCenter(){
        
    }
    
   public void addView(Node v){
         getChildren().add(0,v);
         
         
    }
   
   public void setBackgroundPhoto(String file){
        setStyle("-fx-background-image:url('"+file+"'); -fx-background-size: cover;");
   }
   
   public void setBackgroundColor(String color){
               setStyle("-fx-background-color: "+color+"; -fx-background-size: cover;");

   }
   
   public void removeView(){
       try{
       if (getChildren().get(0) != null) {
                  getChildren().remove(0);

       }
       }catch(Exception e){
           System.out.println("from remove view "+e.getMessage());
       }
   }
}
