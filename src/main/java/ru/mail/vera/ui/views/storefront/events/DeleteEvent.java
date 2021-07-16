package ru.mail.vera.ui.views.storefront.events;

import com.vaadin.flow.component.ComponentEvent;
import ru.mail.vera.ui.views.orderedit.OrderItemEditor;

public class DeleteEvent extends ComponentEvent<OrderItemEditor> {
	public DeleteEvent(OrderItemEditor component) {
		super(component, false);
	}
}