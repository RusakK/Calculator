package controllers;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;

public class MainController {

    @FXML
    private TextField textfieldResult;
    @FXML
    private Button numberOne;
    @FXML
    private Button numberTwo;
    @FXML
    private Button numberThree;
    @FXML
    private Button numberFour;
    @FXML
    private Button numberFive;
    @FXML
    private Button numberSix;
    @FXML
    private Button numberSeven;
    @FXML
    private Button numberEight;
    @FXML
    private Button numberNine;
    @FXML
    private Button numberZero;
    @FXML
    private Button buttonEqual;
    @FXML
    private Button buttonAdd;
    @FXML
    private Button buttonSubstract;
    @FXML
    private Button buttonMultiply;
    @FXML
    private Button buttonDivide;
    @FXML
    private Button buttonClean;
    @FXML
    private Button buttonDelete;
    @FXML
    private Button buttonDot;



    private int liczba1;
    private int liczba2;

    public void initialize(){

        numberOne.setOnAction(event -> textfieldResult.setText(String.valueOf(1)));
        numberTwo.setOnAction(event -> textfieldResult.setText(String.valueOf(2)));
        numberThree.setOnAction(event -> textfieldResult.setText(String.valueOf(3)));
        numberFour.setOnAction(event -> textfieldResult.setText(String.valueOf(4)));
        numberFive.setOnAction(event -> textfieldResult.setText(String.valueOf(5)));
        numberSix.setOnAction(event -> textfieldResult.setText(String.valueOf(6)));
        numberSeven.setOnAction(event -> textfieldResult.setText(String.valueOf(7)));
        numberEight.setOnAction(event -> textfieldResult.setText(String.valueOf(8)));
        numberNine.setOnAction(event -> textfieldResult.setText(String.valueOf(9)));
        numberZero.setOnAction(event -> textfieldResult.setText(String.valueOf(0)));



        buttonAdd.setOnAction(event -> {
            liczba1 = Integer.valueOf(textfieldResult.getText());
            textfieldResult.clear();
        });


        buttonEqual.setOnAction(event -> {
            liczba2 = Integer.valueOf(textfieldResult.getText());

            textfieldResult.setText(showResult(liczba1, liczba2));
        });

    }

    private String showResult(int liczba1, int liczba2) {

        return null;
    }
}

