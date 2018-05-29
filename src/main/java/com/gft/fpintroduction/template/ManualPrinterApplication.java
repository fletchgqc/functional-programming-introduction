package com.gft.fpintroduction.template;

public class ManualPrinterApplication {

    public static void main(String[] args) {
        printUsingTemplateMethod();
        System.out.println("---------------");
        printUsingLambdaFunction();
    }

    private static void printUsingTemplateMethod() {
        System.out.println("English Instructions (with template method):");
        EnglishManualPrinter englishManualPrinter = new EnglishManualPrinter();
        englishManualPrinter.printManual();
        System.out.println();

        System.out.println("German Instructions (with template method):");
        GermanManualPrinter germanManualPrinter = new GermanManualPrinter();
        germanManualPrinter.printManual();
    }

    /**
     * Modifications to this method are required.
     */
    private static void printUsingLambdaFunction() {
        LambaManualPrinter lambaManualPrinter = new LambaManualPrinter();

        System.out.println("English Instructions (with lambda function):");

        System.out.println();

        System.out.println("German Instructions (with lambda function):");
    }
}
