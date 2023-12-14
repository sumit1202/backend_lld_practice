package design_patterns.structural_design_patterns.decorator.add_ons;

import design_patterns.structural_design_patterns.decorator.beverages.Beverage;

public class Whip implements AddOn {
    Beverage b;

    public Whip(Beverage b) {
        this.b = b;
    }

    @Override
    public String getDescription() {
        return b.getDescription() + " Whip added.";
    }

    @Override
    public int getCost() {
        return 40 + b.getCost();
    }

}
