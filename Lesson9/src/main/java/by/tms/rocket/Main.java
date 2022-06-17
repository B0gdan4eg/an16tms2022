package by.tms.rocket;

public class Main {
    public static void main(String[] args) {
        Spaceport spaceport = new Spaceport();
        Shuttle shuttle = new Shuttle();
        spaceport.launch(shuttle);
    }
}
