package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.mechanisms.Motorcont;

@TeleOp
@Disabled
public class MotorContPractice  extends OpMode {
    Motorcont motorist = new Motorcont();
    @Override
    public void init() {
        motorist.init(hardwareMap);


    }

    @Override
    public void loop() {
        motorist.setPower(-gamepad1.left_stick_y);

    }
}
