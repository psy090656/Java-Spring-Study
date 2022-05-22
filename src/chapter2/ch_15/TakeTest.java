package chapter2.ch_15;

public class TakeTest {

    public static void main(String[] args) {

        Student studentE = new Student("Edward", 20000);
        Taxi wellTaxi = new Taxi("잘 간다 운수");
        studentE.takeTaxi(wellTaxi);

        studentE.showInfo();
        wellTaxi.showTaxiInfo();
    }
}
