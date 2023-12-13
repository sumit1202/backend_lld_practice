package design_patterns.creational_design_patterns.factory;

public class Client {

    public static void main(String[] args) {
        
        // Platform platform = new Platform();
        // System.out.println( "=> ver 1:");
        // platform.createUiComponentFactory("android").createButton().getButtonSize();
        // platform.createUiComponentFactory("ios").createButton().getButtonSize();
        // platform.createUiComponentFactory("invalid");

        Platform platform1 = new Android();
        Platform platform2 = new Ios();
        System.out.println( "=> ver 2:");
        platform1.createUiComponentFactory().createButton().getButtonSize();
        platform2.createUiComponentFactory().createButton().getButtonSize();

    }

}
