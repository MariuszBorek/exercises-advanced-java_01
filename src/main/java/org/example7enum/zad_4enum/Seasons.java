package org.example7enum.zad_4enum;

public enum Seasons {
    /*
    Napisz typ numeryczny PoryRoku - przechowuj w nim wszystkie pory roku, niech każdy typ ma także pola z wartościami
    dla średniej temperatury oraz krótki opis pory roku.
     */

    WINTER(0, "sieg i zimno") {
        boolean isHoliday() {
            return false;
        }
    },
    SPRING(8, "na drzewach zaczynają się pojawiać liście") {
        boolean isHoliday() {
            return false;
        }
    },
    SUMMER(22,"cieplutko i przyjemnie") {
        boolean isHoliday() {
            return true;
        }
    },
    AUTUMN(7, "złoto i kolorowo") {
        boolean isHoliday() {
            return false;
        }
    };

    private int temperature;
    private String description;

    Seasons(int temperature, String description) {
        this.description = description;
        this.temperature = temperature;
    }

    boolean isHoliday() {
        return true;
    }

    public String getDescription() {
        return description;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Seasons{" +
                "temperature=" + temperature +
                ", description='" + description + '\'' +
                '}';
    }
}
