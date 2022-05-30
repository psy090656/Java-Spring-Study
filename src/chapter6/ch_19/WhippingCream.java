package chapter6.ch_19;

public class WhippingCream extends Decorator{

    public WhippingCream(Coffee coffee) {
        super(coffee);
    }

    public void brewing(){
        super.brewing();
        System.out.println("Adding Whipping Cream");
    }
}
