package sample;

import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;


public class Controller {

    private String mark = "X";
    private int playerNum = 1;
    private int moves=0;

    public void initialize(){
        displayText.setText("Player " + playerNum + " turn - " + mark );
    }

    @FXML
    private Text displayText;
    @FXML
    private Text pos1;
    @FXML
    private Text pos2;
    @FXML
    private Text pos3;
    @FXML
    private Text pos4;
    @FXML
    private Text pos5;
    @FXML
    private Text pos6;
    @FXML
    private Text pos7;
    @FXML
    private Text pos8;
    @FXML
    private Text pos9;


    public void move1(){

        if(winCheck(mark)) return;

        if(pos1.getText().equals("")) {
            pos1.setText(mark);
            moves++;

            if (winCheck(mark)) {
                displayText.setText("Player " + playerNum + " wins!");
            }else if(moves==9) {
                displayText.setText("DRAW!!!");
            }else {

                mark = (mark.equals("X")) ? "O" : "X";

                playerNum = (playerNum == 1) ? 2 : 1;

                displayText.setText("Player " + playerNum + " turn - " + mark);

            }

        }

    }

    public void move2(){

        if(winCheck(mark)) return;

        if(pos2.getText().equals("")) {
            pos2.setText(mark);
            moves++;

            if (winCheck(mark)) {
                displayText.setText("Player " + playerNum + " wins!");
            }else if(moves==9) {
                displayText.setText("DRAW!!!");
            }else {

                mark = (mark.equals("X")) ? "O" : "X";

                playerNum = (playerNum == 1) ? 2 : 1;

                displayText.setText("Player " + playerNum + " turn - " + mark);

            }

        }

    }

    public void move3(){

        if(winCheck(mark)) return;

        if(pos3.getText().equals("")) {
            pos3.setText(mark);
            moves++;

            if (winCheck(mark)) {
                displayText.setText("Player " + playerNum + " wins!");
            }else if(moves==9) {
                displayText.setText("DRAW!!!");
            }else {

                mark = (mark.equals("X")) ? "O" : "X";

                playerNum = (playerNum == 1) ? 2 : 1;

                displayText.setText("Player " + playerNum + " turn - " + mark);

            }

        }

    }

    public void move4(){

        if(winCheck(mark)) return;

        if(pos4.getText().equals("")) {
            pos4.setText(mark);
            moves++;

            if (winCheck(mark)) {
                displayText.setText("Player " + playerNum + " wins!");
            }else if(moves==9) {
                displayText.setText("DRAW!!!");
            }else {

                mark = (mark.equals("X")) ? "O" : "X";

                playerNum = (playerNum == 1) ? 2 : 1;

                displayText.setText("Player " + playerNum + " turn - " + mark);

            }

        }
        
    }

    public void move5(){

        if(winCheck(mark)) return;

        if(pos5.getText().equals("")) {
            pos5.setText(mark);
            moves++;

            if (winCheck(mark)) {
                displayText.setText("Player " + playerNum + " wins!");
            }else if(moves==9) {
                displayText.setText("DRAW!!!");
            }else {

                mark = (mark.equals("X")) ? "O" : "X";

                playerNum = (playerNum == 1) ? 2 : 1;

                displayText.setText("Player " + playerNum + " turn - " + mark);

            }

        }
        
    }

    public void move6(){

        if(winCheck(mark)) return;

        if(pos6.getText().equals("")) {
            pos6.setText(mark);
            moves++;

            if (winCheck(mark)) {
                displayText.setText("Player " + playerNum + " wins!");
            }else if(moves==9) {
                displayText.setText("DRAW!!!");
            }else {

                mark = (mark.equals("X")) ? "O" : "X";

                playerNum = (playerNum == 1) ? 2 : 1;

                displayText.setText("Player " + playerNum + " turn - " + mark);

            }

        }
        
    }

