package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] {new Item("foo", 0, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("fixme", app.items[0].name);
    }

    @Test
    void conjuredTest() {
        Item[] items = new Item[] {new Conjured(3, 6)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        app.updateQuality();
        System.out.println("app.items[0].quality = " + app.items[0].quality);
        assertEquals(2, app.items[0].quality);
    }

}
