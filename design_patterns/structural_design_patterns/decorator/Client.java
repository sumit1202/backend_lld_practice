package design_patterns.structural_design_patterns.decorator;

import design_patterns.structural_design_patterns.decorator.add_ons.Mocha;
import design_patterns.structural_design_patterns.decorator.add_ons.Whip;
import design_patterns.structural_design_patterns.decorator.beverages.Beverage;
import design_patterns.structural_design_patterns.decorator.beverages.Espresso;
import design_patterns.structural_design_patterns.decorator.beverages.Latte;

public class Client {

    public static void main(String[] args) {

        //? decorator/wrapper design pattern

        // ! Espresso Coffee.
        Beverage beverage = new Espresso();
        System.out.println("\nDescription: " + beverage.getDescription());
        System.out.println("Cost: " + beverage.getCost());
        System.out.println();

        // ! Latte Coffee. Mocha added. Whip added.
        Beverage beverage2 = new Latte();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println("\nDescription: " + beverage2.getDescription());
        System.out.println("Cost: " + beverage2.getCost());
        System.out.println();

        // ! Espresso Coffee. Mocha added.
        Beverage beverage3 = new Espresso();
        beverage3 = new Mocha(beverage3);
        // beverage3 = new Whip(beverage3);
        System.out.println("\nDescription: " + beverage3.getDescription());
        System.out.println("Cost: " + beverage3.getCost());
        System.out.println();

    }

}
