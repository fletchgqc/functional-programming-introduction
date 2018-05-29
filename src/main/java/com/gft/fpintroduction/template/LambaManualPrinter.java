package com.gft.fpintroduction.template;

/**
 * Instructions: This class should provide an alternative solution to the template method. Modify the printManual()
 * method to receive and execute the printInternationalisedManual function.
 */
public class LambaManualPrinter {

    public void printManual() {
        printItemName();

        printCopyright();
    }

    private void printItemName() {
        System.out.println("ALLEMANSRÄTTEN");
    }

    private void printCopyright() {
        System.out.println("© IKEA 2018");
    }
}
