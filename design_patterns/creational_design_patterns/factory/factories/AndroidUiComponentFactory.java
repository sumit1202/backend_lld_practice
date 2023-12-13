package design_patterns.creational_design_patterns.factory.factories;

import design_patterns.creational_design_patterns.factory.ui_components.button.AndroidButton;
import design_patterns.creational_design_patterns.factory.ui_components.button.Button;
import design_patterns.creational_design_patterns.factory.ui_components.dropdown.AndroidDropdown;
import design_patterns.creational_design_patterns.factory.ui_components.dropdown.Dropdown;
import design_patterns.creational_design_patterns.factory.ui_components.menu.AndroidMenu;
import design_patterns.creational_design_patterns.factory.ui_components.menu.Menu;

public class AndroidUiComponentFactory implements UiComponentFactory {

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

}
