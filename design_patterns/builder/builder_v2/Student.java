package design_patterns.builder.builder_v2;

public class Student {
    private String firstname;
    private String lastname;
    private int age;
    private String gradYear;
    // ? ......snd so on say long list of attributes

    public static StudentBuilder getBuilder() {
        return new StudentBuilder();
    }

    Student(StudentBuilder builder) {

        //? if validatiions pass then execute below, else throw exceptions
        this.firstname = builder.getFirstname();
        this.lastname = builder.getLastname();
        this.age = builder.getAge();
        this.gradYear = builder.getGradYear();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGradYear() {
        return gradYear;
    }

    public void setGradYear(String gradYear) {
        this.gradYear = gradYear;
    }

    @Override
    public String toString() {
        return "Student [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + ", gradYear=" + gradYear
                + "]";
    }
}
