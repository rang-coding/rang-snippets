package com.rang.snippets.fixtures;

import static com.rang.snippets.fixtures.HockeyPlayerPosition.C;
import static com.rang.snippets.fixtures.HockeyPlayerPosition.D;
import static com.rang.snippets.fixtures.HockeyPlayerPosition.G;
import static com.rang.snippets.fixtures.HockeyPlayerPosition.LW;
import static com.rang.snippets.fixtures.HockeyPlayerPosition.RW;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

/**
 * This class contains some predefined examples of {@link HockeyPlayer}.
 */
public class HockeyPlayerFixtures {

    // @formatter:off

    // 2019-2020 Forwards
    public static HockeyPlayer STAMKOS = new HockeyPlayer("Steven", "Stamkos", LocalDate.of(1990, 2, 7), "Markham", "Canada", C, 91);
    public static HockeyPlayer KUCHEROV = new HockeyPlayer("Nikita", "Kucherov", LocalDate.of(1993, 6, 17), "Maykop", "Russia", LW, 86);
    public static HockeyPlayer POINT = new HockeyPlayer("Brayden", "Point", LocalDate.of(1996, 3, 13), "Calgary", "Canada", C, 21);
    public static HockeyPlayer JOHNSON = new HockeyPlayer("Tyler", "Johnson", LocalDate.of(1990, 7, 29), "Spokane", "USA", C, 9);
    public static HockeyPlayer PALAT = new HockeyPlayer("Ondrej", "Palat", LocalDate.of(1991, 3, 28), "Frydek-Mistek", "Czech Republic", LW, 18);
    public static HockeyPlayer CIRELLI = new HockeyPlayer("Anthony", "Cirelli", LocalDate.of(1997, 7, 15), "Etobicoke", "Canada", C, 71);
    public static HockeyPlayer KILLORN = new HockeyPlayer("Alex", "Killorn", LocalDate.of(1989, 9, 14), "Halifax", "Canada", LW, 17);
    public static HockeyPlayer GOURDE = new HockeyPlayer("Yanni", "Gourde", LocalDate.of(1991, 12, 15), "Saint-Narcisse", "Canada", C, 37);
    public static HockeyPlayer PAQUETTE = new HockeyPlayer("Cedric", "Paquette", LocalDate.of(1993, 8, 13), "Gaspe", "Canada", C, 13);
    public static HockeyPlayer MAROON = new HockeyPlayer("Pat", "Maroon", LocalDate.of(1988, 4, 23), "St. Louis", "USA", LW, 14);
    public static HockeyPlayer GOODROW = new HockeyPlayer("Barclay", "Goodrow", LocalDate.of(1993, 2, 26), "Toronto", "Canada", RW, 19);
    public static HockeyPlayer COLEMAN = new HockeyPlayer("Blake", "Coleman", LocalDate.of(1991, 11, 28), "Plano", "USA", C, 20);
    public static HockeyPlayer VERHAEGHE = new HockeyPlayer("Carter", "Verhaeghe", LocalDate.of(1995, 8, 14), "Toronto", "Canada", C, 23);
    public static HockeyPlayer STEPHENS = new HockeyPlayer("Mitchell", "Stephens", LocalDate.of(1997, 2, 5), "Peterborough", "Canada", C, 67);
    public static HockeyPlayer VOLKOV = new HockeyPlayer("Alexander", "Volkov", LocalDate.of(1997, 8, 2), "Moscow", "Russia", RW, 92);
    // 2019-2020 Defensemen
    public static HockeyPlayer HEDMAN = new HockeyPlayer("Victor", "Hedman", LocalDate.of(1990, 12, 18), "Ornskoldsvik", "Sweden", D, 77);
    public static HockeyPlayer MCDONAGH = new HockeyPlayer("Ryan", "McDonagh", LocalDate.of(1989, 6, 13), "St. Paul", "USA", D, 27);
    public static HockeyPlayer SERGACHEV = new HockeyPlayer("Mikhail", "Sergachev", LocalDate.of(1998, 6, 25), "Nizhnekamsk", "Russia", D, 98);
    public static HockeyPlayer SHATTENKIRK = new HockeyPlayer("Kevin", "Shattenkirk", LocalDate.of(1989, 1, 29), "New Rochelle", "USA", D, 22);
    public static HockeyPlayer CERNAK = new HockeyPlayer("Eric", "Cernak", LocalDate.of(1997, 5, 28), "Kosice", "Slovakia", D, 81);
    public static HockeyPlayer BOGOSIAN = new HockeyPlayer("Zach", "Bogosian", LocalDate.of(1990, 7, 15), "Massena", "USA", D, 24);
    public static HockeyPlayer COBURN = new HockeyPlayer("Braydon", "Coburn", LocalDate.of(1985, 2, 27), "Shaunavon", "Canada", D, 55);
    public static HockeyPlayer RUTTA = new HockeyPlayer("Jan", "Rutta", LocalDate.of(1990, 7, 29), "Pisek", "Czech Republic", D, 44);
    public static HockeyPlayer SCHENN = new HockeyPlayer("Luke", "Schenn", LocalDate.of(1989, 11, 2), "Saskatoon", "Canada", D, 2);
    // 2019-2020 Goalies
    public static HockeyPlayer VASILEVSKIY = new HockeyPlayer("Andrei", "Vasilevskiy", LocalDate.of(1994, 7, 25), "Tyumen", "Russia", G, 88);
    public static HockeyPlayer MCELHINNEY = new HockeyPlayer("Curtis", "McElhinney", LocalDate.of(1983, 5, 23), "London", "Canada", G, 35);

