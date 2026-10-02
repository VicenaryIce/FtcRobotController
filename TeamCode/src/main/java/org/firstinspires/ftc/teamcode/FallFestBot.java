package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp
public class FallFestBot extends OpMode {
    public DcMotor catapultMotor;
    public void init() {
        catapultMotor  = hardwareMap.get(DcMotor.class, "test");
        telemetry.addData("Status: ","Initialized");
    }
    @Override
    public void loop() {
        if(gamepad1.a){
            catapultMotor.setPower(-1);
        }
        else{
            catapultMotor.setPower(0);
        }

    }
}
