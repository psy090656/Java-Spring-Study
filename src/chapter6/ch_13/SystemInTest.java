package chapter6.ch_13;
import java.io.IOException;

public class SystemInTest {

    public static void main(String[] args) {
        System.out.println("���ĺ� ���� ���� ���� [Enter]�� ��������");

        int i;
        try {
            while( (i = System.in.read()) != '\n' ) {
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
