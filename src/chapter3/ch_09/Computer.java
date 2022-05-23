package chapter3.ch_09;

public abstract class Computer {

    public abstract void display();
    public abstract void typing();

    public void turnOn(){
        System.out.println("전원을 켭니다");
    }

    void turnOff(){
        System.out.println("전원을 끕니다");
    }
}
