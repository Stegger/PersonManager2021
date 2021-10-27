package gui.javafx.studentbrowser;

import gui.javafx.model.StudentBrowserModel;
import gui.javafx.somestudentlist.ListOfStudentsController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StudentBrowserController implements Initializable {

    @FXML
    private ListView lstAllStudents;
    @FXML
    private TextField txtId;
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtEmail;

    private StudentBrowserModel studentBrowserModel;


    public StudentBrowserController() {
        studentBrowserModel = new StudentBrowserModel();

    }

    @FXML
    void handleCreateStudent(ActionEvent event) {

        int id = Integer.parseInt(txtId.getText());
        String name = txtName.getText();
        String email = txtEmail.getText();

        studentBrowserModel.createStudent(id, name, email);

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        lstAllStudents.setItems(studentBrowserModel.getAllStudents());

    }

    public void handleNext(ActionEvent actionEvent) throws IOException {

        Stage stage = new Stage();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/gui/javafx/somestudentlist/ListOfStudentsView.fxml"));
        Parent root = loader.load();

        ListOfStudentsController studentsController = loader.getController();
        studentsController.setStudentBrowserModel(studentBrowserModel);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
