package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public static Item createBackstagePasses(int sellIn, int quality) {
        return new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    public static Item createAgedBrie(int sellIn, int quality) {
        return new Item("Aged Brie",sellIn, quality);
    }

    public static Item createSulfuras(int sellIn, int quality) {
        return new Item("Sulfuras, Hand of Ragnaros",sellIn, quality);
    }

    public static Item createCommonItem(String name, int sellIn, int quality) {
        return new Item(name, sellIn, quality);
    }

    private Item(String name, int sellIn, int quality) {
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

    private void updateItemQuality() {
        if (!isAgedBrie()
            && !isBackstagePasses()) {
            if (quality > 0) {
                if (!isSulfuras()) {
                    quality = quality - 1;
                }
            }
        } else {
            if (quality < 50) {
                quality = quality + 1;

                if (isBackstagePasses()) {
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
    }

    private void updateItemQualityAfterExpire() {
        if (!isAgedBrie()) {
            if (!isBackstagePasses()) {
                if (quality > 0) {
                    if (!isSulfuras()) {
                        quality = quality - 1;
                    }
                }
            } else {
                quality = 0;
            }
        } else {
            if (quality < 50) {
                quality = quality + 1;
            }
        }
    }

    private boolean isExpired() {
        return sellIn < 0;
    }

    private void updateItemSellIn() {
        if (!isSulfuras()) {
            sellIn = sellIn - 1;
        }
    }

    private boolean isSulfuras() {
        return name.equals("Sulfuras, Hand of Ragnaros");
    }

    private boolean isBackstagePasses() {
        return name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    private boolean isAgedBrie() {
        return name.equals("Aged Brie");
    }
}
