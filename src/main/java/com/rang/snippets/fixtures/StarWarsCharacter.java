package com.rang.snippets.fixtures;

public class StarWarsCharacter {

    private final String name;
    private final String species;
    private final String homeworld;

    /** ***** ***** All args constructor ***** ***** */
    public StarWarsCharacter(String name, String species, String homeworld) {
        this.name = name;
        this.species = species;
        this.homeworld = homeworld;
    }

    /** ***** ***** Getter ***** ***** */

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getHomeworld() {
        return homeworld;
    }

    /** ***** ***** toString ***** ***** */
    // @formatter:off
    @Override
    public String toString() {
        return "StarWarsCharacter [name=" + name 
                + ", species="+ species 
                + ", homeworld=" + homeworld + "]";
    }
    // @formatter:on

}
