package randomArrayCreator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

import java.util.ResourceBundle;

public class Controller {
    @FXML
    public GridPane array, inArray;

    @FXML
    private Button btnGen, btnExport, btnInfo;

    @FXML
    public Label min, max;

    public Alert alert = new Alert(Alert.AlertType.INFORMATION);

    final RenderArray rnd = new RenderArray(100, array, inArray);
    final GeneralUti gnu = new GeneralUti(alert);
    @FXML
    private void startup() {
        rnd.PrintArray();
    }
    @FXML
    private void arrayGen() {
        rnd.PrintArray();
    }

    @FXML
    private void dialog() {
        gnu.dialogInfo();
    }

}
