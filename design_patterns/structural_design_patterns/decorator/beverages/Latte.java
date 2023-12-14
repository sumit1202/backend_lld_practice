package design_patterns.structural_design_patterns.decorator.beverages;

public class Latte implements Beverage {

    @Override
    public String getDescription() {
        return "Latte Coffee.";
    }

    @Override
    public int getCost() {
        return 90;
    }

}
