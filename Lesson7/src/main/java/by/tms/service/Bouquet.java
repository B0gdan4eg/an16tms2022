package by.tms.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Bouquet {
    private Flower[] bouquet;

    public String checkCost() {
        int bouquetCost = 0;
        for (Flower flower : bouquet) {
            bouquetCost += flower.getCost();
        }
        return "All cost: " + bouquetCost;
    }
}
