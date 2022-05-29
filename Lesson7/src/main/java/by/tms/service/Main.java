package by.tms.service;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Flower[] flowers = new Flower[3];
        flowers[0] = new Flower(FlowersType.ASTER.getName(), FlowersType.ASTER.getCost());
        flowers[1] = new Flower(FlowersType.ASTER.getName(), FlowersType.ASTER.getCost());
        flowers[2] = new Flower(FlowersType.ASTER.getName(), FlowersType.ASTER.getCost());
        Bouquet present = new Bouquet(flowers);
        System.out.println(present.checkCost());

        String[][] showcase = new String[2][5];
        showcase[0] = FlowerMarket.sellToday(FlowersType.ASTER, FlowersType.HERBERA, FlowersType.LILY, FlowersType.ROSE, FlowersType.CARNATION);
        showcase[1] = FlowerMarket.countOfFlowers(5, 15);
        FlowerMarket market = new FlowerMarket(0, showcase);

        System.out.println(Arrays.deepToString(showcase[0]));
        System.out.println(Arrays.toString(showcase[1]));

        System.out.println(market.getCountOfSell());

        System.out.println(market.buyBouquet(new Bouquet(flowers)));
        System.out.println(Arrays.toString(showcase[1]));

        System.out.println(market.getCountOfSell());
        System.out.println(market.getBouquet("ROSE", "ROSE", "ROSE"));
        System.out.println(market.getBouquet("ROSE", "ROSE", "ROSE").checkCost());
        FlowersType.ROSE.setCost(10);
        System.out.println(market.getBouquet("ROSE", "ROSE", "ROSE"));
        System.out.println(market.getBouquet("ROSE", "ROSE", "ROSE").checkCost());
    }
}
