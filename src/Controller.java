import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.text.NumberFormat;


public class Controller {

    //Operation
    Operation operation = Operation.sharedOperation();


    @FXML
    private Button uploadButton;
    @FXML
    private Button downloadButton;
    @FXML
    private Button saveButton;
    @FXML
    private Button runButton;
    @FXML
    private Button testDispenseButton;

    @FXML
    private TextArea systemTextArea;

    @FXML
    private TextArea pumpStatusTextArea;

    @FXML
    private TextField tf_dispenseVolume;

    @FXML
    private TextField tf_suckbackVolume;
    @FXML
    private TextField tf_reloadRate;
    @FXML
    private TextField tf_dispenseRate;
    @FXML
    private TextField tf_suckbackRate;
    @FXML
    private TextField tf_extra;
    @FXML
    private TextField tf_recipe;

    @FXML
    private Label errorLabel;


    //images for button
    private ImageView uploadIMV, downloadIMV, saveIMV, runIMV, testIMV;

    @FXML
    void initialize() {
        getAllImageViewsForButtons();
        configureWidthHeightForImageViews();
        configureButtons();

        // set up textfields validation
        tf_dispenseVolume.focusedProperty().addListener((arg0, oldValue, newValue) -> {
            if (!newValue) {
                if (!tf_dispenseVolume.getText().matches("[1-9].?[0-9]?|10|0.[1-9]|[1-9]")) {
                    tf_dispenseVolume.setText("");
                    errorLabel.setText("Dispense Volume must be in range 0.1 ml - 10 ml");
                }
            }
        });

        tf_suckbackVolume.focusedProperty().addListener((arg0, oldVal, newValue) -> {
            if (!newValue) {
                if (!tf_suckbackVolume.getText().matches("1.?[0-9][0-9]?|0.[0-9][2-9]|[1-2]")) {
                    tf_suckbackVolume.setText("");
                    errorLabel.setText("Suckback Volume must be in range 0.02 ml - 2 ml");
                }
            }
        });

        tf_reloadRate.focusedProperty().addListener((arg0, oldVal, newValue) -> {
            if (!newValue) {
                if (!tf_reloadRate.getText().matches("[1-4].?[0-9][0-9]?|0.[5-9]|[1-4]")) {
                    tf_reloadRate.setText("");
                    errorLabel.setText("Reload rate must be in range 0.5 ml - 5 ml");
                }
            }
        });


        tf_dispenseRate.focusedProperty().addListener((arg0, oldVal, newValue) -> {
            if (!newValue) {
                if (!tf_dispenseRate.getText().matches("[0-4].?[0-9][0-9]?|0.[5-9]|[1-5]")) {
                    tf_dispenseRate.setText("");
                    errorLabel.setText("Dispense Rate must be in range 0.5 ml - 5 ml");

                }
            }
        });

        tf_suckbackRate.focusedProperty().addListener((arg0, oldVal, newValue) -> {
            if (!newValue) {
                if (!tf_suckbackRate.getText().matches("1.?[0-9][0-9]?|0.[0-9]|[1-2]")) {
                    tf_suckbackRate.setText("");
                    errorLabel.setText("Suckback Rate must be in range 0.9 ml - 2 ml");

                }
            }
        });

        tf_extra.focusedProperty().addListener((arg0, oldVal, newValue) -> {
            if (!newValue) {
                if (!tf_extra.getText().matches("[1-15].?[0-9][0-9]?|0.[0-9][1-9]|[1-16]")) {
                    tf_extra.setText("");
                    errorLabel.setText("Extra must be in range 0.01 - 16");

                }
            }
        });



        tf_recipe.focusedProperty().addListener((arg0, oldValue, newValue) -> {
            if (!newValue) {
                if (!tf_recipe.getText().matches("[0-9]")) {
                    tf_recipe.setText("");
                    errorLabel.setText("Recipe # must be between 0-9");

                }
            }
        });



    }

