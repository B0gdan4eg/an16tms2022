package by.tms.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Bouquet {
    private Flower[] bouquet;

    public int checkCost() {
        int bouquetCost = 0;
        Flower[] flowers = getBouquet();
        for (Flower flower : bouquet) {
            bouquetCost += flower.getCost();
        }
        return bouquetCost;
    }
}
