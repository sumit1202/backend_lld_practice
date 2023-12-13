package design_patterns.creational_design_patterns.prototype_registry.prototype_with_registry;

public class IntelligentStudent extends Student {
    private int iq;

    // ? copy constructor for IntelligentStudent
    IntelligentStudent(IntelligentStudent other) {
        super(other);
        this.iq = other.iq;
    }

    @Override
    public IntelligentStudent copy() {
        System.out.println("\nCreating Intelligent Student Copy...");
        return new IntelligentStudent(this);

    }

}
