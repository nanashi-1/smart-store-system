module org.laiza {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.laiza to javafx.fxml;
    exports org.laiza;
}
