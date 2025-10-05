
package main.java.controller;

import com.jfoenix.controls.JFXButton;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class MainController implements Initializable {

    @FXML
    private AnchorPane sidebar;
    @FXML
    private JFXButton btnHome;
    @FXML
    private JFXButton btnStudent;
    @FXML
    private JFXButton btnHistory;
    @FXML
    private JFXButton btnFacturation;
    @FXML
    private AnchorPane mainContent;
 
    @FXML
    private VBox insidebar;
    @FXML
    private JFXButton btnRevenue;
    @FXML
    private Button btnTest;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         FontAwesomeIconView home=new FontAwesomeIconView(FontAwesomeIcon.HOME);     
         FontAwesomeIconView stud=new FontAwesomeIconView(FontAwesomeIcon.USER);
         FontAwesomeIconView history=new FontAwesomeIconView(FontAwesomeIcon.HISTORY);           
         FontAwesomeIconView revenue=new FontAwesomeIconView(FontAwesomeIcon.MONEY);         
         FontAwesomeIconView facture=new FontAwesomeIconView(FontAwesomeIcon.PRINT);
           
         btnHome.setGraphic(home); 
         btnStudent.setGraphic(stud);
         btnHistory.setGraphic(history);
         btnFacturation.setGraphic(facture);
         btnRevenue.setGraphic(revenue);
    }    

    @FXML
    private void handleHome(ActionEvent event ) throws Exception {
        mainContent.getChildren().clear();
        FXMLLoader loader=new FXMLLoader(getClass().getResource("/main/fxml/home.fxml"));
        Parent root=loader.load();
        mainContent.getChildren().add(root);
    }

    @FXML
    private void handleStudent(ActionEvent event) throws Exception {
        mainContent.getChildren().clear();
        FXMLLoader loader=new FXMLLoader(getClass().getResource("/main/fxml/student.fxml"));
        Parent root=loader.load();
        mainContent.getChildren().add(root);
        
    }

    @FXML
    private void handleHistory(ActionEvent event) throws Exception {
          mainContent.getChildren().clear();
        FXMLLoader loader=new FXMLLoader(getClass().getResource("/main/fxml/historique.fxml"));
        Parent root=loader.load();
        mainContent.getChildren().add(root);
    }

    @FXML
    private void handleFacture(ActionEvent event) throws Exception {
          mainContent.getChildren().clear();
        FXMLLoader loader=new FXMLLoader(getClass().getResource("/main/fxml/facturation.fxml"));
        Parent root=loader.load();
        mainContent.getChildren().add(root);
    }
    
    
   
   
}
