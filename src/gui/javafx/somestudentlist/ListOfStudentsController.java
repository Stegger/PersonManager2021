package gui.javafx.somestudentlist;

import gui.javafx.model.StudentBrowserModel;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class ListOfStudentsController {

    @FXML
    private ListView lasOfStudents;

    private StudentBrowserModel studentBrowserModel;

    public void setStudentBrowserModel(StudentBrowserModel studentBrowserModel) {
        this.studentBrowserModel = studentBrowserModel;
        lasOfStudents.setItems(studentBrowserModel.getAllStudents());
    }
}
