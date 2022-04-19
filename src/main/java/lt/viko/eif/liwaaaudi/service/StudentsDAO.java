package lt.viko.eif.liwaaaudi.service;


import lt.viko.eif.liwaaaudi.model.*;
import lt.viko.eif.liwaaaudi.model.Class;

public class StudentsDAO {

    public Students fetchStudentsData () {

        Student one = new Student();
        Student two = new Student();
        Student three = new Student();

        Students students = new Students();

        Subject english = new Subject();
        Subject oop = new Subject();
        Subject math = new Subject();

        Grade five = new Grade();
        Grade ten = new Grade();
        Grade twenty = new Grade();

        Class software = new Class();
        Class business = new Class();
        Class maths = new Class();

        Graduation first = new Graduation();
        Graduation second = new Graduation();
        Graduation third = new Graduation();

        english.setSubjectName("English");
        english.setCredits(3);
        english.setMark(5);
        english.setFullMark(10);

        oop.setSubjectName("OOP");
        oop.setCredits(6);
        oop.setMark(20);
        oop.setFullMark(20);

        math.setSubjectName("Maths");
        math.setCredits(6);
        math.setMark(15);
        math.setFullMark(20);

        one.setFirstName("Student 1");
        one.setLastName("Stud 1");
        one.setId(1);
        one.setAge(17);

        two.setFirstName("Student 2");
        two.setLastName("Stud 2");
        two.setId(2);
        two.setAge(20);

        three.setFirstName("Student 3");
        three.setLastName("Stud 3");
        three.setId(3);
        three.setAge(22);

        five.setFinalGrade(3);
        five.setMaxGrade(5);

        ten.setFinalGrade(8);
        ten.setMaxGrade(10);

        twenty.setFinalGrade(15);
        twenty.setMaxGrade(20);

        software.setClassId(222316851);
        software.setMainClassRoom(220);

        business.setClassId(222316852);
        business.setMainClassRoom(421);

        maths.setClassId(222316853);
        maths.setMainClassRoom(621);

        first.setGradYear(2022);
        first.setCourseDuration("2 years");

        second.setGradYear(2023);
        second.setCourseDuration("3.5 years");

        third.setGradYear(2024);
        third.setCourseDuration("4 years");

        one.getSubjectsList().add(english);
        two.getSubjectsList().add(oop);
        two.getSubjectsList().add(math);
        three.getSubjectsList().add(math);

        one.getGradeList().add(five);
        two.getGradeList().add(twenty);
        three.getGradeList().add(ten);

        one.getClassList().add(business);
        two.getClassList().add(software);
        three.getClassList().add(maths);

        one.getGraduationList().add(first);
        two.getGraduationList().add(second);
        three.getGraduationList().add(third);

        students.getStudentList().add(one);
        students.getStudentList().add(two);
        students.getStudentList().add(three);

        return students;
    }
}

