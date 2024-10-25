module br.com.ordepsomar.relogiodigital {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.com.ordepsomar.relogiodigital to javafx.fxml;
    exports br.com.ordepsomar.relogiodigital;
}