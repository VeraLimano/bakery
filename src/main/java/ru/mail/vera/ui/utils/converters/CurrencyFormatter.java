package ru.mail.vera.ui.utils.converters;

import com.vaadin.flow.templatemodel.ModelEncoder;
import ru.mail.vera.ui.dataproviders.DataProviderUtil;
import ru.mail.vera.ui.utils.FormattingUtils;

public class CurrencyFormatter implements ModelEncoder<Integer, String> {

	@Override
	public String encode(Integer modelValue) {
		return DataProviderUtil.convertIfNotNull(modelValue, FormattingUtils::formatAsCurrency);
	}

	@Override
	public Integer decode(String presentationValue) {
		throw new UnsupportedOperationException();
	}
}
