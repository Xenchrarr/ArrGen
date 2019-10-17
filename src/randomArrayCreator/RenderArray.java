package randomArrayCreator;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

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
        int rows = genArray.length/10;
        int cols = genArray.length/10;
        int index = 0;
        arrayGen();
        this.array.getChildren().clear();
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
        int hold = 0;
        int index = 0;
        int row_inA = 0;
        int col_inA = 0;
        this.inArray.getChildren().clear();
        while (index < genArray.length) {
            hold = (int) (Math.random() * 900 ) + 100;
            if (!checkArray(hold, index)) {
                genArray[index] = hold;
                index++;
                continue;
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
}
