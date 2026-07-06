package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.TestBenchDistance;

@TeleOp
@Disabled
public class Distance_test extends OpMode {
    TestBenchDistance bench = new TestBenchDistance();
    @Override
    public void init() {
        bench.init(hardwareMap);

    }

    @Override
    public void loop() {
        telemetry.addData("Distance",bench.getDistance());
        if(bench.getDistance() <10){
            telemetry.addLine("Too close!");//This is a basic print statement without a caption
        }

    }
}
