package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.Motorcont;

@TeleOp
@Disabled
public class MotorContPractice  extends OpMode {
    Motorcont motorist = new Motorcont();
    @Override
    public void init() {
        motorist.setPower(-1);

    }

    @Override
    public void loop() {

    }
}
