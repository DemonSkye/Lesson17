public class Lesson17 {
    public static void main(String args[]){
        //An object is a thing that holds stuff.
        Car Accord = new Car();
        Accord.brand = "honda";
        Accord.mpg = 25.0;
        Accord.wheels = 4;
        Accord.windows = 4;

        Car Sonata = new Car(4,4,450.0,15.0,"Hyundai");

        Accord.output();
        System.out.println();
        Sonata.output();
    }
}
