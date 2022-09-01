package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    protected Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public void updateItemQualityPerDay() {
        updateItemQuality();
        updateItemSellIn();
        if (isExpired()) {
            updateItemQualityAfterExpire();
        }
    }

    protected void updateItemQuality() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    protected void updateItemQualityAfterExpire() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    private boolean isExpired() {
        return sellIn < 0;
    }

    protected void updateItemSellIn() {
        sellIn = sellIn - 1;
    }

    protected boolean isSulfuras() {
        return false;
    }

    protected boolean isBackstagePass() {
        return false;
    }

    protected boolean isAgedBrie() {
        return false;
    }
}
