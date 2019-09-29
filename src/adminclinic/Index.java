/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminclinic;

import GUI.Root;
import javafx.scene.layout.StackPane;
import pages.DoctorHomePage;
import pages.HomePage;
import pages.PatientsPage;
import pages.RegistrationPage;

/**
 *
 * @author user771
 */
public class Index extends Root{
    
    public static HomePage mHomePage;
    public static DoctorHomePage mDoctorHomePage;
    public static RegistrationPage mRegistrationPage;
    private static Index mIndex;
    public static PatientsPage mPatientsPage;
    
    public Index(){
       mIndex = this;
       mHomePage = new HomePage();
       mDoctorHomePage = new DoctorHomePage();
       mRegistrationPage = new RegistrationPage();
       mPatientsPage = new PatientsPage();
       openPage(mHomePage);

       
       
    }
    
    public static void openPage(StackPane page){
      mIndex.add(page);
        
    }
    
    private void add(StackPane page){
        removeView();
        addView(page); 
      
    }
}
