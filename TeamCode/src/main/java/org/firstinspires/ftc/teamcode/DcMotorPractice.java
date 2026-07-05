package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.mechanisms.TestBench;

@Disabled
@TeleOp
public class DcMotorPractice extends OpMode {
    TestBench bench = new TestBench();
    @Override
    public void init() {
        bench.init(hardwareMap);

    }

    @Override
    public void loop() {

        telemetry.addData("Revolutions",bench.getMotorRevs());
        if(gamepad1.a){
            bench.setBrakeMode(DcMotor.ZeroPowerBehavior.BRAKE);

        } else if (gamepad1.b) {
            bench.setBrakeMode(DcMotor.ZeroPowerBehavior.FLOAT);

        }

        if(!bench.isSensorReleased()){
            bench.setMotorSpeed(0.5);

        }
        else{
            bench.setMotorSpeed(0);
        }


    }
}
