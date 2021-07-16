package ru.mail.vera.testbench.elements.ui;

import com.vaadin.flow.component.applayout.testbench.AppLayoutElement;
import ru.mail.vera.testbench.elements.components.AppNavigationElement;

public class MainViewElement extends AppLayoutElement {

	public AppNavigationElement getMenu() {
		return $(AppNavigationElement.class).first();
	}

}
