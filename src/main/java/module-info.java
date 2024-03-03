module p.parking {
    requires javafx.controls;
    requires javafx.fxml;


    opens p.parking to javafx.fxml;
    exports p.parking;
}