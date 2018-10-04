public class Car {
    int wheels;
    int windows;
    double mpg;
    double fuelCapacity;
    double maxRange;
    String brand;

    Car(){}
    /*Car(int wheels, int windows, double mpg, String brand){
        this.wheels = wheels;
        this.windows = windows;
        this.mpg = mpg;
        this.brand = brand;
    }*/

    Car(int wheels, int windows, double maxRange, double fuelCapacity, String brand){
        this.wheels = wheels;
        this.windows = windows;
        this.maxRange = maxRange;
        this.fuelCapacity = fuelCapacity;
        this.mpg = computeMpg(fuelCapacity, maxRange);
        this.brand = brand;
    }

    public void output(){
        System.out.println("The number of wheels is: " + wheels);
        System.out.println("The number of windows is: " + windows);
        System.out.println("The mpg is: " + mpg);
        System.out.println("The brand is: " + brand);
        System.out.println("The max range of the car is: " + maxRange);
    }

    public double computeMpg(double fuel, double range){
       return range / fuel;
    }



}
