/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Views;

import GUI.Root;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

/**
 *
 * @author user771
 */
public class TabBar extends Root{
    
    Label mTitle;
    
    
    public TabBar(){
        setBackgroundColor("#101010");
        
        mTitle = new Label("Title");
        setFont(Font.getDefault().toString(), 40);
        addView(mTitle);
        mTitle.setAlignment(Pos.CENTER);
        setAlignment(Pos.CENTER);
        setTextColor("#ffffff");
        
        setMaxHeight(100);
        
        
    }
    
        public TabBar(String title){
        setBackgroundColor("#101010");
        
        mTitle = new Label("Title");
        setFont(Font.getDefault().toString(), 40);
        addView(mTitle);
        mTitle.setAlignment(Pos.CENTER);
        setAlignment(Pos.CENTER);
        setTextColor("#ffffff");
        
        setMaxHeight(100);
        
            setTitle(title);
        
        
    }
    
    public void setFont(String font, int size){
       
       mTitle.setFont(new Font(font, size));
   
    }
    
    public void setTitle(String title){
        mTitle.setText(title);
    }
    
    public void setTextColor(String color){
           mTitle.setStyle("-fx-text-fill: "+color+";");     
    }
}
