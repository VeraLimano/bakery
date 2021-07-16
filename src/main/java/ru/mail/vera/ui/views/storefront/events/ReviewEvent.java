package ru.mail.vera.ui.views.storefront.events;

import com.vaadin.flow.component.ComponentEvent;
import ru.mail.vera.ui.views.orderedit.OrderEditor;

public class ReviewEvent extends ComponentEvent<OrderEditor> {

	public ReviewEvent(OrderEditor component) {
		super(component, false);
	}
}