package lt.viko.eif.liwaaaudi.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlType(propOrder = {"id", "firstName", "lastName", "age", "subjectsList", "gradeList", "classList", "graduationList"})

public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private int age;

    private List<Grade> gradeList = new ArrayList<>();
    private List<Subject> subjectsList = new ArrayList<>();

    private List<Class> classList = new ArrayList<>();

    private List<Graduation> graduationList = new ArrayList<>();

    @Override
    public String toString() {
        return String.format("STUDENT:\n\t\tFirst name: %s\n\t\tLast Name: %s\n\t\tID: %s\n\t\tAge: %s\n\t%s\n\t%s\n\t%s\n\t%s",
                firstName, lastName, id, age, printGrades(), printSubjects(), printClassInfo(), printGraduation());
    }

    private String printGrades() {
        StringBuilder result = new StringBuilder();
        for (Grade grade : getGradeList()) {
            result.append(String.format("%s", grade));
        }
        return result.toString();
    }

    private String printSubjects() {
        StringBuilder result1 = new StringBuilder();
        for (Subject subject : getSubjectsList()) {
            result1.append(String.format("\t\t%s", subject));
        }
        return result1.toString();
    }

    private String printClassInfo() {
        StringBuilder result = new StringBuilder();
        for (Class cl : getClassList()) {
            result.append(String.format("%s", cl));
        }
        return result.toString();
    }

    private String printGraduation() {
        StringBuilder result = new StringBuilder();
        for (Graduation grad : getGraduationList()) {
            result.append(String.format("%s", grad));
        }
        return result.toString();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @XmlElement(name = "grade")
    public List<Grade> getGradeList() {
        return gradeList;
    }

    public void setGradeList(List<Grade> gradeList) {
        this.gradeList = gradeList;
    }

    @XmlElement(name = "subject")
    public List<Subject> getSubjectsList() {
        return subjectsList;
    }

    public void setSubjectsList(List<Subject> subjectsList) {
        this.subjectsList = subjectsList;
    }

    @XmlElement(name = "class")
    public List<Class> getClassList() {
        return classList;
    }

    public void setClassList(List<Class> classList) {
        this.classList = classList;
    }

    @XmlElement(name = "graduation")
    public List<Graduation> getGraduationList() {
        return graduationList;
    }

    public void setGraduationList(List<Graduation> graduationList) {
        this.graduationList = graduationList;
    }
}
