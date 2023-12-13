package design_patterns.creational_design_patterns.factory.factories;

import design_patterns.creational_design_patterns.factory.ui_components.button.Button;
import design_patterns.creational_design_patterns.factory.ui_components.button.IosButton;
import design_patterns.creational_design_patterns.factory.ui_components.dropdown.Dropdown;
import design_patterns.creational_design_patterns.factory.ui_components.dropdown.IosDropdown;
import design_patterns.creational_design_patterns.factory.ui_components.menu.IosMenu;
import design_patterns.creational_design_patterns.factory.ui_components.menu.Menu;

public class IosUiComponentFactory implements UiComponentFactory {

    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new IosDropdown();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }

}
