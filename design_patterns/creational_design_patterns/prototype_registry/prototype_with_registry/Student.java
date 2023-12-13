package design_patterns.creational_design_patterns.prototype_registry.prototype_with_registry;

public class Student implements Protoype<Student> {
    private int id;
    private String name;
    private String batch;
    private double psp;

    public Student() {
    }

    // ? copy constructor for Student
    public Student(Student other) {
        this.id = other.id;
        this.name = other.name;
        this.batch = other.batch;
        this.psp = other.psp;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    @Override
    public Student copy() {
        System.out.println("\nCreating Student Copy...");
        return new Student(this);
    }

}
