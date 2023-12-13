package design_patterns.creational_design_patterns.factory.factories;

import design_patterns.creational_design_patterns.factory.ui_components.button.Button;
import design_patterns.creational_design_patterns.factory.ui_components.dropdown.Dropdown;
import design_patterns.creational_design_patterns.factory.ui_components.menu.Menu;

public interface UiComponentFactory {
    public Button createButton();

    public Dropdown createDropdown();

    public Menu createMenu();

}
