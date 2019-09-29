/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pages;

import GUI.Root;
import GUI.Views.Photo;
import GUI.Views.TabBar;
import adminclinic.Index;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

/**
 *
 * @author user771
 */
public class DoctorHomePage extends Root {

    private TabBar mBar;
    private Photo mProfilePicture;
    private HBox mProfileContainer;
    private VBox mInfo;
    private Label mName, mAge, mMajor;

    private Photo mAppointmentPhoto, mPatientPhoto, mAccountingPhoto;
    private TabBar mAppointmentBar, mPatientBar, mAccountingBar;
    private VBox mAppointmentsBox, mPatientBox, mAccountingBox;

    private HBox mPageBox;

    private Button mLogout;

    public DoctorHomePage() {
        setBackgroundColor("ffffff");
        setAlignment(Pos.TOP_LEFT);
        setProfile();
        setPage();

        mLogout = new Button();
        mLogout.setMaxSize(550, 28);
        mLogout.setText("LOGOUT");
        addView(mLogout);
        mLogout.setTranslateX(800);
        mLogout.setTranslateY(800);
        mLogout.setAlignment(Pos.CENTER);
        mLogout.setFont(new Font(28));
        mLogout.setStyle("-fx-background-color: #1a9cd0aa; -fx-background-radius: 30px; -fx-prompt-text-fill: #ffffff;-fx-text-fill: #ffffff;-fx-background-size: cover;");

        mLogout.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Index.openPage(Index.mHomePage);
                System.out.println("in these days there is n o one to one and no one foe onew");
            }
        });

        mLogout.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                mLogout.setStyle("-fx-background-color: #000000; -fx-background-radius: 30px; -fx-prompt-text-fill: #ffffff;-fx-text-fill: #ffffff;-fx-background-size: cover;");
            }
        });

        mLogout.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                mLogout.setStyle("-fx-background-color: #1a9cd0aa; -fx-background-radius: 30px; -fx-prompt-text-fill: #ffffff;-fx-text-fill: #ffffff;-fx-background-size: cover;");
            }
        });

        mLogout.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                mLogout.setStyle("-fx-background-color: #000000; -fx-background-radius: 30px; -fx-prompt-text-fill: #ffffff;-fx-text-fill: #ffffff;-fx-background-size: cover;");
            }
        });

    }

    private void setProfile() {
        mBar = new TabBar();
        addView(mBar);
        mBar.setTitle("Home Page");
        mBar.setFont("broadway", 50);

        mProfileContainer = new HBox();
        mProfileContainer.setMaxSize(400, 800);
        mProfileContainer.setStyle("-fx-background-color: #f5f5f5; -fx-background-radius: 13px;-fx-background-size: cover;");
        addView(mProfileContainer);
        mProfileContainer.setAlignment(Pos.TOP_LEFT);
        mProfileContainer.setTranslateY(110);
        mProfileContainer.setTranslateX(10);

        mProfilePicture = new Photo("image/doctor.png", 200, 200);
        addToProfile(mProfilePicture);
        mProfilePicture.setMaxSize(200, 200);
        mProfilePicture.setTranslateX(10);
        mProfilePicture.setTranslateY(10);
        //    addToProfile(mBar);

        mInfo = new VBox();
        mInfo.setMaxSize(200, 200);
        addToProfile(mInfo);
        mInfo.setTranslateX(30);
        mInfo.setTranslateY(60);

        mName = new Label("Raed Abdel-Al");
        mAge = new Label("M/27 years Old");
        mMajor = new Label("Heart doctor");

        mName.setStyle("-fx-text-fill: #001010;");
        mAge.setStyle("-fx-text-fill: #001010;");
        mMajor.setStyle("-fx-text-fill: #001010;");

        mName.setFont(new Font(22));
        mAge.setFont(new Font(22));
        mMajor.setFont(new Font(22));

        addToInfo(mName);
        addToInfo(mAge);
        addToInfo(mMajor);

    }

    private void setPage() {

        mPageBox = new HBox();
        mPageBox.setMaxSize(1400, 400);
        addView(mPageBox);
        mPageBox.setTranslateX(400);
        mPageBox.setTranslateY(400);

        mAppointmentsBox = new VBox();
        mPatientBox = new VBox();
        mAccountingBox = new VBox();

        mPageBox.getChildren().add(mAppointmentsBox);
        mPageBox.getChildren().add(mPatientBox);
        mPageBox.getChildren().add(mAccountingBox);

        mPageBox.setMargin(mAppointmentsBox, new Insets(0, 0, 20, 105));
        mPageBox.setMargin(mPatientBox, new Insets(0, 0, 20, 105));
        mPageBox.setMargin(mAccountingBox, new Insets(0, 0, 20, 105));

        mAppointmentsBox.setMaxSize(400, 300);
        mPatientBox.setMaxSize(400, 300);
        mAccountingBox.setMaxSize(400, 300);

        mAppointmentsBox.setAlignment(Pos.BOTTOM_CENTER);
        mPatientBox.setAlignment(Pos.BOTTOM_CENTER);
        mAccountingBox.setAlignment(Pos.BOTTOM_CENTER);

        mAppointmentPhoto = new Photo("image/appointment.png", 400, 400);
        mPatientPhoto = new Photo("image/patient.png", 400, 400);
        mAccountingPhoto = new Photo("image/accounting.png", 400, 400);
        

        mAppointmentsBox.getChildren().add(mAppointmentPhoto);
        mPatientBox.getChildren().add(mPatientPhoto);
        mAccountingBox.getChildren().add(mAccountingPhoto);

        setListener(mAppointmentsBox);
        setListener(mPatientBox);
        setListener(mAccountingBox);
        
        mPatientBox.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                    Index.openPage(Index.mPatientsPage);

            }
        }
        );

        mAppointmentBar = new TabBar("Appointments");
        mPatientBar = new TabBar("Patients");
        mAccountingBar = new TabBar("Accounting");

        mAppointmentsBox.getChildren().add(mAppointmentBar);
        mPatientBox.getChildren().add(mPatientBar);
        mAccountingBox.getChildren().add(mAccountingBar);

    }

    private void setListener(VBox box) {
        box.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                box.setStyle("-fx-background-color: #ffffff;-fx-background-size: cover;");
               
            }
        });

        box.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                box.setStyle("-fx-background-color: #1a9cd0aa; -fx-background-size: cover;");

            }
        });

        box.setFocusTraversable(true);
    }

    public void addToProfile(Node view) {
        mProfileContainer.getChildren().add(view);
    }

    public void addToInfo(Node view) {
        mInfo.getChildren().add(view);
    }
}
