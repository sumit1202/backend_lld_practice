package design_patterns.builder.builder_v2;

public class Client {
    public static void main(String[] args) {

        // ! v2 - associate 'StudentBuilder' to 'Student'
        StudentBuilder builder = Student.getBuilder();
        builder.setAge(25);
        builder.setFirstname("Sumit");
        builder.setLastname("Kumar");

        Student student = builder.build();
        System.out.println("\nv2: " + student);

    }
}
