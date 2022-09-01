package com.gildedrose;

/**
 * @author mjl
 * @since 2022-09-01
 */
public class BackstagePass extends Item {
    public BackstagePass(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    protected boolean isBackstagePass() {
        return true;
    }

    @Override
    protected void updateItemQualityAfterExpire() {
        quality = 0;
    }

    @Override
    protected void updateItemQuality() {
        if (quality < 50) {
            quality = quality + 1;
            if (sellIn < 11) {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }
            if (sellIn < 6) {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }
        }
    }
}
