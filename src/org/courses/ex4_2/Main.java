package org.courses.ex4_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DOCHandler docHandler = new DOCHandler();
        TXTHandler txtHandler = new TXTHandler();
        XMLHandler xmlHandler = new XMLHandler();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter document's name with format:");
        String name  = scanner.next();

        switch (name){
            case ".xml":{
                xmlHandler.create();
                xmlHandler.open();
                xmlHandler.change();
                xmlHandler.save();
                break;
            }
            case ".txt":{
                txtHandler.create();
                txtHandler.open();
                txtHandler.change();
                txtHandler.save();
                break;
            }
            case ".doc":{
                docHandler.create();
                docHandler.open();
                docHandler.change();
                docHandler.save();
                break;
            }
            default:
                System.out.println("Incorrect format");
                break;
        }
    }
}
