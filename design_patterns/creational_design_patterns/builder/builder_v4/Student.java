package design_patterns.creational_design_patterns.builder.builder_v4;

public class Student {
    private String firstname;
    private String lastname;
    private int age;
    private String gradYear;
    // ? ......snd so on say long list of attributes

    private Student(StudentBuilder builder) {
        // ? if validatiions pass then execute below, else throw exceptions
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.age = builder.age;
        this.gradYear = builder.gradYear;
    }

    public static StudentBuilder getBuilder() {
        return new StudentBuilder();
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

    // ? Static inner class
    static class StudentBuilder {
        private String firstname;
        private String lastname;
        private int age;
        private String gradYear;
        // ? ......snd so on say long list of attributes

        public Student build() {
            // ? validations can be performed here
            return new Student(this);
        }

        public StudentBuilder setFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public StudentBuilder setLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setGradYear(String gradYear) {
            this.gradYear = gradYear;
            return this;
        }

    }

}
