package design_patterns.creational_design_patterns.prototype_registry.prototype;

public class IntelligentStudent extends Student {
    int iq;

    @Override
    public IntelligentStudent copy() {

        IntelligentStudent intelligentStudentCopy = new IntelligentStudent();
        intelligentStudentCopy.id = this.id;
        intelligentStudentCopy.name = this.name;
        intelligentStudentCopy.psp = this.psp;
        intelligentStudentCopy.batch = this.batch;

        System.out.println("\nCreating Intelligent Student Copy...");
        return intelligentStudentCopy;
    }

}
