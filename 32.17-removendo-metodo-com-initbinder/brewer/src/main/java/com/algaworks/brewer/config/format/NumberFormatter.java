package com.algaworks.brewer.config.format;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

public abstract class NumberFormatter<T extends Number> implements Formatter<T> {
	
	@Override
	public String print(T number, Locale locale) {
		NumberFormat numberFormat = new DecimalFormat(pattern(locale), 
				new DecimalFormatSymbols(locale));
		
		return numberFormat.format(number);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T parse(String text, Locale locale) throws ParseException {
		DecimalFormat decimalFormat = new DecimalFormat(pattern(locale), 
				new DecimalFormatSymbols(locale));
		
		decimalFormat.setParseBigDecimal(true);
		
		return (T) decimalFormat.parse(text);
	}

	public abstract String pattern(Locale locale);
}
