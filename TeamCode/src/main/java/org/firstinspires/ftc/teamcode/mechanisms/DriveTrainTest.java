package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
//This is my own opmode for mecanum drive!!!!!!!!!!!!!
public class DriveTrainTest {
    private DcMotor frontLeft;
    private DcMotor frontRight;
    private DcMotor backLeft;
    private DcMotor backRight;
//This is creating the motors.
    public void init(HardwareMap hwMap){
        frontLeft = hwMap.get(DcMotor.class,"Front Left Motor");
        frontRight = hwMap.get(DcMotor.class,"Front Right Motor");
        backLeft = hwMap.get(DcMotor.class,"Back Left Motor");
        backRight = hwMap.get(DcMotor.class,"Back Right Motor");
        frontLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        backLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        frontRight.setDirection(DcMotorSimple.Direction.FORWARD);
        backRight.setDirection(DcMotorSimple.Direction.FORWARD);
    }
    public void MecanumDrive(double forward,double strafe,double rotation){
        double FL_power = forward+strafe+rotation;
        double FR_power = forward-strafe-rotation;
        double BL_power = forward - strafe +rotation;
        double BR_power = forward +strafe-rotation;

        frontLeft.setPower(FL_power);
        frontRight.setPower(FR_power);
        backLeft.setPower(BL_power);
        backRight.setPower(BR_power);

    }



}
