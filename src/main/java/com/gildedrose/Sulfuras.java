package com.gildedrose;

/**
 * @author mjl
 * @since 2022-08-31
 */
public class Sulfuras extends Item {
    public Sulfuras(int sellIn, int quality) {
        super("Sulfuras, Hand of Ragnaros", sellIn, quality);
    }

    @Override
    protected void updateItemSellIn() {
    }

    @Override
    protected void updateItemQualityAfterExpire() {
    }

    @Override
    protected void updateItemQuality() {
    }
}
