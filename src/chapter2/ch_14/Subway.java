package chapter2.ch_14;

public class Subway {

    int luneNumber;
    int passengerCount;
    int money;

    public Subway(int lineNumber){
        this.luneNumber = lineNumber;
    }

    public void  take(int money){
        this.money += money;
        passengerCount++;
    }

    public void showSubinfo(){
        System.out.println(luneNumber + "번의 승객 수는 " + passengerCount + "명 이고, 수입은 " + money + "원입니다.");
    }
}
