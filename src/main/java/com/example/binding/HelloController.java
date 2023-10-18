package com.example.binding;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label outputLbl;

    @FXML
    TextField inputTxt;

    @FXML
    Button preBtn;
    @FXML
    Button postBtn;






    Model model = new Model("Hello");

    public void initialize(){
        preBtn.setOnAction(actionEvent ->  model.preStar());
        postBtn.setOnAction(actionEvent ->  model.postStar());





        inputTxt.textProperty().bindBidirectional(model.s);
        outputLbl.textProperty().bindBidirectional(model.s);

    }




}