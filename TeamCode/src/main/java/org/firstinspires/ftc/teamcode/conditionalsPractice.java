package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class conditionalsPractice extends OpMode {
    public void init(){}
    public void loop(){
        double leftY = gamepad1.left_stick_y;
        boolean turbo = gamepad1.a;
        double power;
        if(leftY<0.1 && leftY>-0.1){
            power = 0;
            telemetry.addData("Deadzone","in deadzone");
        }
        else {
            if (turbo){
                power = leftY;
            }
            else{
                power = 0.5*leftY;
            }

        }
        telemetry.addData("Power",power);

    }
}
