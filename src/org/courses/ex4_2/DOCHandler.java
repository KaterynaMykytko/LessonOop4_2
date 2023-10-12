package org.courses.ex4_2;

public class DOCHandler extends AbstractHandler {

    @Override
    public void open(){
        System.out.println("Open DOC document");
    }
    @Override
    public void create(){
        System.out.println("Create DOC document");
    };
    @Override
    public void change(){
        System.out.println("Change DOC document");
    };
    public void save(){
        System.out.println("Save DOC document");
    };

}
