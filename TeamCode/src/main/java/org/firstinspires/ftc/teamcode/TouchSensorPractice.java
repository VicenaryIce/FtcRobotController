package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.mechanisms.TestBench;

public class TouchSensorPractice extends OpMode {
    TestBench touchsensor = new TestBench();
    @Override
    public void init() {
        touchsensor.init(hardwareMap);
        //we are calling the init function thing that we madein the mechanisms

    }

    @Override
    public void loop() {
        boolean state = touchsensor.getTouchSensorState();
        telemetry.addData("Sensor state",state);
        if(state){
            telemetry.addData("State","Pressed");

        }
        else{
            telemetry.addData("State","Not Pressed");
        }
        if(gamepad1.a){
            telemetry.addData("Summers",touchsensor.sumTwo(gamepad1.left_stick_x, gamepad1.left_trigger ));
        }

    }
}
