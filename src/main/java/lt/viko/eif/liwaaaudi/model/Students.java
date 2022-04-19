package lt.viko.eif.liwaaaudi.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Students {

    private List<Student> studentList = new ArrayList<>();

    public List<Student> getStudentList() {

        return studentList;
    }

    @XmlElement(name = "student")
    public void setStudentList(List<Student> studentList) {

        this.studentList = studentList;
    }

    @Override
    public String toString() {
        //return String.format("STUDENTS: \n\n %s", printStudents());
        return String.format(printStudents());
    }

    private String printStudents() {
        StringBuilder result = new StringBuilder();
        for (Student stud : getStudentList()) {
            result.append(stud);
        }
        return result.toString();
    }
}
