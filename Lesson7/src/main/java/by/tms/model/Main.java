package by.tms.model;

public class Main {
    public static void main(String[] args) {
        Season season = Season.SUMMER;
        Season season1 = Season.WINTER;
        season.favorite(season);
        season.getDescription();
        season1.favorite(season1);
        season1.getDescription();
        for (Season season2 : Season.values()) {
            System.out.println(season2);
            System.out.printf("%d %s %n", season2.getTemp(), season2.getDes());
        }
    }
}

