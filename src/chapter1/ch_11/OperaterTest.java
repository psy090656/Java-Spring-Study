package chapter1.ch_11;

public class OperaterTest {
    public static void main(String[] args) {

        int gameScore = 150;
        int lastScore = gameScore++;    // gameScore += 1;  gameScore = gameScore+1;

        System.out.println(lastScore);
        System.out.println(gameScore);
    }
}
