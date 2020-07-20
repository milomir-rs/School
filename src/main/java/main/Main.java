package main;

import computer.Computer;
import course.Course;
import student.Student;

public class Main {

    public static void main(String[] args) {
        
        Student studentMarko = new Student();
        studentMarko.info();
        
        Student studentJovan = new Student("Jovan", "Jovanovic", 1990);
        studentJovan.info();
        
        Course courseQA = new Course("QA testing", 40, "qa");
        courseQA.info();
        
        Computer lenovo = new Computer("Linux", 2.4, 8.0, 500);
        lenovo.info();
        
        Student studentMilica = new Student("Milica", "Jovanovic", 1999, courseQA, lenovo);
        studentMilica.info();
        
        studentJovan.setCourse(courseQA);
        studentJovan.info();
    }

}
