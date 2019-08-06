
package Csocsorulesgenerator;


import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;

import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;


public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button generateButton;

    @FXML
    private ToggleGroup matchToggleGroup;

    @FXML
    private Label resultLabel1;

    @FXML
    private Label resultLabel2;

    @FXML
    private Label resultLabel3;

    @FXML
    private Label resultLabel4;

    @FXML
    private RadioButton matchOne;

    @FXML
    private RadioButton matchTwo;

    @FXML
    private RadioButton matchThree;

    @FXML
    private RadioButton matchFour;

    String randomGeneralRule1;
    String randomGeneralRule2;
    String randomGeneralRule3;
    String randomGeneralRule4;
    String randomOtherRule1;
    String randomOtherRule2;
    String randomOtherRule3;
    String randomOtherRule4;
 
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        matchToggleGroup();
    }    
    
    
     public void matchToggleGroup() {

            matchToggleGroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
                @Override
                public void changed(ObservableValue<? extends Toggle> observableValue, Toggle toggle, Toggle t1) {
                    
                    
                    generateButton.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {

                        @Override
                        public void handle(javafx.event.ActionEvent event) {
                           
                            if (matchOne.isSelected()){
                                resultLabel1.setText("A mérkőzés(en) " + randomGeneralRule1 + " és " + randomOtherRule1);
                                resultLabel2.setText("");
                                resultLabel3.setText("");
                                resultLabel4.setText("");
                            } else if (matchTwo.isSelected()) {
                                resultLabel1.setText("Az első mérkőzés(en) " + randomGeneralRule1 + " és " + randomOtherRule1);
                                resultLabel2.setText("A második mérkőzés(en) " + randomGeneralRule2 + " és " + randomOtherRule2);
                                resultLabel3.setText("");
                                resultLabel4.setText("");
                            } else if (matchThree.isSelected()) {
                                resultLabel1.setText("Az első mérkőzés(en) " + randomGeneralRule1 + " és " + randomOtherRule1);
                                resultLabel2.setText("A második mérkőzés(en) " + randomGeneralRule2 + " és " + randomOtherRule1);
                                resultLabel3.setText("A harmadik mérkőzés(en) " + randomGeneralRule3 + " és " + randomOtherRule3);
                                resultLabel4.setText("");
                            } else if (matchFour.isSelected()) {
                                resultLabel1.setText("Az első mérkőzés(en) " + randomGeneralRule1 + " és " + randomOtherRule1);
                                resultLabel2.setText("A második mérkőzés(en) " + randomGeneralRule2 + " és " + randomOtherRule2);
                                resultLabel3.setText("A harmadik mérkőzés(en) " + randomGeneralRule3 + " és " + randomOtherRule3);
                                resultLabel4.setText("A negyedik mérkőzés(en) " + randomGeneralRule4 + " és " + randomOtherRule4);
                            }

                            String[] matchgeneral = {
                                    "számít",
                                    "nem számít",
                                    "az első 5 gól számít",
                                    "a második 5 gól számít"
                            };

                            String[] matchOther = {
                                    "középről lőni ér.",
                                    "középről lőni nem ér.",
                                    "az elkapás 0.5-öt ér.",
                                    "az elkapás nem ér.",
                                    "a kosár 0.5-öt ér.",
                                    "a kosár nem ér."
                            };


                            Random random1 = new Random();
                                randomGeneralRule1 = matchgeneral[random1.nextInt(matchgeneral.length)];
                                randomGeneralRule2 = matchgeneral[random1.nextInt(matchgeneral.length)];
                                randomGeneralRule3 = matchgeneral[random1.nextInt(matchgeneral.length)];
                                randomGeneralRule4 = matchgeneral[random1.nextInt(matchgeneral.length)];

                            Random random2 = new Random();
                                randomOtherRule1 = matchOther[random2.nextInt(matchOther.length)];
                                randomOtherRule2 = matchOther[random2.nextInt(matchOther.length)];
                                randomOtherRule3 = matchOther[random2.nextInt(matchOther.length)];
                                randomOtherRule4 = matchOther[random2.nextInt(matchOther.length)];
                        }
                    });
                }
            });            
        }
}
