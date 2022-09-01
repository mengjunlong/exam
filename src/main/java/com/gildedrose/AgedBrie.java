package com.gildedrose;

/**
 * @author mjl
 * @since 2022-08-31
 */
public class AgedBrie extends Item {
    public AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    public void updateItemQualityAfterExpire() {
        increaseQuality();
    }

    @Override
    protected void updateItemQuality() {
        increaseQuality();
    }
}
