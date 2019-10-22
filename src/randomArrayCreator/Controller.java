package randomArrayCreator;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    public GridPane array;

    @FXML
    public GridPane inArray;

    @FXML
    private Label min;

    @FXML
    private Label average;

    @FXML
    private Label max;

    private Alert alert;
    private RenderArray rnd;
    private GeneralUti gnu;
    private int[] arr;

    public Controller() {
        alert = new Alert(Alert.AlertType.INFORMATION);
        gnu = new GeneralUti(alert);
        this.arr = new int[100];
    }

    @FXML
    private void arrayPrint() {
        this.inArray.getChildren().clear();
        arrayGen();
        this.array.getChildren().clear();
        this.min.setText(min());
        this.max.setText(max());
        this.average.setText(average());
        int i = 0;
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                this.array.add(new Label(Integer.toString(this.arr[i])), col, row);
                i++;
            }
        }
    }
    @FXML
    private void arrayGen() {
        int hold;
        int index = 0;
        int row_inA = 0;
        int col_inA = 0;
        this.inArray.gridLinesVisibleProperty();
        while (index < this.arr.length) {
            hold = (int) (Math.random() * 900) + 100;
            System.out.println(hold);
            if (!checkArray(hold, index)) {
                arr[index] = hold;
                index++;
            } else {
                if (row_inA == 5) {
                    col_inA++;
                    row_inA = 0;
                }
                Label l = new Label();
                l.setText(Integer.toString(hold));
                this.inArray.add(l, col_inA, row_inA);
                row_inA++;
            }
        }
    }

    private boolean checkArray(int hold, int arrayIndex) {
        int index = 0;
        while (index <= arrayIndex) {
            if (hold == this.arr[index]) {
                return true;
            }
            index++;
        }
        return false;
    }

    private String max() {
        int hold = this.arr[0];
        for (int i = 1; i < this.arr.length; i++) {
            if (this.arr[i] > hold) {
                hold = this.arr[i];
            }
        }
        return Integer.toString(hold);
    }

    private String min() {
        int hold = this.arr[0];
        for (int i = 1; i < this.arr.length; i++) {
            if (this.arr[i] < hold) {
                hold = this.arr[i];
            }
        }
        return Integer.toString(hold);
    }

    private String average() {
        double hold = 0;
        for (int value : this.arr) {
            hold += value;
        }

        return Double.toString(hold/this.arr.length);
    }

    @FXML
    private void dialog() {
        gnu.dialogInfo();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println(this.array);
        System.out.println(this.inArray);
    }
}
