package by.tms.service;

import by.tms.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer myComputer = new Computer("intel core i7", 8, 128, 5);
        myComputer.getInfo();
        myComputer.on();
        myComputer.off();
        myComputer.getInfo();
    }
}
