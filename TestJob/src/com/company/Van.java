package com.company;

/**
 * Created by John on 25.08.2015.
 */
public class Van extends Automobile implements ITransportationOfPeople,ICargoTransportation {

    private int cargoWeight;
    private int countOfPassengers;

    private final int maxCargoWeight = 7000;
    private final int maxCountOfPassenger = 20;

    public Van (String company,String model){
        this.company=company;
        this.model=model;
    }

    public void drive(){
        System.out.println("Van "+this.company+" "+this.model+" move");
        transportCargo();
        transportPeoples();
    }



    @Override
    public void setNumberOfPassengers(int i) {
        countOfPassengers=i;
        checkPassengersCount(countOfPassengers);
    }

    @Override
    public int getNumberOfPassengers() {
        return countOfPassengers;
    }

    @Override
    public void setCargoWeight(int i) {
        cargoWeight =i;
        checkLoadedValue(cargoWeight);
    }

    @Override
    public int getCargoWeight() {
        return cargoWeight;
    }


    private void transportCargo() {
        System.out.println("Van transports cargo. Weight="+getCargoWeight());
    }


    private void transportPeoples() {
        System.out.println("Van transports "+getNumberOfPassengers()+" people");
    }

    private void checkLoadedValue (int i){
        if (i>maxCargoWeight){
            System.out.println("Sorry, but Van can transports only "+maxCargoWeight+"kg. Return for remaining cargo");
            cargoWeight=maxCargoWeight;
        }
    }

    private void checkPassengersCount (int i){
        if (i>maxCountOfPassenger){
            System.out.println("Sorry, but Van can transports only "+maxCountOfPassenger+" people. Return for remaining peoples");
            countOfPassengers=maxCountOfPassenger;
        }
    }
}