    // 2003-2004 Forwards
    public static HockeyPlayer LECAVALIER = new HockeyPlayer("Vincent", "Lecavalier", LocalDate.of(1980, 4, 21), "Ile Bizard", "Canada", C, 4);
    public static HockeyPlayer STLOUIS = new HockeyPlayer("Martin", "St.Louis", LocalDate.of(1975, 6, 18), "Laval", "Canada", RW, 26);
    public static HockeyPlayer RICHARDS = new HockeyPlayer("Brad", "Richards", LocalDate.of(1980, 5, 2), "Murray Hbr.", "Canada", C, 19);
    public static HockeyPlayer ANDREYCHUK = new HockeyPlayer("Dave", "Andreychuk", LocalDate.of(1963, 9, 29), "Hamilton", "Canada", LW, 25);
    public static HockeyPlayer MODIN = new HockeyPlayer("Fredrik", "Modin", LocalDate.of(1974, 10, 8), "Sundsvall", "Sweden", LW, 33);
    public static HockeyPlayer FEDOTENKO = new HockeyPlayer("Ruslan", "Fedotenko", LocalDate.of(1979, 1, 18), "Kiev", "Ukraine", LW, 17);
    public static HockeyPlayer STILLMAN = new HockeyPlayer("Cory", "Stillman", LocalDate.of(1973, 12, 20), "Peterborough", "Canada", LW, 61);
    public static HockeyPlayer TAYLOR = new HockeyPlayer("Tim", "Taylor", LocalDate.of(1969, 2, 6), "Stratford", "Canada", C, 27);
    public static HockeyPlayer AFANASENKOV = new HockeyPlayer("Dmitri", "Afanasenkov", LocalDate.of(1980, 5, 12), "Arkhangelsk", "Russia", LW, 29);
    public static HockeyPlayer DINGMAN = new HockeyPlayer("Chris", "Dingman", LocalDate.of(1976, 7, 6), "Edmonton", "Canada", LW, 11);
    public static HockeyPlayer ROY = new HockeyPlayer("Andre", "Roy", LocalDate.of(1975, 2, 8), "Port Chester", "USA", RW, 36);
    public static HockeyPlayer PERRIN = new HockeyPlayer("Eric", "Perrin", LocalDate.of(1975, 11, 1), "Laval", "Canada", C, 9);
    public static HockeyPlayer CIBAK = new HockeyPlayer("Martin", "Cibak", LocalDate.of(1980, 5, 17), "Liptovsky Mikulas", "Slovakia", C, 8);
    public static HockeyPlayer CLYMER = new HockeyPlayer("Ben", "Clymer", LocalDate.of(1978, 4, 11), "Bloom", "USA", RW, 7);
    // 2003-2004 Defensemen
    public static HockeyPlayer BOYLE = new HockeyPlayer("Dan", "Boyle", LocalDate.of(1976, 7, 12), "Ottawa", "Canada", D, 22);
    public static HockeyPlayer SYDOR = new HockeyPlayer("Darryl", "Sydor", LocalDate.of(1972, 5, 13), "Edmonton", "Canada", D, 55);
    public static HockeyPlayer KUBINA = new HockeyPlayer("Pavel", "Kubina", LocalDate.of(1977, 4, 15), "Celadna", "Czech Republic", D, 13);
    public static HockeyPlayer CULLIMORE = new HockeyPlayer("Jassen", "Cullimore", LocalDate.of(1972, 12, 4), "Simcoe", "Canada", D, 5);
    public static HockeyPlayer LUKOWICH = new HockeyPlayer("Brad", "Lukowich", LocalDate.of(1976, 8, 12), "Cranbrook", "Canada", D, 37);
    public static HockeyPlayer PRATT = new HockeyPlayer("Nolan", "Pratt", LocalDate.of(1975, 8, 14), "Fort McMurray", "Canada", D, 44);
    public static HockeyPlayer SARICH = new HockeyPlayer("Cory", "Sarich", LocalDate.of(1978, 8, 16), "Saskatoon", "Canada", D, 21);
    public static HockeyPlayer NECKAR = new HockeyPlayer("Stanislav", "Neckar", LocalDate.of(1975, 12, 22), "Ceské Budejovice", "Czech Republic", D, 2);
    // 2003-2004 Goalies
    public static HockeyPlayer KHABIBULIN = new HockeyPlayer("Nikolai", "Khabibulin", LocalDate.of(1973, 1, 13), "Sverdlovsk", "Russia", G, 35);
    public static HockeyPlayer GRAHAME = new HockeyPlayer("John", "Grahame", LocalDate.of(1975, 8, 31), "Denver", "USA", G, 47);

    // @formatter:on

    public static List<HockeyPlayer> getTeamOf2004() {
        List<HockeyPlayer> values = List.of(LECAVALIER, STLOUIS, RICHARDS, ANDREYCHUK, MODIN, FEDOTENKO, STILLMAN,
                TAYLOR, AFANASENKOV, DINGMAN, ROY, PERRIN, CIBAK, CLYMER, BOYLE, SYDOR, KUBINA, CULLIMORE, LUKOWICH,
                PRATT, SARICH, NECKAR, KHABIBULIN, GRAHAME);
        Collections.shuffle(values);
        return values;
    }

    public static List<HockeyPlayer> getTeamOf2020() {
        List<HockeyPlayer> values = List.of(STAMKOS, KUCHEROV, POINT, JOHNSON, PALAT, CIRELLI, KILLORN, GOURDE,
                PAQUETTE, MAROON, GOODROW, COLEMAN, VERHAEGHE, STEPHENS, VOLKOV, HEDMAN, MCDONAGH, SERGACHEV,
                SHATTENKIRK, CERNAK, BOGOSIAN, COBURN, RUTTA, SCHENN, VASILEVSKIY, MCELHINNEY);
        Collections.shuffle(values);
        return values;
    }

}
