package Visitor;

public class VisitorPattern {
    public static void main(String[] args) {
            EggRobot eggRobot = new EggRobot();
            eggRobot.calc();
            Visitor updatePack = new UpdateVisitor();
            eggRobot.accept(updatePack);
            eggRobot.calc();
    }
}
