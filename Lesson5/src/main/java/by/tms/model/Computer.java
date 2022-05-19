package by.tms.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    public String cpu;
    public int ram;
    public int memory;
    public int cycleResource;
    public boolean burnt;

    public Computer(String cpu, int ram, int memory, int cycleResource) {
        this.cpu = cpu;
        this.ram = ram;
        this.memory = memory;
        this.cycleResource = cycleResource;
    }

    public void getInfo() {
        System.out.print("(" + cpu + ") ");
        System.out.print("(" + ram + ") ");
        System.out.print("(" + memory + ") ");
        System.out.println("(" + cycleResource + ") ");
    }

    public void on() {
        System.out.println("Внимание! Введите 0 или 1");
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int r = random.nextInt(2);
        int my = in.nextInt();
        if (r == my && cycleResource > 0) {
            System.out.println("Включение");
        } else {
            System.out.println("Компьютер сгорел!");
            burnt = true;
            cycleResource = 0;
        }
    }

    public void off() {
        if (!burnt) {
            System.out.println("Выключение компьютера");
            cycleResource--;
        }
    }
}
