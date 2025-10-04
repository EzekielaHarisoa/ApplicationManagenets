
package main.java.controller;

import com.jfoenix.controls.JFXButton;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;


public class HomeController implements Initializable {

    @FXML
    private JFXButton btnNonp;
    @FXML
    private JFXButton btnBenefice;
    @FXML
    private JFXButton btnVis;
    @FXML
    private BarChart<String, Number> chart;
     @FXML
    private NumberAxis yAxis;
    @FXML
    private CategoryAxis xAxis;
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
          FontAwesomeIconView nonPayer=new FontAwesomeIconView(FontAwesomeIcon.LINE_CHART);
          btnNonp.setGraphic(nonPayer);
          FontAwesomeIconView benefice=new FontAwesomeIconView(FontAwesomeIcon.USD);
          btnBenefice.setGraphic(benefice);
          FontAwesomeIconView vis=new FontAwesomeIconView(FontAwesomeIcon.EYE);
          btnVis.setGraphic(vis);
          
          //barchart code 
          XYChart.Series<String,Number> series_01=new XYChart.Series();
          series_01.getData().add(new XYChart.Data("Jan",200));
          series_01.getData().add(new XYChart.Data("feb",100));
          series_01.getData().add(new XYChart.Data("Mar",100));
          series_01.getData().add(new XYChart.Data("Avr",800));
          series_01.getData().add(new XYChart.Data("May",100));
          series_01.getData().add(new XYChart.Data("Jun",500));
          series_01.getData().add(new XYChart.Data("Jul",100));
          series_01.getData().add(new XYChart.Data("Aug",1000));
          series_01.getData().add(new XYChart.Data("Sep",800));
          series_01.getData().add(new XYChart.Data("Oct",100));
          series_01.getData().add(new XYChart.Data("Nov",0));
          series_01.getData().add(new XYChart.Data("Dec",0));

          chart.getData().add(series_01);
          
          
    }    
    
}
