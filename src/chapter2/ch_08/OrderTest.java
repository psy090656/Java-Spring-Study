package chapter2.ch_08;

public class OrderTest {

    public static void main(String[] args) {

        Order orderTomas = new Order();

        orderTomas.orderNumber = "202011020003";
        orderTomas.customerPhone = "01023450001";
        orderTomas.customerAddress = "서울시 강남구 역삼동 111-333";
        orderTomas.orderDate = "20201102";
        orderTomas.orderTime = "130258";
        orderTomas.price = 35000;
        orderTomas.menuNumber = "0003";

        orderTomas.ShowOrder();
    }
}
