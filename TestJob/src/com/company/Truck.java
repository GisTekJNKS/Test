package com.company;

/**
 * Created by John on 25.08.2015.
 */
public class Truck extends Automobile implements ICargoTransportation{

    private int cargoWeight;

    private final int maxCargoWeight = 15000;

    public Truck (String company,String model){
        this.company=company;
        this.model=model;
    }

    public void drive(){
        System.out.println("Truck "+this.company+" "+this.model+" move");
        transportCargo();
    }

    @Override
    public void setCargoWeight(int i) {
        cargoWeight=i;
        checkLoadedValue(cargoWeight);
    }

    @Override
    public int getCargoWeight() {
        return cargoWeight;
    }


    private void transportCargo() {
        System.out.println("Truck transports cargo "+getCargoWeight()+" kg");
    }

    private void checkLoadedValue (int i) {
        if (i > maxCargoWeight) {
            System.out.println("Sorry, but Truck can transports only " + maxCargoWeight + " kg. Return for remaining cargo");
            cargoWeight = maxCargoWeight;
        }
    }
}
