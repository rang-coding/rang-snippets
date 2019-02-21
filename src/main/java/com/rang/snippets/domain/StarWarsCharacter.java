package com.rang.snippets.domain;

import lombok.Data;

@Data
public class StarWarsCharacter {

	private final String name;
	private final String species;
	private final String homeworld;

}
