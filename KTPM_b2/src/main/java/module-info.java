module com.mycompany.ktpm_b2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ktpm_b2 to javafx.fxml;
    exports com.mycompany.ktpm_b2;
}
