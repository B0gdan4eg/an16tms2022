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

    public Bouquet getBouquet(String... flowers) {
        Flower[] finalFlowers = new Flower[flowers.length];
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i].equals(FlowersType.ASTER.getName())) {
                finalFlowers[i] = new Flower(FlowersType.ASTER.getName(), FlowersType.ASTER.getCost());
            } else if (flowers[i].equals(FlowersType.HERBERA.getName())) {
                finalFlowers[i] = new Flower(FlowersType.HERBERA.getName(), FlowersType.HERBERA.getCost());
            } else if (flowers[i].equals(FlowersType.ROSE.getName())) {
                finalFlowers[i] = new Flower(FlowersType.ROSE.getName(), FlowersType.ROSE.getCost());
            } else if (flowers[i].equals(FlowersType.LILY.getName())) {
                finalFlowers[i] = new Flower(FlowersType.LILY.getName(), FlowersType.LILY.getCost());
            } else if (flowers[i].equals(FlowersType.CARNATION.getName())) {
                finalFlowers[i] = new Flower(FlowersType.CARNATION.getName(), FlowersType.CARNATION.getCost());
            }
        }
        return new Bouquet(finalFlowers);
    }

    public String buyBouquet(Bouquet bouquet) {
        Flower[] flowers = bouquet.getBouquet();
        int count = flowers.length;
        String[][] showcase = getShowcase();
        if (flowers[0].getName().equals(FlowersType.ASTER.getName()) && Integer.parseInt(showcase[1][0]) >= count) {
            showcase[1][0] = String.valueOf(Integer.parseInt(showcase[1][0]) - count);
            countOfSell += count;
            return "Here is your bouquet. " + bouquet.checkCost();
        }
        if (flowers[0].getName().equals(FlowersType.HERBERA.getName()) && Integer.parseInt(showcase[1][1]) >= count) {
            showcase[1][1] = String.valueOf(Integer.parseInt(showcase[1][1]) - count);
            countOfSell += count;
            return "Here is your bouquet. " + bouquet.checkCost();
        }
        if (flowers[0].getName().equals(FlowersType.LILY.getName()) && Integer.parseInt(showcase[1][2]) >= count) {
            showcase[1][2] = String.valueOf(Integer.parseInt(showcase[1][2]) - count);
            countOfSell += count;
            return "Here is your bouquet. " + bouquet.checkCost();
        }
        if (flowers[0].getName().equals(FlowersType.ROSE.getName()) && Integer.parseInt(showcase[1][3]) >= count) {
            showcase[1][3] = String.valueOf(Integer.parseInt(showcase[1][3]) - count);
            countOfSell += count;
            return "Here is your bouquet. " + bouquet.checkCost();
        }
        if (flowers[0].getName().equals(FlowersType.CARNATION.getName()) && Integer.parseInt(showcase[1][4]) >= count) {
            showcase[1][4] = String.valueOf(Integer.parseInt(showcase[1][4]) - count);
            countOfSell += count;
            return "Here is your bouquet. " + bouquet.checkCost();
        }
        return "I'm sorry but we don't have enough " + flowers[0].getName();
    }

    public static String[] sellToday(FlowersType... flowers) { //цветы на продажу сегодня
        int i = 0;
        String[] strings = new String[flowers.length];
        for (FlowersType flower : flowers) {
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
