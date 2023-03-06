package dev.otash.designpatterns.creational.builder;

public interface RobotPlan {

    void setRobotHead(String head);

    void setRobotTorso(String torso);

    void setRobotArms(String arms);

    void setRobotLegs(String legs);
}
