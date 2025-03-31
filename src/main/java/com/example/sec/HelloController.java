package com.example.sec;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_0;

    @FXML
    private Button btn_1;

    @FXML
    private Button btn_2;

    @FXML
    private Button btn_3;

    @FXML
    private Button btn_4;

    @FXML
    private Button btn_5;

    @FXML
    private Button btn_6;

    @FXML
    private Button btn_7;

    @FXML
    private Button btn_8;

    @FXML
    private Button btn_9;

    @FXML
    private Button btn_del;

    @FXML
    private Button btn_dot;

    @FXML
    private Button btn_equal;

    @FXML
    private Button btn_minus;

    @FXML
    private Button btn_mult;

    @FXML
    private Button btn_perc;

    @FXML
    private Button btn_plus;

    @FXML
    private Button clear_btn;

    @FXML
    private Label label_field;

    @FXML
    private Button plus_minus;

    private String str_num = "";
    private float first_num;
    private char operation;

    @FXML
    void initialize() {
        btn_0.setOnAction(event -> {
            addnumber(0);
        });
        btn_1.setOnAction(event -> {
            addnumber(1);
        });
        btn_2.setOnAction(event -> {
            addnumber(2);
        });
        btn_3.setOnAction(event -> {
            addnumber(3);
        });
        btn_4.setOnAction(event -> {
            addnumber(4);
        });
        btn_5.setOnAction(event -> {
            addnumber(5);
        });
        btn_6.setOnAction(event -> {
            addnumber(6);
        });
        btn_7.setOnAction(event -> {
            addnumber(7);
        });
        btn_8.setOnAction(event -> {
            addnumber(8);
        });
        btn_9.setOnAction(event -> {
            addnumber(9);
        });
        btn_minus.setOnAction(event -> {
            mathAction('-');
        });
        btn_mult.setOnAction(event -> {
            mathAction('*');
        });
        btn_plus.setOnAction(event -> {
            mathAction('+');
        });
        btn_del.setOnAction(event -> {
            mathAction('/');
        });
        btn_equal.setOnAction(event -> {
            if(this.operation == '+' || this.operation == '-' || this.operation == '*' || this.operation == '/') {
                equalMethod();}
        });
        btn_dot.setOnAction(event -> {
            if(!this.str_num.contains(".")) {
                this.str_num += ".";
                label_field.setText(this.str_num);
            }
        });
        btn_perc.setOnAction(event -> {
            if(this.str_num != "") {
                float num = Float.parseFloat(this.str_num) * 0.01f;
                this.str_num = Float.toString(num);
                label_field.setText(this.str_num);
            }
        });
        plus_minus.setOnAction(event -> {
            if(this.str_num != "") {
                float num = Float.parseFloat(this.str_num) * -1;
                this.str_num = Float.toString(num);
                label_field.setText(this.str_num);
            }
        });
        clear_btn.setOnAction(event -> {
            this.str_num = "";
            label_field.setText("0");
            this.first_num = 0;
            this.operation = 'A';
        });

    }

    void equalMethod() {
        float res = 0;
        switch(this.operation) {
            case '+':
                res = this.first_num + Float.parseFloat(this.str_num);
                break;
            case '-':
                res = this.first_num - Float.parseFloat(this.str_num);
                break;
            case '*':
                res = this.first_num * Float.parseFloat(this.str_num);
                break;
            case '/':
                if(Float.parseFloat(this.str_num) != 0){
                    res = this.first_num / Float.parseFloat(this.str_num);}
                else{
                    res = 0;
                break;
            }
        }
        label_field.setText(Float.toString(res));
        this.str_num = "";
        this.first_num = 0;
        this.operation = 'A';
    }

    void mathAction(char operation) {
        this.first_num = Float.parseFloat(this.str_num);
        label_field.setText(String.valueOf(operation));
        this.str_num = "";
        this.operation = operation;
    }

    void addnumber(int number) {
        this.str_num += Integer.toString(number);
        label_field.setText(str_num );


    }

}