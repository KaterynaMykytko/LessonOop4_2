package org.courses.ex4_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter document's name with format:");
        String name = scanner.next();

        AbstractHandler documentHandler = null;

        switch (name) {
            case ".xml": {
                documentHandler = new XMLHandler();
                break;
            }
            case ".txt": {
                documentHandler = new TXTHandler();
                break;
            }
            case ".doc": {
                documentHandler = new DOCHandler();
                break;
            }
            default:
                System.out.println("Incorrect format");
                break;
        }
        if (documentHandler != null) {
            documentHandler.create();
            documentHandler.open();
            documentHandler.change();
            documentHandler.save();
        }
    }
}
