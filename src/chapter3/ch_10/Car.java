package chapter3.ch_10;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();
    public abstract void wiper();
    public void starCar(){
        System.out.println("�õ��� �մϴ�.");
    }

    public void turnOFf(){
        System.out.println("�õ��� ���ϴ�.");
    }
    public void washCar(){}
    final public void run(){
        starCar();
        drive();
        wiper();
        stop();
        turnOFf();
        washCar();
    }
}
