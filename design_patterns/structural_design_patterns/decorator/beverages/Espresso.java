package design_patterns.structural_design_patterns.decorator.beverages;

public class Espresso implements Beverage {

    @Override
    public String getDescription() {
        return "Espresso Coffee.";
    }

    @Override
    public int getCost() {
        return 100;
    }

}
