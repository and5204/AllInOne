module com.example.allinoneraund2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.allinoneraund2 to javafx.fxml;
    exports com.example.allinoneraund2;
}