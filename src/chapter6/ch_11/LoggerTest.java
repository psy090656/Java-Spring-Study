package chapter6.ch_11;

public class LoggerTest {

    public static void main(String[] args) {

        MyLogger myLogger = MyLogger.getLogger();

        myLogger.log("test");
    }
}
