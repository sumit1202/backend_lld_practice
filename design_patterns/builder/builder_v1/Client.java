package design_patterns.builder.builder_v1;

public class Client {
    public static void main(String[] args) {
        // ! v1
        StudentBuilder builder = new StudentBuilder();
        builder.setAge(25);
        builder.setFirstname("Sumit");
        builder.setLastname("Kumar");

        Student student = new Student(builder);

        System.out.println("\nv1: " + student);

    }
}
