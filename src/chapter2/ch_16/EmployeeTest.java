package chapter2.ch_16;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");

        System.out.println(employeeLee.getSerialNum());

  //      Employee employeeKim = new Employee();//
  //           employeeKim.setEmployeeName("김유신");
  //      employeeKim.serialNum++;

  //      System.out.println(employeeLee.serialNum);
  //      System.out.println(employeeKim.serialNum);
    }
}
