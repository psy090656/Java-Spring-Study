package chapter8.ch_06.test;

import chapter8.ch_06.maze.Robot;

public class MazeTest {

    public static void main(String[] args) {

        Robot robot;
        System.out.println("�ⱸ�� �Դϴ�. (7,7)");

        robot = new Robot();

        robot.findPath( 0,0, 7,7);
        robot.showPath();

    }
}

