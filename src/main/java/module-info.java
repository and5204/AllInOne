module com.example.allinoneraund2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires org.junit.jupiter.api;
    requires org.testng;

    opens com.example.allinoneraund2 to javafx.fxml;
    exports com.example.allinoneraund2;
}