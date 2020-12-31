package com.rang.snippets.fixtures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class contains some predefined examples of {@link StarWarsCharacter}.
 */
public class StarWarsCharacterFixtures {

    public static StarWarsCharacter LUKE = new StarWarsCharacter("Luke Skywalker", "Human", "Tatooine");
    public static StarWarsCharacter HAN = new StarWarsCharacter("Han Solo", "Human", "Corellia");
    public static StarWarsCharacter CHEWBACCA = new StarWarsCharacter("Chewbacca", "Wookiee", "Kashyyyk");
    public static StarWarsCharacter OBIWAN = new StarWarsCharacter("Obi-Wan Kenobi", "Human", "Stewjon");
    public static StarWarsCharacter YODA = new StarWarsCharacter("Yoda", "unknown", "unknown");
    public static StarWarsCharacter LEIA = new StarWarsCharacter("Leia Organa", "Human", "Alderaan");
    public static StarWarsCharacter C3PO = new StarWarsCharacter("C-3PO", "Droid", "Tatooine");
    public static StarWarsCharacter R2D2 = new StarWarsCharacter("R2-D2", "Droid", "Naboo");
    public static StarWarsCharacter LANDO = new StarWarsCharacter("Lando Calrissian", "Human", "Socorro");
    public static StarWarsCharacter GIAL = new StarWarsCharacter("Gial Ackbar", "Mon Calamari", "Mon Cala");
    public static StarWarsCharacter ANAKIN = new StarWarsCharacter("Anakin Skywalker", "Human", "Tatooine");
    public static StarWarsCharacter QUIGON = new StarWarsCharacter("Qui-Gon Jinn", "Human", "unknown");
    public static StarWarsCharacter PADME = new StarWarsCharacter("Padmé Amidala", "Human", "Naboo");
    public static StarWarsCharacter MACE = new StarWarsCharacter("Mace Windu", "Human", "Haruun Kal");
    public static StarWarsCharacter JARJAR = new StarWarsCharacter("Jar Jar Binks", "Gungan", "Naboo");
    public static StarWarsCharacter WATTO = new StarWarsCharacter("Watto", "Toydarian", "Toydaria");
    public static StarWarsCharacter SEBULBA = new StarWarsCharacter("Sebulba", "Dug", "Malastare");

    private static int NUMBER_OF_FIXTURES = 17;

    public static List<StarWarsCharacter> getAsList() {
        List<StarWarsCharacter> values = List.of(LUKE, HAN, CHEWBACCA, OBIWAN, YODA, LEIA, C3PO, R2D2, LANDO, GIAL,
                ANAKIN, QUIGON, PADME, MACE, JARJAR, WATTO, SEBULBA);
        Collections.shuffle(values);
        return values;
    }

    public static List<StarWarsCharacter> getAsList(int amount) {
        List<StarWarsCharacter> values = new ArrayList<>(amount * 2);

        List<StarWarsCharacter> all = getAsList();
        for (int i = 0; i < amount; i++) {
            int index = i % NUMBER_OF_FIXTURES;
            values.add(all.get(index));
        }
        return values;
    }

}
