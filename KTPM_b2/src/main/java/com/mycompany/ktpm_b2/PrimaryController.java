package com.mycompany.ktpm_b2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;


public class PrimaryController {

    @FXML private TextField txtCanNang;
    @FXML private TextField txtChieuCao;
    @FXML private Label lblResult;
    public void tinhBMI(ActionEvent evt)
    {
       double kg = Double.parseDouble(this.txtCanNang.getText());
       double cm = Double.parseDouble(this.txtChieuCao.getText());
       double bmi = kg / Math.pow(cm, 2);
       String result;
       if(bmi < 18.5)
           {
               result = "gầy";
               this.lblResult.setTextFill(Color.RED);
           }
       else
           if(bmi < 25)
           {
               result = "bình thường";
               this.lblResult.setTextFill(Color.GREEN);
           }
           else
           {
               result = "béo phì";
               this.lblResult.setTextFill(Color.ORANGE);
           }
       this.lblResult.setText(result);
    }
}
