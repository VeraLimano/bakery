package ru.mail.vera.ui.views.storefront.events;

import com.vaadin.flow.component.ComponentEvent;
import ru.mail.vera.ui.views.orderedit.OrderItemsEditor;

public class TotalPriceChangeEvent extends ComponentEvent<OrderItemsEditor> {

	private final Integer totalPrice;

	public TotalPriceChangeEvent(OrderItemsEditor component, Integer totalPrice) {
		super(component, false);
		this.totalPrice = totalPrice;
	}

	public Integer getTotalPrice() {
		return totalPrice;
	}

}