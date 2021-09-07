package Decoretor;

public class DecoratorPattern {
    public static void main(String[] args) {
        new RobotDecorator(new FirstRobot()).doMorething();
    }
}
