package com.example.snakeandladder;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.util.Random;

public class PlayAreaController {
    @FXML
    Text number;
    @FXML
     Text ChangeTurn ;

    int turn=1;
    @FXML
    public void roll(MouseEvent event){
        System.out.println("Dice is Rolling");
        Random random =new Random();
        int rolling=random.nextInt(6)+1;
        number.setText(""+rolling);
        System.out.println(rolling);
        if(rolling!=6) {
            if (turn == 1) {
                turn = 2;
                ChangeTurn.setText("Player 2's turn");
            } else {
                turn = 1;
                ChangeTurn.setText("Player 1's turn");
            }
        }
    }

}
