package dev.otash.designpatterns.creational.builder.compact;

public class CompactRobotBuilderTest {
    public static void main(String[] args) {


        final Robot robot= Robot.builder().robotHead("Tin head").robotLegs("Roller Skates").robotTorso("Tin torso").robotArms("BlowTorch arms").robotTorso("").build();


        System.out.println(robot);
    }
}
