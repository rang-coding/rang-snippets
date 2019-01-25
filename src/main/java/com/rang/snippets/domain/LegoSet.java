package com.rang.snippets.domain;

import java.math.BigDecimal;
import java.math.BigInteger;

import lombok.Data;

@Data
public class LegoSet {

	private final String name;
	private final String number;
	private final BigInteger parts;
	private final BigDecimal price;

	public Integer getPartsAsInteger() {
		if (parts == null) {
			return null;
		}
		return parts.intValue();
	}

}
