package com.algaworks.brewer.config.format;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class IntegerFormatter extends NumberFormatter<Integer> {
	
	@Autowired
	private Environment env;

	@Override
	public String pattern(Locale locale) {
		return env.getProperty("bigdecimal.format", "#,##0");
	}
}
