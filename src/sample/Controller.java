package sample;

        import javafx.fxml.FXML;
        import javafx.fxml.Initializable;
        import javafx.scene.control.Label;
        import javafx.scene.control.Labeled;
        import javafx.scene.control.TextField;

        import java.net.URL;
        import java.util.ResourceBundle;

public class Controller implements Initializable{
    private loginModel loginmodel = new loginModel();
    @FXML
    private Label dbStatus;
    @FXML
    private TextField Username;
    @FXML
    private Passwor


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if(this.loginmodel.isDatabaseConnection()){
            this.dbStatus.setText("Connected to DB");
        }else {
            this.dbStatus.setText("Not Connected to DB");
        }

    }//initialize
}

@FXML
public void Login (Act)