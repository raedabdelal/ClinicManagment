/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pages;

import GUI.Root;
import GUI.Views.Photo;
import adminclinic.Index;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

/**
 *
 * @author user771
 */
public class RegistrationPage extends Root {

    private VBox mBox;
    private TextField mUsername;
    private TextField mFullname;
    private PasswordField mPassword;
    private Button mClick;
    private Label mLabel;
    private ImageView mLogo;
    private Photo mImage;
    private Hyperlink mLink;
    private RadioButton mDoctorButton, mReceptionButton;

    public RegistrationPage() {

        setBackgroundPhoto("image/background2.jpeg");
        mBox = new VBox();
        addView(mBox);
        mBox.setMaxWidth(500);
        mBox.setMaxHeight(600);

        mBox.setStyle("-fx-background-color: #104b4b4b; -fx-background-radius: 30px");
        mBox.setAlignment(Pos.CENTER);

        mBox.setTranslateX(200.0);
        mBox.setTranslateY(00);

        mLabel = new Label("REGISTRATION");
        mBox.getChildren().add(mLabel);
        mLabel.setFont(new Font("broadway", 45));
        mLabel.setMaxSize(400, 100);
        mLabel.setStyle("-fx-background-radius: 30px;-fx-text-fill: #ffffff;");
        mLabel.setAlignment(Pos.CENTER);

        mUsername = new TextField();
        mPassword = new PasswordField();
        mFullname = new TextField();
        
        mUsername.setMaxSize(350, 300);
        mPassword.setMaxSize(350, 300);
        mFullname.setMaxSize(350, 300);
        
        mFullname.setFont(new Font(24));
        mUsername.setFont(new Font(24));
        mPassword.setFont(new Font(24));

        mUsername.setStyle("-fx-background-color: #101010aa; -fx-background-radius: 30px; -fx-prompt-text-fill: #ffffff;-fx-text-fill: #ffffff;");
        mPassword.setStyle("-fx-background-color: #101010aa; -fx-background-radius: 30px; -fx-prompt-text-fill: #ffffff;-fx-text-fill: #ffffff;");
        mFullname.setStyle("-fx-background-color: #101010aa; -fx-background-radius: 30px; -fx-prompt-text-fill: #ffffff;-fx-text-fill: #ffffff;");

        mUsername.setPromptText("Username");
        mPassword.setPromptText("Password");
        mFullname.setPromptText("FullName");

//        mUsername.setTranslateX(100);
//        mUsername.setTranslateY(300);
//
//        mPassword.setTranslateX(100);
//        mPassword.setTranslateY(400);
        mBox.getChildren().add(mFullname);
        mBox.getChildren().add(mUsername);
        mBox.getChildren().add(mPassword);
        
                mDoctorButton = new RadioButton("Doctor");
        mReceptionButton = new RadioButton("Reception");
        
        ToggleGroup radioGroup = new ToggleGroup();
        
        mDoctorButton.setToggleGroup(radioGroup);
        mReceptionButton.setToggleGroup(radioGroup);
        
        mBox.getChildren().add(mDoctorButton);
        mBox.getChildren().add(mReceptionButton);
        
        mDoctorButton.setSelected(true);
        mDoctorButton.setStyle("-fx-background-color: #101010cc; -fx-background-radius: 10; -fx-text-fill: #ffffff;");
        mReceptionButton.setStyle("-fx-background-color: #101010cc; -fx-background-radius: 10; -fx-text-fill: #ffffff;");
        mDoctorButton.setFont(new Font(24));
        mReceptionButton.setFont(new Font(24));
        mDoctorButton.setMaxWidth(200);
        mReceptionButton.setMaxWidth(200);
        mReceptionButton.setAlignment(Pos.TOP_LEFT);
        mDoctorButton.setAlignment(Pos.TOP_LEFT);

        

        mLink = new Hyperlink("LOGIN");
        mLink.setFont(new Font(24));
        mLink.setStyle("-fx-background-color: #101010cc; -fx-background-radius: 10; -fx-text-fill: #fb564f;");
        mBox.getChildren().add(mLink);

        mLink.setOnAction(e -> {
            Index.openPage(Index.mHomePage);
        });

        mClick = new Button();
        mClick.setMaxSize(250, 120);
        mClick.setText("REGISTER");
        mBox.getChildren().add(mClick);
        mClick.setAlignment(Pos.CENTER);
        mClick.setFont(new Font(28));
        mClick.setStyle("-fx-background-color: #1a9cd0aa; -fx-background-radius: 30px; -fx-prompt-text-fill: #ffffff;-fx-text-fill: #ffffff;");
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
                mClick.setStyle("-fx-background-color: #1a9cd0aa; -fx-background-radius: 30px; -fx-prompt-text-fill: #ffffff;-fx-text-fill: #ffffff;");
            }
        });
        
        mClick.setTranslateY(-170);

        mImage = new Photo("image/logo.png");
        mImage.setMaxSize(600, 500);

        addView(mImage);
        mImage.setTranslateX(1000);
        mImage.setTranslateY(0);
        mImage.setStyle("-fx-background-color: #ffffffaa; -fx-background-radius: 30px; -fx-prompt-text-fill: #ffffff;-fx-text-fill: #ffffff;");
        
        mBox.setMargin(mDoctorButton, new Insets(10, 0, 0, 0));
        mBox.setMargin(mReceptionButton, new Insets(10, 0, 0, 0));
        mBox.setMargin(mFullname, new Insets(0, 0, 50, 0));
        mBox.setMargin(mUsername, new Insets(0, 0, 50, 0));
        mBox.setMargin(mPassword, new Insets(0, 0, 0, 0));
        mBox.setMargin(mLabel, new Insets(40, 0, 150, 0));
        mBox.setMargin(mLink, new Insets(90, 0, 50, 260));
       

    }
}
