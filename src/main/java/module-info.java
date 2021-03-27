module pl.sda {
    requires javafx.controls;
    requires javafx.fxml;

    opens pl.sda to javafx.fxml;
    exports pl.sda;
}