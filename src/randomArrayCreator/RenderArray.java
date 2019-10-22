package randomArrayCreator;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import org.jetbrains.annotations.Contract;

import java.util.concurrent.TimeUnit;

class RenderArray {
    private final int arrayL;
    private GridPane array;
    private GridPane inArray;
    private int[] genArray;

    RenderArray(int arrayL, GridPane setArray, GridPane existsInArray) {
        this.arrayL = arrayL;
        this.genArray = new int[this.arrayL];
        this.array = setArray;
        this.inArray = existsInArray;
    }
/*
    public String[] PrintArray() {
        int rows = (this.arrayL % 10 == 0) ? this.arrayL/10 : this.arrayL/10 + 1;
        int cols = (this.arrayL % 10 == 0) ? this.arrayL/10 : this.arrayL/10 + 1;
        int index = 0;
        arrayGen();
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                Label l = new Label();
                l.setText(Integer.toString(genArray[index]));
                System.out.println(l);
                return (Integer.toString(genArray[index]), col, row);
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
            hold = (int) (Math.random() * 90000 ) + 10;
            System.out.println(hold);
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

    @Contract(pure = true)
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

    }*/
}
