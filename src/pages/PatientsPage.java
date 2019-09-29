/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pages;

import GUI.Root;
import GUI.Views.TabBar;
import adminclinic.Index;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

/**
 *
 * @author user771
 */
public class PatientsPage extends Root {

    private TabBar mBar;
    private TableView mList;

    public PatientsPage() {

        setBackgroundColor("ffffff");
        setAlignment(Pos.TOP_LEFT);
        mBar = new TabBar("Patients Page");
        addView(mBar);
        mBar.setFont("broadway", 50);

        mList = new TableView();
        addView(mList);
//        mList.setMaxWidth(USE_PREF_SIZE);
//        mList.setMaxHeight(USE_PREF_SIZE);
        mList.setStyle("-fx-background-color: #1a9cd0aa; -fx-background-radius: 30px; -fx-prompt-text-fill: #ffffff;-fx-text-fill: #ffffff;-fx-background-size: cover;");
        mList.setTranslateY(100);
        
        mList.setMaxSize(1200, 800);
        mList.setTranslateX(800);

        TableColumn<Label, Cell> tc = new TableColumn<>("Name");
        TableColumn<Label, Cell> tc1 = new TableColumn<>("Mobile");
        TableColumn<Label, Cell> tc2 = new TableColumn<>("Address");
        TableColumn<Label, Cell> tc3 = new TableColumn<>("Email");
        TableColumn<Label, Cell> tc4 = new TableColumn<>("Type");

        tc.setCellValueFactory(new PropertyValueFactory<>("name"));
        tc1.setCellValueFactory(new PropertyValueFactory<>("phone"));
        tc2.setCellValueFactory(new PropertyValueFactory<>("address"));
        tc3.setCellValueFactory(new PropertyValueFactory<>("email"));
        tc4.setCellValueFactory(new PropertyValueFactory<>("type"));

        mList.getColumns().add(tc);
        mList.getColumns().add(tc1);
        mList.getColumns().add(tc2);
        mList.getColumns().add(tc3);
        mList.getColumns().add(tc4);

        mList.getItems().add(new Cell("raed", "r+96171243599", "nahrelBared", "raedabdelal@gmail.com", "type1"));
        mList.getItems().add(new Cell("ahmad", "96171243555", "nahrelBared", "ahmadeieo@gmail.com", "type2"));

    }

    

    public class Cell {

        private VBox b = new VBox();
        private Label name, phone, address, email, type;

        public Cell(String name, String phone, String address, String email, String type) {
            this.name = new Label(name);
            this.phone = new Label(phone);
            this.address = new Label(address);
            this.email = new Label(email);
            this.type = new Label(type);

            setStyle(this.name);
            setStyle(this.phone);
            setStyle(this.address);
            setStyle(this.email);
            setStyle(this.type);

        }

        public Label getName() {
            return name;
        }

        public Label getPhone() {
            return phone;
        }

        public Label getEmail() {
            return email;
        }

        public Label getType() {
            return type;
        }

        public Label getAddress() {
            return address;
        }

        public void setStyle(Label view) {
            // view.setStyle("-fx-background-color: #104b4b4b; -fx-background-size: cover;");
            view.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    Index.openPage(Index.mDoctorHomePage);
                }
            });

            view.setOnMouseEntered(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    view.setStyle("-fx-background-color: #a45954; -fx-background-radius: 30px; -fx-background-size: cover;");
                }
            });
            view.setOnMouseExited(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    view.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 30px;-fx-background-size: cover;");

                }
            });
        }

    }
}
