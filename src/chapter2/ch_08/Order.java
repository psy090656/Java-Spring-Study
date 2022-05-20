package chapter2.ch_08;

public class Order {

    public String orderNumber;
    public String customerPhone;
    public String customerAddress;
    public String orderDate;
    public String orderTime;
    public int price;
    public String menuNumber;

    public void ShowOrder(){
        System.out.println("주문 접수 번호 : " + orderNumber);
        System.out.println("주문 핸드폰 번호 : " + customerPhone);
        System.out.println("주문 집 주소 : " + customerAddress);
        System.out.println("주문 날짜 : " + orderDate);
        System.out.println("주문 시간 : " + orderTime);
        System.out.println("주문 가격 : " + price);
        System.out.println("메뉴 번호 : " + menuNumber);
    }
}

