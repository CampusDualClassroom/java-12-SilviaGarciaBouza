package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer=0;
    public int tachometer=0;
    public String gear="N";
    public boolean reverse= false;
    public int wheelsAngle =0;

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }
    public Car(){}

    public void start(){
        if(this.tachometer == 0){
            this.tachometer = 1000;
            System.out.println("Vehiculo acendido");

        }else{
            System.out.println("O vehiculo xa esta acendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0) {
            this.tachometer = 0;
            System.out.println("Vehiculo apagado");
        } else {
            System.out.println("Non se pode apagar o vehiculo");
        }
    }
    public void accelerate(){

        if(this.isTachometerGreaterThanZero() && (this.speedometer+10)<=this.MAX_SPEED){
            speedometer+=10;
            System.out.println("Velocidad del coche:"+this.speedometer);
        }else if(this.isTachometerGreaterThanZero() && this.speedometer<this.MAX_SPEED){
            speedometer=120;
            System.out.println("Velocidad del coche:"+this.speedometer);
        }

        else {
            System.out.println("No se puede acelerar porque ya esta la velocidad maxima de 120");
        }
        }
    public void brake(){

       if(this.isTachometerGreaterThanZero() &&this.speedometer-10>=0) {
           speedometer-=10;
           System.out.println("Velocidad del coche:"+this.speedometer);
       }

        else if(this.isTachometerGreaterThanZero() && this.speedometer>0){
           speedometer=0;
            System.out.println("No se puede disminuir 10 porque serria menos a 0. Velocidad:"+this.speedometer);
        }

        else {
            System.out.println("No se puede desacelerar porque ya esta la velocidad ya es 0");
        }


    }
    public void turnAngleOfWheels(int angle){

        if(this.wheelsAngle+angle>45){
            this.wheelsAngle=45;
            System.out.println("El volante no puede girar mas de 45");
        }else if(this.wheelsAngle+angle<-45) {
            this.wheelsAngle = -45;
            System.out.println("El volante no puede girar menos de -45");
        } else{
            //(this.wheelsAngle+angle<=45 && this.wheelsAngle+angle>=-45){
                this.wheelsAngle+=angle ;
        }

        System.out.println("Grados del volante: "+this.wheelsAngle);
    }





    public boolean isReverse(){
        return false;
    }
    public void setReverse(boolean reverse){
        if(!this.isReverse()&& this.speedometer>0) {
            System.out.println("No se puede poner marcha atras");
        }else {
            this.reverse = reverse;
            this.gear="R";
        }
        System.out.println("Esta puesta marcha atras: "+(this.reverse? "si":"no"));
    }



public boolean isTachometerGreaterThanZero(){
        return this.tachometer > 0 ? true : false;
}
public boolean isTachometerEqualToZero(){
    return this.tachometer == 0 ? true : false;

}


}
