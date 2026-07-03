package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.DriveTrainTest;
@TeleOp
@Disabled
public class DriveTrainImplementationTest  extends OpMode {
    DriveTrainTest driveTrain = new DriveTrainTest();
    public void init(){
        driveTrain.init(hardwareMap );
    }
    public void loop(){
        driveTrain.MecanumDrive(-gamepad1.left_stick_y, gamepad1.left_stick_x,gamepad1.right_stick_x);

    }

}
