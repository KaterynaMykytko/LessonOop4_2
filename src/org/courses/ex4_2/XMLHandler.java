package org.courses.ex4_2;

public class XMLHandler extends AbstractHandler {

    @Override
    public void open(){
        System.out.println("Open XML document");
    }
    @Override
    public void create(){
        System.out.println("Create XML document");
    };
    @Override
    public void change(){
        System.out.println("Change XML document");
    };
    public void save(){
        System.out.println("Save XML document");
    };
}
