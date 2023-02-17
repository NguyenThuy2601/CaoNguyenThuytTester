module com.demotester.mavenproject1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.demotester.mavenproject1 to javafx.fxml;
    exports com.demotester.mavenproject1;
}
