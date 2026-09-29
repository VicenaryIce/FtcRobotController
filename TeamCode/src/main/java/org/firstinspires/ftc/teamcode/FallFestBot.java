package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp
public class FallFestBot extends OpMode {
    private ElapsedTime runtime = new ElapsedTime();

    public DcMotor catapultMotor = null;
    public void init() {
        catapultMotor  = hardwareMap.get(DcMotor.class, "test");
        telemetry.addData("Status: ","Initialized");


    }
    @Override
    public void loop() {

    }
}
