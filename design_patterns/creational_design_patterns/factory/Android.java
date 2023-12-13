package design_patterns.creational_design_patterns.factory;

import design_patterns.creational_design_patterns.factory.factories.AndroidUiComponentFactory;
import design_patterns.creational_design_patterns.factory.factories.UiComponentFactory;

public class Android extends Platform {
    @Override
    public UiComponentFactory createUiComponentFactory() {
        return new AndroidUiComponentFactory();
    }
}
