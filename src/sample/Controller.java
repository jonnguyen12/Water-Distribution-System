package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Controller {
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
    private TextArea pumpStatusTextArea;

    //images for button
    private ImageView uploadIMV, downloadIMV, saveIMV, runIMV, testIMV;

    @FXML
    void initialize() {
        getAllImageViewsForButtons();
        configureWidthHeightForImageViews();
        configureButtons();
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

    }

    @FXML
    private void downloadButtonClicked(ActionEvent event) {

    }

    @FXML
    private void saveButtonClicked(ActionEvent event) {

    }

    @FXML
    private void runButtonClicked(ActionEvent event) {

    }

    @FXML
    private void testDispenseButtonClicked(ActionEvent event) {

    }
}
