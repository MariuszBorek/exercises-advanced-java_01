package org.example3_unmutable;

import java.time.LocalDate;

public class Passport {
    private final String numberPassport;
    private final LocalDate dataWydania;
    private final String[] wlascicilePaszportów;

    public Passport(String numberPassport, LocalDate dataWydaniat, String[] wlascicilePaszportów) {
        this.numberPassport = numberPassport;
        this.dataWydania = dataWydaniat;
        this.wlascicilePaszportów = wlascicilePaszportów;
    }

    public String getNumberPassport() {
        return numberPassport;
    }

    public LocalDate getDataWydania() {
        return dataWydania;
    }

    public String[] getWlascicilePaszportów() {
        return wlascicilePaszportów;
    }
}
