package design_patterns.structural_design_patterns.decorator.add_ons;

import design_patterns.structural_design_patterns.decorator.beverages.Beverage;

public class Mocha implements AddOn {
    Beverage b;

    public Mocha(Beverage b) {
        this.b = b;
    }

    @Override
    public String getDescription() {
        return b.getDescription() + " Mocha added.";
    }

    @Override
    public int getCost() {
        return 50 + b.getCost();
    }

}
