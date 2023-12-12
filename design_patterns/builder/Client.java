package design_patterns.builder;

public class Client {
    public static void main(String[] args) {
        // ! v1
        // StudentBuilder builder = new StudentBuilder();
        // builder.setAge(25);
        // builder.setFirstname("Sumit");
        // builder.setLastname("Kumar");

        // Student student = new Student(builder);
        // student.setAge(builder.getAge());
        // student.setFirstname(builder.getFirstname());
        // student.setLastname(builder.getLastname());

        // System.out.println("\nv1: " + student);

        
        // ! v2 - associate 'StudentBuilder' to 'Student'
        StudentBuilder builder = Student.getBuilder();
        builder.setAge(25);
        builder.setFirstname("Sumit");
        builder.setLastname("Kumar");

        Student student = builder.build();
        System.out.println("\nv2: " + student);

    }
}
