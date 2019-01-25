package com.rang.snippets.domain;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * This class contains some predefined examples of {@LegoSet}.
 *
 */
public class LegoSetFixtures {

	public static LegoSet DUMMY_PARTS_NULL = new LegoSet("Dummy - Parts is null", "00001", null,
			new BigDecimal("17.99"));
	public static LegoSet DUMMY_PRICE_NULL = new LegoSet("Dummy - Price is null", "00002", BigInteger.valueOf(170),
			null);

	public static LegoSet DOWNTOWN_DINER = new LegoSet("Downtown Diner", "10260", BigInteger.valueOf(2454),
			new BigDecimal("149.99"));
	public static LegoSet ROLLER_COASTER = new LegoSet("Roller Coaster", "10261", BigInteger.valueOf(4080),
			new BigDecimal("329.99"));
	public static LegoSet MOUNTAIN_POLICE_CHASE = new LegoSet("Mountain Police Chase", "10751", BigInteger.valueOf(103),
			new BigDecimal("15.99"));
	public static LegoSet UNDERMINER_BANK_HEIST = new LegoSet("Underminer Bank Heist", "10760", BigInteger.valueOf(133),
			new BigDecimal("21.99"));
	public static LegoSet CITY_CENTRAL_AIRPORT = new LegoSet("City Central Airport", "10764", BigInteger.valueOf(356),
			new BigDecimal("40.99"));
	public static LegoSet GREAT_WALL_OF_CHINA = new LegoSet("Great Wall Of China", "21041", BigInteger.valueOf(551),
			new BigDecimal("49.99"));
	public static LegoSet STATUE_OF_LIBERTY = new LegoSet("Statue Of Liberty", "21042", BigInteger.valueOf(1685),
			new BigDecimal("99.99"));
	public static LegoSet MODULAR_SKATE_HOUSE = new LegoSet("Modular Skate House", "31081", BigInteger.valueOf(414),
			new BigDecimal("39.99"));
	public static LegoSet MOBILE_STUNT_SHOW = new LegoSet("Mobile Stunt Show", "31085", BigInteger.valueOf(572),
			new BigDecimal("49.99"));
	public static LegoSet FIRST_RESPONDER = new LegoSet("First Responder", "42075", BigInteger.valueOf(513),
			new BigDecimal("39.99"));
	public static LegoSet RALLY_CAR = new LegoSet("Rally Car", "42077", BigInteger.valueOf(1005),
			new BigDecimal("99.99"));
	public static LegoSet BUGATTI_CHIRON = new LegoSet("Bugatti Chiron", "42083", BigInteger.valueOf(3599),
			new BigDecimal("369.99"));
	public static LegoSet MOUNTAIN_POLICE_HEADQUARTERS = new LegoSet("Mountain Police Headquarters", "60174",
			BigInteger.valueOf(633), new BigDecimal("79.99"));
	public static LegoSet HEAVY_CARGO_TRANSPORT = new LegoSet("Heavy Cargo Transport", "60183", BigInteger.valueOf(301),
			new BigDecimal("29.99"));

}
