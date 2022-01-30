package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.stage.Stage;


import java.io.IOException;

public class Login {
    public Login(){

    }

    @FXML
    private Button button;
    @FXML
    private Label wrongLogin;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    public void userLogin(ActionEvent event) throws IOException{
        checkLogin();
    }

    public void checkLogin() throws IOException{
        Main m = new Main();
        if(username.getText().toString().equals("NOOBMASTER") && password.getText().toString().equals("12345")){
            wrongLogin.setText("Success!");
            Quiz quiz = new Quiz("NOOBMASTER");

        }

        else if(username.getText().isEmpty() && password.getText().isEmpty()){
            wrongLogin.setText("Please enter your data.");
        }

        else {
            wrongLogin.setText("Wrong username or password");
        }
    }


}