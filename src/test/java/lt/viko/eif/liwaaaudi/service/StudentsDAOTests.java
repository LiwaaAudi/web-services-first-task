package lt.viko.eif.liwaaaudi.service;

import lt.viko.eif.liwaaaudi.model.Students;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentsDAOTests {
    private StudentsDAO studentsDAO;

    @BeforeEach
    public void setUp() {
        studentsDAO = new StudentsDAO();
    }
    @Test
    void testStudentsData() {
        Students students = studentsDAO.fetchStudentsData();
        assertNotNull(students);

        assertEquals( 3 , students.getStudentList().size(), "Students List should have 3 students");
        assertEquals( "Student 1" , students.getStudentList().get(0).getFirstName(), "First student should be Student 1");
        assertEquals( "Stud 2" , students.getStudentList().get(1).getLastName(), "Second student should be Stud 2");
        assertEquals( 22 , students.getStudentList().get(2).getAge(), "Third student should be 22 years old");

        assertNotNull(students.getStudentList().get(0).getSubjectsList().get(0).getSubjectName(), "Subject name should not be null");
        assertEquals( "Maths" , students.getStudentList().get(2).getSubjectsList().get(0).getSubjectName(), "Subject name should be Math");

        assertEquals(2022, students.getStudentList().get(0).getGraduationList().get(0).getGradYear(), "Graduation year should be 2022");
        assertEquals("2 years", students.getStudentList().get(0).getGraduationList().get(0).getCourseDuration(), "Course duration should be 2 years");
    }
}
