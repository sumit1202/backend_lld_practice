package design_patterns.builder;

//? Builder/Helper class
public class StudentBuilder {
    private String firstname;
    private String lastname;
    private int age;
    private String gradYear;
    // ? ......snd so on say long list of attributes

    // ! v3
    public Student build() {
        return new Student(this);
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

}
