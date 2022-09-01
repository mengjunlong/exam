package com.gildedrose;

/**
 * @author mjl
 * @since 2022-09-01
 */
public class Conjured extends Item {

    protected Conjured(int sellIn, int quality) {
        super("Conjured Mana Cake", sellIn, quality);
    }

    @Override
    protected void updateItemQuality() {
        if (quality > 0) {
            quality = quality - 2;
        }
    }
}
