package design_patterns.creational_design_patterns.builder.builder_v3;

public class StudentBuilder {
    private String firstname;
    private String lastname;
    private int age;
    private String gradYear;
    // ? ......snd so on say long list of attributes

    public Student build() {

        // ? if validatiions pass then execute below, else throw exceptions
        return new Student(this);
    }

    public String getFirstname() {
        return firstname;
    }

    public StudentBuilder setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public StudentBuilder setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public int getAge() {
        return age;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public String getGradYear() {
        return gradYear;
    }

    public StudentBuilder setGradYear(String gradYear) {
        this.gradYear = gradYear;
        return this;
    }

}