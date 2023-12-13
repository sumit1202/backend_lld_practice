package design_patterns.creational_design_patterns.builder.builder_v3;

public class Client {
    public static void main(String[] args) {

        Student student = Student.getBuilder()
                .setFirstname("John")
                .setGradYear("2020")
                .setLastname("Wick")
                .build();

        System.out.println("\nv2: " + student);

        // ? in next version we will restrict call to below constructor.
        // ? Student student2 = new Student(null);

    }
}
