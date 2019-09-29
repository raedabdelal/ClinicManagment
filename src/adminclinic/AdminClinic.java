/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminclinic;

import GUI.Root;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import pages.HomePage;
import pages.RegistrationPage;

/**
 *
 * @author user771
 */
public class AdminClinic extends Application {

    public static double WIDTH;
    public static double HEIGHT;

    @Override
    public void start(Stage primaryStage) {

        StackPane root = new StackPane();

        Scene scene = new Scene(root);

        primaryStage.setTitle("Clinic Administration!");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.getIcons().add(new Image("file:src/image/logo.png"));
        WIDTH = primaryStage.getWidth();
        HEIGHT = primaryStage.getHeight();
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        
        int width = gd.getDisplayMode().getWidth();
        int height = gd.getDisplayMode().getHeight();
       
        primaryStage.setMaximized(true);
        primaryStage.setMaxWidth(width);
        primaryStage.setMaxHeight(height);
        primaryStage.setMinWidth(width);
        primaryStage.setMinHeight(height);

        Index index = new Index();
        root.getChildren().add(index);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
