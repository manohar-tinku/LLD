module com.low.level.design.lld {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.low.level.design.lld to javafx.fxml;
    exports com.low.level.design.lld;
}