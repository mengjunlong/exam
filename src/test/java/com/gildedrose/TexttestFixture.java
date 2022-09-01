package com.gildedrose;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Item[] items = new Item[]{
            Item.createCommonItem("+5 Dexterity Vest", 10, 20), //
            Item.createAgedBrie(2,0),
            Item.createCommonItem("Elixir of the Mongoose", 5, 7), //
            Item.createSulfuras(0,80),
            Item.createSulfuras(-1,80),
            Item.createBackstagePasses(15, 20),
            Item.createBackstagePasses(10, 49),
            Item.createBackstagePasses(5, 49),
            // this conjured item does not work properly yet
            Item.createCommonItem("Conjured Mana Cake", 3, 6)};

        GildedRose app = new GildedRose(items);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }

    public static String getBaseResult() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        printStream.println("OMGHAI!");
        Item[] items = new Item[]{
            Item.createCommonItem("+5 Dexterity Vest", 10, 20), //
            Item.createAgedBrie(2,0),
            Item.createCommonItem("Elixir of the Mongoose", 5, 7), //
            Item.createSulfuras(0,80),
            Item.createSulfuras(-1,80),
            Item.createBackstagePasses(15, 20),
            Item.createBackstagePasses(10, 49),
            Item.createBackstagePasses(5, 49),
            // this conjured item does not work properly yet
            Item.createCommonItem("Conjured Mana Cake", 3, 6)};

        GildedRose app = new GildedRose(items);
        int days = 2;
        for (int i = 0; i < days; i++) {
            printStream.println("-------- day " + i + " --------");
            printStream.println("name, sellIn, quality");
            for (Item item : items) {
                printStream.println(item);
            }
            printStream.println();
            app.updateQuality();
        }
        return outputStream.toString();
    }

}
