package by.tms.service;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Flowers[] flowers = new Flowers[3];
        flowers[0] = Flowers.ROSE;
        flowers[1] = Flowers.ASTER;
        flowers[2] = Flowers.LILY;
        Bouquet present = new Bouquet(flowers);
        System.out.println(present.checkCost());

        String[][] showcase = new String[2][5];
        showcase[0] = FlowerMarket.sellToday(Flowers.ASTER, Flowers.HERBERA, Flowers.LILY, Flowers.ROSE, Flowers.CARNATION);
        showcase[1] = FlowerMarket.countOfFlowers(5, 15);
        FlowerMarket market = new FlowerMarket(0, showcase);

        System.out.println(Arrays.deepToString(showcase[0]));
        System.out.println(Arrays.toString(showcase[1]));

        System.out.println(market.getCountOfSell());

        System.out.println(market.buyBouquet(Flowers.CARNATION, Flowers.CARNATION, Flowers.CARNATION));
        System.out.println(Arrays.toString(showcase[1]));

        System.out.println(market.getCountOfSell());
    }
}
