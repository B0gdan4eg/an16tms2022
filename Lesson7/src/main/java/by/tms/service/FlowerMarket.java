package by.tms.service;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@AllArgsConstructor
@Setter
@Getter
public class FlowerMarket {
    private int countOfSell;
    private String[][] showcase;

    @Override
    public String toString() {
        return "We sell today: " + countOfSell;
    }

    public String buyBouquet(Flowers... flowers) {
        int count = flowers.length;
        String[][] showcase = getShowcase();
        Bouquet bouquet = new Bouquet(flowers);
        if (flowers[0].equals(Flowers.ASTER) && Integer.parseInt(showcase[1][0]) >= count) {
            showcase[1][0] = String.valueOf(Integer.parseInt(showcase[1][0]) - count);
            countOfSell += count;
            return "Here is your bouquet. " + bouquet.checkCost();
        }
        if (flowers[0].equals(Flowers.HERBERA) && Integer.parseInt(showcase[1][1]) >= count) {
            showcase[1][1] = String.valueOf(Integer.parseInt(showcase[1][1]) - count);
            countOfSell += count;
            return "Here is your bouquet. " + bouquet.checkCost();
        }
        if (flowers[0].equals(Flowers.LILY) && Integer.parseInt(showcase[1][2]) >= count) {
            showcase[1][2] = String.valueOf(Integer.parseInt(showcase[1][2]) - count);
            countOfSell += count;
            return "Here is your bouquet. " + bouquet.checkCost();
        }
        if (flowers[0].equals(Flowers.ROSE) && Integer.parseInt(showcase[1][3]) >= count) {
            showcase[1][3] = String.valueOf(Integer.parseInt(showcase[1][3]) - count);
            countOfSell += count;
            return "Here is your bouquet. " + bouquet.checkCost();
        }
        if (flowers[0].equals(Flowers.CARNATION) && Integer.parseInt(showcase[1][4]) >= count) {
            showcase[1][4] = String.valueOf(Integer.parseInt(showcase[1][4]) - count);
            countOfSell += count;
            return "Here is your bouquet. " + bouquet.checkCost();
        }
        return "I'm sorry but we don't have enough " + flowers[0].getName();
    }

    public static String[] sellToday(Flowers... flowers) { //цветы на продажу сегодня
        int i = 0;
        String[] strings = new String[flowers.length];
        for (Flowers flower : flowers) {
            if (i >= 0) {
                strings[i] = flower.toString();
            }
            i++;
        }
        return strings;
    }

    public static String[] countOfFlowers(int numOfTypes, int supplyValue) { // колличество цветов на продажу сегодня
        Random random = new Random();
        String[] strings = new String[numOfTypes];
        for (int i = 0; i < numOfTypes; i++) {
            strings[i] = Integer.toString(random.nextInt(supplyValue));
        }
        return strings;
    }
}
