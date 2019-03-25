package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller {
    public Label ispis;
    public TextField unos;

    public void prepravi(ActionEvent actionEvent) {
        String str = unos.getText(), najduza = "", rezultat = "";
        for(String rijec: str.split(" ")) {
            if(rijec.length() > najduza.length()) najduza = rijec;
        }
        for(int i=0; i<najduza.length(); i++) {

            if(Character.isLowerCase(najduza.charAt(i))) rezultat += Character.toUpperCase(najduza.charAt(i));
        }
        ispis.setText(rezultat);
    }
}
