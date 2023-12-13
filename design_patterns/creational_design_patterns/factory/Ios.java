package design_patterns.creational_design_patterns.factory;

import design_patterns.creational_design_patterns.factory.factories.IosUiComponentFactory;
import design_patterns.creational_design_patterns.factory.factories.UiComponentFactory;

public class Ios extends Platform{
    @Override
    public UiComponentFactory createUiComponentFactory() {
        return new IosUiComponentFactory();
    }
}
