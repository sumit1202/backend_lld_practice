package design_patterns.creational_design_patterns.factory;

import design_patterns.creational_design_patterns.factory.factories.AndroidUiComponentFactory;
import design_patterns.creational_design_patterns.factory.factories.IosUiComponentFactory;
import design_patterns.creational_design_patterns.factory.factories.UiComponentFactory;

public class Platform {
    public void setRefreshrate() {
        System.out.println("Refresh rate set");
    }

    public void setTheme() {
        System.out.println("Theme set");
    }

    //? ver 2
    public UiComponentFactory createUiComponentFactory() {
        return null;
    }

    //? ver 1
    public UiComponentFactory createUiComponentFactory(String platform) {
        if (platform.equals("android")) {
            return new AndroidUiComponentFactory();
        } else if (platform.equals("ios")) {
            return new IosUiComponentFactory();
        } else {
            System.out.println();
            throw new IllegalArgumentException("\n\nInvalid Platform Name\n\n " +
                    platform);
        }
    }

}
