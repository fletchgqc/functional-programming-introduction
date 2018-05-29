package com.gft.fpintroduction.template;

public abstract class IkeaManualPrinter {

    public void printManual() {
        printItemName();
        printInternationalisedInstructions();
        printCopyright();
    }

    private void printItemName() {
        System.out.println("ALLEMANSRÄTTEN");
    }

    abstract void printInternationalisedInstructions();

    private void printCopyright() {
        System.out.println("© IKEA 2018");
    }
}
