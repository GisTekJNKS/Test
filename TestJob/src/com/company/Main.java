package com.company;

public class Main {

    public static void main(String[] args) {

        Van universalVan = new Van("FORD","model1");
        Automobile miniVan = new Van("Dodge","model2");
        ICargoTransportation cargoVan = new Van("GMC","model3");
        ITransportationOfPeople bus = new Van("Chevrolet","model4");

        SportCar rallyCar = new SportCar();
        Automobile car = new SportCar();

        Automobile truck = new Truck("Freightliner","1");
        Truck roadTrain = new Truck("Freightliner","2");


        universalVan.drive();
        universalVan.setCargoWeight(10000);
        universalVan.setNumberOfPassengers(30);
        universalVan.drive();
        universalVan.reverse();
        universalVan.park();
        cargoVan.drive();

        roadTrain.drive();
        roadTrain.setCargoWeight(60000);
        roadTrain.drive();
        roadTrain.reverse();
        roadTrain.park();
    }
}
