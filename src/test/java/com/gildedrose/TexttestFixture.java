package com.gildedrose;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Item[] items = new Item[]{
            new Item("+5 Dexterity Vest", 10, 20), //
            new AgedBrie(2, 0),
            new Item("Elixir of the Mongoose", 5, 7), //
            new Sulfuras(0, 80),
            new Sulfuras(-1, 80),
            new BackstagePass(15, 20),
            new BackstagePass(10, 49),
            new BackstagePass(5, 49),
            // this conjured item does not work properly yet
            new Item("Conjured Mana Cake", 3, 6)};

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
            new Item("+5 Dexterity Vest", 10, 20), //
            new AgedBrie(2, 0),
            new Item("Elixir of the Mongoose", 5, 7), //
            new Sulfuras(0, 80),
            new Sulfuras(-1, 80),
            new BackstagePass(15, 20),
            new BackstagePass(10, 49),
            new BackstagePass(5, 49),
            // this conjured item does not work properly yet
            new Item("Conjured Mana Cake", 3, 6)};

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
