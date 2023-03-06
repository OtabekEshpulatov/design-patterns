package dev.otash.designpatterns.creational.builder.compact;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Robot {
    private String robotHead;
    private String robotTorso;
    private String robotArms;
    private String robotLegs;


    public static RobotBuilder builder() {
        return new RobotBuilder();
    }

    public static class RobotBuilder {
        private String robotHead;
        private String robotTorso;
        private String robotArms;
        private String robotLegs;


        public RobotBuilder robotHead(String head) {
            this.robotHead = head;
            return this;
        }

        public RobotBuilder robotTorso(String torso) {
            this.robotTorso = torso;
            return this;
        }

        public RobotBuilder robotArms(String arms) {
            this.robotArms = arms;
            return this;
        }

        public RobotBuilder robotLegs(String legs) {
            this.robotLegs = legs;
            return this;
        }


        public Robot build() {
            return new Robot(this.robotHead , this.robotTorso , this.robotArms , this.robotLegs);
        }
    }

}
