package dev.otash.designpatterns.creational.builder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Robot implements RobotPlan {

    private String robotHead;
    private String robotTorso;
    private String robotArms;
    private String robotLegs;


}
