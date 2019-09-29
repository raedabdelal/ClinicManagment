/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pages;

import GUI.Root;
import java.io.FileInputStream;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import GUI.Views.Photo;
import adminclinic.Index;
import javafx.event.ActionEvent;
import javafx.scene.control.Hyperlink;

/**
 *
 * @author user771
 */
public class HomePage extends Root {
    
    VBox mBox;
    TextField mUsername;
    PasswordField mPassword;
    Button mClick;
    Label mLabel;
    ImageView mLogo;
    Photo mImage;
    Hyperlink mLink;
    
    public HomePage() {
        
        setBackgroundPhoto("image/background.jpg");
        mBox = new VBox();
        addView(mBox);
        mBox.setMaxWidth(500);
        mBox.setMaxHeight(600);
        
        mBox.setStyle("-fx-background-color: #104b4b4b; -fx-background-radius: 30px;-fx-background-size: cover;");
        mBox.setAlignment(Pos.CENTER);
        
        mBox.setTranslateX(200.0);
        mBox.setTranslateY(00);
        
        mLabel = new Label("LOGIN");
        mBox.getChildren().add(mLabel);
        mLabel.setFont(new Font("broadway", 45));
        mLabel.setMaxSize(200, 100);
        mLabel.setStyle("-fx-background-radius: 30px;-fx-text-fill: #ffffff;-fx-background-size: cover;");
        mLabel.setAlignment(Pos.CENTER);
        
        mUsername = new TextField();
        mPassword = new PasswordField();
        
        mUsername.setMaxSize(350, 300);
        mPassword.setMaxSize(350, 300);
        
        mUsername.setFont(new Font(24));
        mPassword.setFont(new Font(24));
        
        mUsername.setStyle("-fx-background-color: #101010aa; -fx-background-radius: 30px; -fx-prompt-text-fill: #ffffff;-fx-text-fill: #ffffff;-fx-background-size: cover;");
        mPassword.setStyle("-fx-background-color: #101010aa; -fx-background-radius: 30px; -fx-prompt-text-fill: #ffffff;-fx-text-fill: #ffffff;-fx-background-size: cover;");
        
        mUsername.setPromptText("Username");
        mPassword.setPromptText("Password");

//        mUsername.setTranslateX(100);
//        mUsername.setTranslateY(300);
//
//        mPassword.setTranslateX(100);
//        mPassword.setTranslateY(400);
        mBox.getChildren().add(mUsername);
        mBox.getChildren().add(mPassword);
        
        mClick = new Button();
        mClick.setMaxSize(150, 120);
        mClick.setText("Login");
        mBox.getChildren().add(mClick);
        mClick.setAlignment(Pos.CENTER);
        mClick.setFont(new Font(28));
        mClick.setStyle("-fx-background-color: #1a9cd0aa; -fx-background-radius: 30px; -fx-prompt-text-fill: #ffffff;-fx-text-fill: #ffffff;-fx-background-size: cover;");
        mClick.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Index.openPage(Index.mDoctorHomePage);
                System.out.println("in these days there is n o one to one and no one foe onew");
            }
        });
        
        mClick.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                mClick.setStyle("-fx-background-color:#dae7f3;");
            }
        });
        mClick.setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                mClick.setStyle("-fx-background-color: #1a9cd0aa; -fx-background-radius: 30px; -fx-prompt-text-fill: #ffffff;-fx-text-fill: #ffffff;-fx-background-size: cover;");
            }
        });
        
        mImage = new Photo("image/logo.png");
        mImage.setMaxSize(600, 500);
        
        addView(mImage);
        mImage.setTranslateX(1000);
        mImage.setTranslateY(0);
        mImage.setStyle("-fx-background-color: #ffffffaa; -fx-background-radius: 30px; -fx-prompt-text-fill: #ffffff;-fx-text-fill: #ffffff;-fx-background-size: cover;");
        
        mLink = new Hyperlink("Registration");
        mLink.setFont(new Font(24));
        mLink.setStyle("-fx-background-color: #101010cc; -fx-background-radius: 10;-fx-background-size: cover;");
        mBox.getChildren().add(mLink);
        
        mLink.setOnAction(e -> {
            Index.openPage(Index.mRegistrationPage);
        });
        
        mBox.setMargin(mUsername, new Insets(0, 0, 50, 0));
        mBox.setMargin(mPassword, new Insets(0, 0, 50, 0));
        mBox.setMargin(mLabel, new Insets(40, 0, 150, 0));
        mBox.setMargin(mLink, new Insets(90, 0, 50, 260));
        
    }
}
