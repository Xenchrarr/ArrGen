package randomArrayCreator;

import javafx.scene.control.Alert;

class GeneralUti {
    private final Alert diag;

    GeneralUti(Alert diag) {
        this.diag = diag;
    }

    void dialogInfo() {
        diag.setTitle("alert title");
        diag.setHeaderText("Lots of headers");
        diag.setContentText("Lorem ipsum dolor sit amet.");
    }

}
