package design_patterns.builder.builder_v4;

public class Client {
    public static void main(String[] args) {

        Student student = Student.getBuilder()
                .setFirstname("John")
                .setGradYear("2020")
                .setLastname("Wick")
                .build();

        System.out.println("\nv2: " + student);

    }
}
