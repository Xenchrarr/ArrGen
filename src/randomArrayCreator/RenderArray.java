package randomArrayCreator;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.util.concurrent.TimeUnit;

class RenderArray {
    private final int arrayL;
    private final GridPane array;
    private final GridPane inArray;
    private int[] genArray;

    RenderArray(int arrayL, GridPane setArray, GridPane inArray) {
        this.arrayL = arrayL;
        this.genArray = new int[this.arrayL];
        this.array = setArray;
        this.inArray = inArray;
    }

    void PrintArray() {
        int rows = (this.arrayL % 10 == 0) ? this.arrayL/10 : this.arrayL/10 + 1;
        int cols = (this.arrayL % 10 == 0) ? this.arrayL/10 : this.arrayL/10 + 1;
        int index = 0;
        arrayGen();
        if (this.array.getChildren() != null) {
            this.array.getChildren().clear();
        }
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                Label l = new Label();
                l.setText(Integer.toString(genArray[index]));
                this.array.add(l, col, row);
                index++;
            }
        }
    }

    private void arrayGen() {
        int hold;
        int index = 0;
        int row_inA = 0;
        int col_inA = 0;
        while (index < genArray.length) {
            hold = (int) (Math.random() * 900 ) + 100;
            if (!checkArray(hold, index)) {
                genArray[index] = hold;
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
            if (hold == genArray[index]) {
                return true;
            }
            index++;
        }
        return false;
    }

    private void max() {
        int hold = this.genArray[0];
        for (int i = 1; i < this.genArray.length; i++) {
            if (this.genArray[i] > hold) {
                hold = this.genArray[i];
            }
        }
        Label maxLabel = new Label();

    }

    private void min() {
        int hold = this.genArray[0];
        for (int i = 1; i < this.genArray.length; i++) {
            if (this.genArray[i] < hold) {
                hold = this.genArray[i];
            }
        }
        Label minLabel = new Label();
    }
}
