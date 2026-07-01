package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class gamepadPractice extends OpMode {
    public void init(){

    }
    public void loop(){
        double diff = gamepad1.left_stick_x-gamepad1.right_stick_x;
        double speedForward = -gamepad1.left_stick_y/2;
        double sum_triggers = gamepad1.left_trigger+gamepad1.right_trigger;
        telemetry.addData("y",speedForward);
        telemetry.addData("A",gamepad1.left_stick_y);
        telemetry.addData("A button",gamepad1.a);
        telemetry.addData("diff",diff);
        telemetry.addData("sum",sum_triggers);

    }
}
