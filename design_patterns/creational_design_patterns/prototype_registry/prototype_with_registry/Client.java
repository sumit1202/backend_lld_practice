package design_patterns.creational_design_patterns.prototype_registry.prototype_with_registry;

public class Client {

    public static void fillStudentRegistry(StudentRegistry studentRegistry) {
        Student batchAStudents = new Student();
        batchAStudents.setBatch("batchA");
        studentRegistry.register("batchA", batchAStudents);
    }

    public static void main(String[] args) {

        StudentRegistry studentRegistry = new StudentRegistry();
        fillStudentRegistry(studentRegistry);

        // ? StudentRegistry will give you Student copy/clone
        Student student1 = studentRegistry.get("batchA"); // ? get parameter -> student type enum preferred way
        Student student2 = studentRegistry.get("batchA");

        if (student1 == student2) {
            System.out.println("\nStudent copies NOT created.");
        } else {
            System.out.println("\nStudent copies created.");
        }
    }

}
