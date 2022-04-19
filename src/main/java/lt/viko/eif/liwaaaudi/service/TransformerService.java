package lt.viko.eif.liwaaaudi.service;

import lt.viko.eif.liwaaaudi.model.Students;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class TransformerService { // transformation functionality

    private static JAXBContext jaxbContext;

    static {

        try {
            jaxbContext = JAXBContext.newInstance(Students.class);
        } catch (JAXBException e) {
            System.out.println(e.getMessage());
        }
    }

    public Students transformToPojo(String fileName) {  // from XML to objects

        Students students = null;
        try {

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            Path filePath = Path.of(fileName);
            String actual = Files.readString(filePath); // reading xml string from file
            System.out.print(actual);
            StringReader reader = new StringReader(actual);
            students = (Students) unmarshaller.unmarshal(reader);

        } catch (JAXBException | IOException e) {
            System.out.println(e.getMessage());
        }

        return students;
    }

    public String transformToXML(Students students) { // from objects to XML

        StringWriter xmlWriter = new StringWriter();

        try {
            Marshaller marshaller = jaxbContext.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(students, xmlWriter);

            System.out.println(xmlWriter);

        } catch (JAXBException e) {
            System.out.println(e.getMessage());
        }
        return xmlWriter.toString();
    }
}

