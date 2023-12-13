package design_patterns.creational_design_patterns.factory.ui_components.button;

public class AndroidButton implements Button {

    @Override
    public void getButtonSize() {
        System.out.println("\n\nAndroid Button size updated");
    }
    
}
