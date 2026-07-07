package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class SlideTesting {

    private DcMotor slideMotorLeft;
    private DcMotor slideMotorRight;
    public boolean  slideDone = false;


    public void init(HardwareMap hwMap){
        slideMotorLeft = hwMap.get(DcMotor.class,"slideMotorLeft");
        slideMotorRight = hwMap.get(DcMotor.class,"slideMotorRight");

        slideMotorLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        slideMotorRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

    }
    public void slide(){
        slideMotorRight.setTargetPosition(1500);
        slideMotorLeft.setTargetPosition(1500);

        slideMotorLeft.setPower(0.5);
        slideMotorRight.setPower(0.5);
        slideDone = true;

    }
    public void unSlide(){
        slideMotorRight.setTargetPosition(0);
        slideMotorLeft.setTargetPosition(0);

        slideMotorLeft.setPower(-0.5);
        slideMotorRight.setPower(-0.5);
        slideDone=false;

    }
}
