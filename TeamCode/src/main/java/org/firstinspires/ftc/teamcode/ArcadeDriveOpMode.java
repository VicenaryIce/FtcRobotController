package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.mechanisms.ArcadeDrive;

public class ArcadeDriveOpMode extends OpMode {
    ArcadeDrive drivetrain = new ArcadeDrive();
    public void init(){
        drivetrain.init(hardwareMap);

    }
    public void loop(){
        drivetrain.drive(-gamepad1.left_stick_y,gamepad1.left_stick_x);

    }
}
