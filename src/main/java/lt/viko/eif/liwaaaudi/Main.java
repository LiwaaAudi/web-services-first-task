package lt.viko.eif.liwaaaudi;

import lt.viko.eif.liwaaaudi.model.Students;
import lt.viko.eif.liwaaaudi.service.TransformerService;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws JAXBException,  IOException{

        TransformerService transformerService = new TransformerService();

        Students students = transformerService.transformToPojo("student.xml");

        System.out.println(students); // performing transformation to object and outputting result

        Scanner scanner = new Scanner(System.in);

        System.out.println("Press 1 to change student 3 name: ");

        String choice = scanner.nextLine();

        if ("1".equals(choice)) {
            students.getStudentList().get(2).setFirstName("Changed Name");
        }
        System.out.println();
        transformerService.transformToXML(students); // performing transformation to XML and outputting result
    }
}
