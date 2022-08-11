module com.example.contactfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens com.example.contactfx to javafx.fxml;
    opens com.example.contactfx.datamodel ;
    exports com.example.contactfx;
}