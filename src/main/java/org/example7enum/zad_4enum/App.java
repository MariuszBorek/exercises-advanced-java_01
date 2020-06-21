package org.example7enum.zad_4enum;

public class App {
    public static void main(String[] args) {
        Seasons season = Seasons.SUMMER;
        String seasonStr;

        switch (season) {
            case WINTER:
                seasonStr = "Winter";
                break;
            case SPRING:
                seasonStr = "Spring";
                break;
            case SUMMER:
                seasonStr = "Summer";
                break;
            case AUTUMN:
                seasonStr = "Autumn";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + season);
        }

        System.out.println("wybrana pora roku: " +
                seasonStr +
                ", Czy są wakacje?: " +
                season.isHoliday() +
                ", średnia temp: " +
                season.getTemperature() +
                ", opis: " +
                season.getDescription());
    }
}
