package com.algaworks.brewer.config.format;

import java.math.BigDecimal;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class BigDecimalFormatter extends NumberFormatter<BigDecimal> {
	
	@Autowired
	private Environment env;

	@Override
	public String pattern(Locale locale) {
		return env.getProperty("bigdecimal.format", "#,##0.00");
	}
}