    private void configureWidthHeightForImageViews() {
        //upload button
        uploadIMV.setFitWidth(242/2.5);
        uploadIMV.setFitHeight(124/2.5);

        //download button
        downloadIMV.setFitWidth(242 / 2.5);
        downloadIMV.setFitHeight(124 / 2.5);

        //save button
        saveIMV.setFitWidth(242 / 2.5);
        saveIMV.setFitHeight(124 / 2.5);

        //run button
        runIMV.setFitWidth(242 / 2.5);
        runIMV.setFitHeight(124 / 2.5);


        //test dispense
        testIMV.setFitWidth(242 / 2.5);
        testIMV.setFitHeight(124 / 2.5);



    }

    private void configureButtons() {
        uploadButton.setGraphic(uploadIMV);
        uploadButton.setText("");
        uploadButton.setStyle("-fx-background-color: transparent");

        downloadButton.setGraphic(downloadIMV);
        downloadButton.setStyle("-fx-background-color: transparent");
        downloadButton.setText("");

        saveButton.setGraphic(saveIMV);
        saveButton.setStyle("-fx-background-color: transparent");
        saveButton.setText("");

        runButton.setGraphic(runIMV);
        runButton.setStyle("-fx-background-color: transparent");
        runButton.setText("");

        testDispenseButton.setGraphic(testIMV);
        testDispenseButton.setStyle("-fx-background-color: transparent");
        testDispenseButton.setText("");

    }

    private void getAllImageViewsForButtons() {
        uploadIMV = new ImageView(new Image(getClass().getResourceAsStream("Graphics/uploadBtn.png")));
        downloadIMV = new ImageView(new Image(getClass().getResourceAsStream("Graphics/downloadBtn.png")));
        saveIMV = new ImageView(new Image(getClass().getResourceAsStream("Graphics/saveBtn.png")));
        runIMV = new ImageView(new Image(getClass().getResourceAsStream("Graphics/runBtn.png")));
        testIMV = new ImageView(new Image(getClass().getResourceAsStream("Graphics/testDispenseBtn.png")));

    }


    @FXML
    private void uploadButtonClicked(ActionEvent event) {
//        Recipe recipe = operation.uploadRecipe();
        errorLabel.setText("");

    }

    @FXML
    private void downloadButtonClicked(ActionEvent event) {
        Recipe recipe = getInputs();
//        operation.download(recipe);
        errorLabel.setText("");
    }

    @FXML
    private void saveButtonClicked(ActionEvent event) {
        Recipe recipe = getInputs();
        operation.saveRecipe(recipe);
        errorLabel.setText("");
    }

    @FXML
    private void runButtonClicked(ActionEvent event) {
        Recipe recipe = getInputs();
//        operation.run();
        errorLabel.setText("");

    }

    @FXML
    private void testDispenseButtonClicked(ActionEvent event) {
//        operation.testDispense();
        errorLabel.setText("");

    }

    private Recipe getInputs() {
        //Get values from text fields
        try {
            int dispenseVolValue = Integer.parseInt(tf_dispenseVolume.getText());
            int suckBackVolValue = Integer.parseInt(tf_suckbackVolume.getText());
            int reloadRateValue = Integer.parseInt(tf_reloadRate.getText());
            int dispenseRateValue = Integer.parseInt(tf_dispenseRate.getText());
            int suckbackRateValue = Integer.parseInt(tf_suckbackRate.getText());
            int extraValue = Integer.parseInt(tf_extra.getText());
            int recipeNumber = Integer.parseInt(tf_recipe.getText());


            Recipe recipe = new Recipe(recipeNumber, dispenseVolValue, dispenseRateValue, suckBackVolValue, suckbackRateValue, extraValue, reloadRateValue);

            // print out values
            System.out.println(dispenseVolValue);
            System.out.println(suckbackRateValue);
            System.out.println(reloadRateValue);
            System.out.println(dispenseRateValue);
            System.out.println(suckbackRateValue);
            System.out.println(extraValue);

            return recipe;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return null;
        }
    }


    private void showSystemMessage() {
        String message = operation.getSystemMessage();
        if (message != null || !message.isEmpty()) {
            systemTextArea.setText(message);
        }
    }

    private void showPumpStatusMessage() {
        String message = operation.getPumpStatusMessage();
        if (message != null || !message.isEmpty()) {
            pumpStatusTextArea.setText(message);
        }
    }


}
