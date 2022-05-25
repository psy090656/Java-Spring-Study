package chapter3.ch_15;

public interface Buy {

    void buy();

    default void order(){
        System.out.println("buy order");
    }
}
