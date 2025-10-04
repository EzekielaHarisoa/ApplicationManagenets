
package main.java.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXHamburger;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

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
    private JFXHamburger btnBurgeur;
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
    
    @FXML
    private void handleBurgeur(MouseEvent event) {
        boolean[] isOpen = {true};
        Timeline timeline = new Timeline();
        if (isOpen[0]=true) {
            timeline.getKeyFrames().add(new KeyFrame(Duration.millis(300), new KeyValue(insidebar.prefWidthProperty(), 50)));
            btnHome.setText("");
            btnStudent.setText("");
            btnHistory.setText("");
            btnFacturation.setText("");
            System.out.println("je fonctionne bitn");
            isOpen[0] = false;

        }else if(isOpen[0]=false){
            timeline.getKeyFrames().add(new KeyFrame(Duration.millis(300),new KeyValue(insidebar.prefHeightProperty(),125)));
            btnHome.setText("Dashboard");
            btnStudent.setText("Student");
            btnHistory.setText("Historique");
            btnFacturation.setText("Facturaction");
            isOpen[0]=true;           
            System.out.println("je fonctionne aussi");
            
        }
        timeline.play();
    }
   
   
}
