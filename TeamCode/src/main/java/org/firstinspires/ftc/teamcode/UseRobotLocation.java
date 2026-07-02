package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class UseRobotLocation  extends OpMode {
    RobotLocationPractice robotLocationPractice = new RobotLocationPractice(0);
    //Making a new instance of this class, by pulling from the robotloaction practice file

    public void init(){
        robotLocationPractice.setAngle(0);

    }
    public void loop(){
        if (gamepad1.a){
            robotLocationPractice.turnbot(0.1);


        }
        else if (gamepad1.b) {
            robotLocationPractice.turnbot(0.1);


        }
        telemetry.addData("Heading",robotLocationPractice.getHeading());

    }
}

//Add a double get angle to your