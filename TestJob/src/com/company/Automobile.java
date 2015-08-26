package com.company;

/**
 * Created by John on 25.08.2015.
 */
public abstract class Automobile{

    protected String company;
    protected String model;

    public abstract void drive();

    public void park(){
        System.out.println("Automobile park");
    }

    public void reverse (){
        System.out.println("Automobile reverse");
    }

}
