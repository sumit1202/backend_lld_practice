package design_patterns.creational_design_patterns.factory.ui_components.button;

public class IosButton implements Button{

    @Override
    public void getButtonSize() {
        System.out.println("\n\nIos Button size updated");
    }
    
}
