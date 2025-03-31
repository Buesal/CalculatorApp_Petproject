module com.example.sec {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sec to javafx.fxml;
    exports com.example.sec;
}