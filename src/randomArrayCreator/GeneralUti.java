package randomArrayCreator;

import javafx.scene.control.Alert;

class GeneralUti {
    private final Alert diag;

    GeneralUti(Alert diag) {
        this.diag = diag;
    }

    void dialogInfo() {
        diag.setTitle("alert title");
        diag.setHeaderText("Made by Tor Kristian Dahle");
        diag.setContentText("This piece of software is GPLv3 compliant, please do follow the license.");
        diag.show();
    }

}
