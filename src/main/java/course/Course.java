package course;

public class Course {
    private String name;
    private int numberOfClasses;
    private String codeName;

    public Course() {
        this.name = "";
        this.numberOfClasses = 0;
        this.codeName = "";
    }

    public Course(String name, int numberOfClasses, String codeName) {
        this.name = name;
        this.numberOfClasses = numberOfClasses;
        this.codeName = codeName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }
    
    public void info() {
        System.out.println("Course name: " + getName());
        System.out.println("Course, number of classes: " + getNumberOfClasses());
    }
}
