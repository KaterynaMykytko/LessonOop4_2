package org.courses.ex4_2;

public class TXTHandler extends AbstractHandler {

    @Override
    public void open(){
        System.out.println("Open TXT document");
    }
    @Override
    public void create(){
        System.out.println("Create TXT document");
    };
    @Override
    public void change(){
        System.out.println("Change TXT document");
    };
    public void save(){
        System.out.println("Save TXT document");
    };
}
