package by.tms.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    public String cpu;
    public int ram;
    public int memory;
    public int cycleResource;
    public boolean burned;

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
        if (cycleResource > 0) {
            checkAction();
        } else {
            System.out.println("Компьютер сгорел!");
        }
    }

    public void off() {
        if (!burned) {
            System.out.println("Выключение компьютера");
            cycleResource--;
        }
    }

    private void checkAction() {
        System.out.println("Внимание! Введите 0 или 1");
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int r = random.nextInt(2);
        int my = in.nextInt();
        if (r == my) {
            System.out.println("Включение");
        } else {
            System.out.println("Компьютер сгорел!");
            burned = true;
            cycleResource = 0;
        }
    }
}
