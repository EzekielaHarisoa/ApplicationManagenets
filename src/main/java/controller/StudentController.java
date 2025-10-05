/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main.java.controller;

import com.jfoenix.controls.JFXButton;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Ezekiela
 */
public class StudentController implements Initializable {

    @FXML
    private JFXButton btnAdd;
    @FXML
    private JFXButton btnFilter;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     FontAwesomeIconView iconAdd=new FontAwesomeIconView( FontAwesomeIcon.PLUS);
     btnAdd.setGraphic(iconAdd);
     FontAwesomeIconView iconFilter=new FontAwesomeIconView( FontAwesomeIcon.FILTER);
     btnFilter.setGraphic(iconFilter);
    }    
    
}
