package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        Car car1= new Car();
        //String brand, String model, String fuel
        Car car2= new Car("Toyota","Auris", "Gas" );

        System.out.println("Esta el tacometro a 0: "+car2.isTachometerEqualToZero());
        car2.start();
        System.out.println("Esta el tacometro a 0: "+car2.isTachometerEqualToZero());
        car2.start();
        car2.stop();
        System.out.println("Esta el tacometro a 0: "+car2.isTachometerEqualToZero());

        car2.start();
        car2.speedometer=2;
        car2.stop();

        car2.accelerate();


        for (int i= 0; i<12; i++){
            car2.accelerate();
        }

        car2.brake();

        for (int i= 0; i<12; i++){
            car2.brake();
        }
        car2.turnAngleOfWheels(20);
        car2.turnAngleOfWheels(20);
        car2.turnAngleOfWheels(20);
        car2.turnAngleOfWheels(20);

        car2.turnAngleOfWheels(-20);
        car2.turnAngleOfWheels(-20);
        car2.turnAngleOfWheels(-20);
        car2.turnAngleOfWheels(-20);
        car2.turnAngleOfWheels(-20);

        car2.turnAngleOfWheels(155);
        car2.turnAngleOfWheels(-2000);

        car2.stop();
        car2.setReverse(true);
        car2.setReverse(false);
        car2.start();
        for (int i= 0; i<6; i++){
            car2.accelerate();
        }
        car2.setReverse(true);

    }


}