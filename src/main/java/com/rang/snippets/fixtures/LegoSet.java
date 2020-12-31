package com.rang.snippets.fixtures;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;

public class LegoSet {

    private final String name;
    private final String productNumber;
    private final BigInteger parts;
    private final BigDecimal price;
    private final LocalDate releaseDate;

    /** ***** ***** All args constructor ***** ***** */
    public LegoSet(String name, String productNumber, BigInteger parts, BigDecimal price, LocalDate releaseDate) {
        this.name = name;
        this.productNumber = productNumber;
        this.parts = parts;
        this.price = price;
        this.releaseDate = releaseDate;
    }

    /** ***** ***** Convenience ***** ***** */

    public Integer getPartsAsInteger() {
        if (parts == null) {
            return null;
        }
        return parts.intValue();
    }

    /** ***** ***** Getter ***** ***** */

    public String getName() {
        return name;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public BigInteger getParts() {
        return parts;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    /** ***** ***** toString ***** ***** */
    // @formatter:off
    @Override
    public String toString() {
        return "LegoSet [name=" + name 
                + ", productNumber=" + productNumber 
                + ", parts=" + parts 
                + ", price=" + price
                + ", releaseDate=" + releaseDate + "]";
    }
    // @formatter:on

}
