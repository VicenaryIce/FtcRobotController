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
    public void convertToField(double forward, double right, double  rotate){
        double theta = Math.atan2(forward,right);
        double hypot = Math.hypot(right,forward);

        double angle = AngleUnit.normalizeRadians(theta - bench.getHeading());

        double newforward = hypot * Math.sin(angle);
        double newright = hypot * Math.cos(angle);

    }

}
