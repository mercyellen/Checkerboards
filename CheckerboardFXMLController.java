/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkerboard;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Mercy Housh (MEHZ76) 
 */
public class CheckerboardFXMLController implements Initializable {
    
    @FXML
    private Stage stage;
    
    private final int numRows = 53;
    private final int numCols = 53;
    
    private double anchorWidth;
    private double anchorHeight;
    
    private final Color[] colors = {Color.RED, Color.BLACK, Color.BLUE};
    
    @FXML
    private AnchorPane anchorPane;
    
    private GridPane grid;
    
    
    @FXML
    private void handle3(ActionEvent event) {
        System.out.println("You clicked me!");
    }
    @FXML
    private void handle8(ActionEvent event) {
        System.out.println("You clicked me!");
    }
    
    @FXML
    private void handle10(ActionEvent event) {
        System.out.println("You clicked me!");
    }
    
    @FXML
    private void handle16(ActionEvent event) {
        System.out.println("You clicked me!");
    }
    
    private void refresh() {
        clearAnchorPane();
        
        anchorWidth = anchorPane.getWidth();
        anchorHeight = anchorPane.getHeight();
        
        //Random rn = new Random();
        
        double rectWidth = Math.ceil(anchorWidth / numCols);
        double rectHeight = Math.ceil(anchorHeight / numRows);
        
         Random rn = new Random();
        
        int numColors = colors.length;
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                Color color = colors[rn.nextInt(numColors)];
                Rectangle rect = new Rectangle(rectWidth, rectHeight, color);
                
                //anchorPane.add(rect, row, col);
            }
        }
    }
    
    private void clearAnchorPane() {
        anchorPane.getChildren().clear();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
