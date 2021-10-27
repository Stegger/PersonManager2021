package gui.javafx.studentbrowser;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

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
}
