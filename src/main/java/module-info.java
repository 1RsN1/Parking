module p.parking {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    opens p.parking to javafx.fxml;
    exports p.parking;
}