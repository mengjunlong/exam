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
    protected boolean isAgedBrie() {
        return true;
    }

    @Override
    public void updateItemQualityAfterExpire() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }

    @Override
    protected void updateItemQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }
}
