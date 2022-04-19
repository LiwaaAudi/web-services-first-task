package lt.viko.eif.liwaaaudi.service;

import lt.viko.eif.liwaaaudi.model.Students;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TransformerServiceTest {
    private TransformerService transformerService;

    private StudentsDAO studentsDAO;

    @BeforeEach
    void setUp() {
        transformerService = new TransformerService();

    }

    @Test
    void transformToPojoTest() {

        Students students = transformerService.transformToPojo("student.xml");

        assertNotNull(students);

        assertEquals(3, students.getStudentList().size());

        assertEquals("Student 1", students.getStudentList().get(0).getFirstName(), "First name is not correct");
        assertEquals("Stud 2", students.getStudentList().get(1).getLastName() , "Last name is not correct");
        assertEquals("Stud 3", students.getStudentList().get(2).getLastName() , "Last name is not correct");

        assertEquals(22, students.getStudentList().get(2).getAge(), "Age is not correct");
        assertEquals(2022, students.getStudentList().get(1).getGraduationList().get(0).getGradYear(), "Year is not correct");
    }

    @Test
    void transformToXMLTest() {

        studentsDAO = new StudentsDAO();

        String studentsXML = transformerService.transformToXML(studentsDAO.fetchStudentsData());

        assertNotNull(studentsXML);

        assertTrue(studentsXML.contains("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>"));

        assertTrue(studentsXML.contains("<student>"));
    }
}