    public void move7(){

        if(winCheck(mark)) return;

        if(pos7.getText().equals("")) {
            pos7.setText(mark);
            moves++;

            if (winCheck(mark)) {
                displayText.setText("Player " + playerNum + " wins!");
            }else if(moves==9) {
                displayText.setText("DRAW!!!");
            }else {

                mark = (mark.equals("X")) ? "O" : "X";

                playerNum = (playerNum == 1) ? 2 : 1;

                displayText.setText("Player " + playerNum + " turn - " + mark);

            }

        }
        
    }

    public void move8(){

        if(winCheck(mark)) return;

        if(pos8.getText().equals("")) {
            pos8.setText(mark);
            moves++;

            if (winCheck(mark)) {
                displayText.setText("Player " + playerNum + " wins!");
            }else if(moves==9) {
                displayText.setText("DRAW!!!");
            }else {

                mark = (mark.equals("X")) ? "O" : "X";

                playerNum = (playerNum == 1) ? 2 : 1;

                displayText.setText("Player " + playerNum + " turn - " + mark);

            }

        }
        
    }

    public void move9(){

        if(winCheck(mark)) return;

        if(pos9.getText().equals("")) {
            pos9.setText(mark);
            moves++;

            if (winCheck(mark)) {
                displayText.setText("Player " + playerNum + " wins!");
            }else if(moves==9) {
                displayText.setText("DRAW!!!");
            }else {

                mark = (mark.equals("X")) ? "O" : "X";

                playerNum = (playerNum == 1) ? 2 : 1;

                displayText.setText("Player " + playerNum + " turn - " + mark);

            }

        }
        
    }

    private boolean winCheck(String mark){
        if( (pos1.getText().equals(pos2.getText())) && (pos2.getText().equals(pos3.getText())) && (pos3.getText().equals(mark)) ){
            pos1.setFill(Color.DARKCYAN);
            pos2.setFill(Color.DARKCYAN);
            pos3.setFill(Color.DARKCYAN);
            return true;
        }else if( (pos4.getText().equals(pos5.getText())) && (pos5.getText().equals(pos6.getText())) && (pos6.getText().equals(mark)) ){
            pos4.setFill(Color.DARKCYAN);
            pos5.setFill(Color.DARKCYAN);
            pos6.setFill(Color.DARKCYAN);
            return true;
        }else if( (pos7.getText().equals(pos8.getText())) && (pos8.getText().equals(pos9.getText())) && (pos9.getText().equals(mark)) ){
            pos7.setFill(Color.DARKCYAN);
            pos8.setFill(Color.DARKCYAN);
            pos9.setFill(Color.DARKCYAN);
            return true;
        }else if( (pos1.getText().equals(pos4.getText())) && (pos4.getText().equals(pos7.getText())) && (pos7.getText().equals(mark)) ){
            pos1.setFill(Color.DARKCYAN);
            pos4.setFill(Color.DARKCYAN);
            pos7.setFill(Color.DARKCYAN);
            return true;
        }else if( (pos2.getText().equals(pos5.getText())) && (pos5.getText().equals(pos8.getText())) && (pos8.getText().equals(mark)) ){
            pos2.setFill(Color.DARKCYAN);
            pos5.setFill(Color.DARKCYAN);
            pos8.setFill(Color.DARKCYAN);
            return true;
        }else if( (pos3.getText().equals(pos6.getText())) && (pos6.getText().equals(pos9.getText())) && (pos9.getText().equals(mark)) ){
            pos3.setFill(Color.DARKCYAN);
            pos6.setFill(Color.DARKCYAN);
            pos9.setFill(Color.DARKCYAN);
            return true;
        }else if( (pos1.getText().equals(pos5.getText())) && (pos5.getText().equals(pos9.getText())) && (pos9.getText().equals(mark)) ){
            pos1.setFill(Color.DARKCYAN);
            pos5.setFill(Color.DARKCYAN);
            pos9.setFill(Color.DARKCYAN);
            return true;
        }else if( (pos3.getText().equals(pos5.getText())) && (pos5.getText().equals(pos7.getText())) && (pos7.getText().equals(mark)) ){
            pos3.setFill(Color.DARKCYAN);
            pos5.setFill(Color.DARKCYAN);
            pos7.setFill(Color.DARKCYAN);
            return true;
        }
        return false;
    }

}
