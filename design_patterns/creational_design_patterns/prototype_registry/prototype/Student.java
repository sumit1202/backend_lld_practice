package design_patterns.creational_design_patterns.prototype_registry.prototype;

public class Student implements Protoype<Student> {
    int id;
    String name;
    String batch;
    double psp;

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

        Student studentCopy = new Student();
        studentCopy.id = this.id;
        studentCopy.name = this.name;
        studentCopy.psp = this.psp;
        studentCopy.batch = this.batch;

        System.out.println("\nCreating Student Copy...");
        return studentCopy;
    }

}
