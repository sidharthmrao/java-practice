public class Carshop {
    

    public static class Car {
        String carModel;
        int makeYear;
        private static int carCount = 0;

        Car(String model, int year) {
            this.carModel = model;
            makeYear = year;
            System.out.println(this);
            carCount++;
        }

        String information() {
            return "This car's model is: "+ this.carModel + " and the car was manufactured in " + this.makeYear + ".";
        }
    }
    public static void main(String[] args) {
        Carshop.Car ferrari = new Carshop.Car("X1", 1976);
        Carshop.Car ford = new Carshop.Car("F150", 2000);
        Truck schoolbus = new Truck("YellowBus", 1920);
        System.out.println(ferrari.information());
        System.out.println(schoolbus.information());
        System.out.println("Number of cars: " + Carshop.Car.carCount);
    }
}

class Truck {
    String truckModel;
    int makeYear;

    Truck(String model, int year) {
        truckModel = model;
        makeYear = year;
    }

    String information() {
        return "This truck's model is: "+ truckModel + " and the truck was manufactured in " + makeYear + ".";
    }
}