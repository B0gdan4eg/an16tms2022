package by.tms.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Bouquet {
    private Flowers[] bouquet;

    public String checkCost() {
        int bouquetCost = 0;
        for (Flowers flowers : bouquet) {
            bouquetCost += flowers.getCost();
        }
        return "All cost: " + bouquetCost;
    }
}
