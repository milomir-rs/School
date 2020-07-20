package student;

import computer.Computer;
import course.Course;

public class Student {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    
    private Course course;
    private Computer computer;

    public Student() {
        this.firstName = "";
        this.lastName = "";
        this.yearOfBirth = 0;
        this.course = new Course();
        this.computer = new Computer();
    }


    public Student(String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
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

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
    
    public void info() {
        System.out.println("First name: " + getFirstName());
        System.out.println("Last name: " + getLastName());
        System.out.println("Year of birth: " + getYearOfBirth());
        
        System.out.println("Computer, hard drive: " + getComputer().getHardDrive());
        System.out.println("Computer, memeory: " + getComputer().getMemory());
        System.out.println("Computer, process tact: " + getComputer().getProcessTact());
        
        System.out.println("Course, name: " + getCourse().getName());
        System.out.println("Course, number of classes: " + getCourse().getNumberOfClasses());
        
    }
    
}
