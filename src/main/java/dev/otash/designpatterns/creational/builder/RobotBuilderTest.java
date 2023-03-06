package dev.otash.designpatterns.creational.builder;

public class RobotBuilderTest {
    public static void main(String[] args) {


        RobotBuilder oldStyle = new OldRobotBuilder();
        RobotEngineer engineer = new RobotEngineer(oldStyle);

        engineer.makeRobot();
        final Robot firstRobot = engineer.getRobot();


        System.out.println("Robot built");
        System.out.println(firstRobot);
    }
}
