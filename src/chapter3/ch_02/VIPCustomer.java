package chapter3.ch_02;

public class VIPCustomer extends Customer{


    double salesRatio;
    String agentID;

    public VIPCustomer(){
        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
    }

    public String getAgentID(){
        return agentID;
    }
}
