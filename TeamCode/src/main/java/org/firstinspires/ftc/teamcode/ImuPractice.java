package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.mechanisms.TestBenchIMU;
import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;


public class ImuPractice extends OpMode {
    TestBenchIMU bench = new TestBenchIMU();
    @Override
    public void init() {


        bench.init(hardwareMap);
    }
    public void loop(){
        telemetry.addData("Heading", bench.getHeading());

    }



}
