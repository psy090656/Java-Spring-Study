package chapter6.ch_01;

class Outer2{
    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(final int i){

        final int num = 10;

        class MyRunnable implements Runnable{

            int localNum = 1000;
            @Override
            public void run() {
                //num = 200;   //에러 남
                //i = 10;      //에러 남
                System.out.println(i);
                System.out.println(num);
            }
        }
        return new MyRunnable();
    }
}

public class AnonymousInnerTest {

    public static void main(String[] args) {

        Outer2 out = new Outer2();
        Runnable runner = out.getRunnable(100);

        runner.run();
    }
}
