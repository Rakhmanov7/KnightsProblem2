package com.example.knightsproblem2;
import com.example.knightsproblem2.App;

import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.LineTo;

import java.io.IOException;

public class primaryController {
    @FXML
    TextField tfDim;
    @FXML
    TabPane tpTabs;
    @FXML
    private void drawBoard() throws IOException {
        int n = Integer.parseInt(tfDim.getText());
        boolean color = false;
        GridPane board = new GridPane();
        for(int i = 0; i<n ; i++){
            for(int j = 0; j<n; j++){

                Ellipse knight = new Ellipse(5,5);
                LineTo l = new LineTo();
                knight.setFill(Color.RED);

                AnchorPane cell = new AnchorPane ();
                cell.setPrefSize(1000,1000);
                if(color)
                    cell.setStyle("-fx-background-color: white");
                else
                    cell.setStyle("-fx-background-color: black");
                cell.getChildren().add(knight);

                if((n%2 == 0) && (j == 0)) color = !color;
                cell.setStyle("-fx-background-color: white");
                board.add(cell, i, j);
            }
        }

        tpTabs.getTabs().add(new Tab(n + " - Board",board));

        App.setRoot("Secondary");
    }
}
