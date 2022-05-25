package chapter3.ch_15;

public interface Sell {

    void sell();

    default void order(){
        System.out.println("sell order");
    }
}
