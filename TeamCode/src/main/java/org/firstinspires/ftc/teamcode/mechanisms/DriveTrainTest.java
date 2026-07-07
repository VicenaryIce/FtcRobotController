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
    TestBenchDistance distance_sensor  = new TestBenchDistance();
    TestBench touchsensor = new TestBench();
//This is creating the motors.
    //Here is where I want to pull in a lot of things to make a "functional" robot controller
    public void init(HardwareMap hwMap){
        distance_sensor.init(hwMap);
        touchsensor.initastouch(hwMap);
        frontLeft = hwMap.get(DcMotor.class,"Front Left Motor");
        frontRight = hwMap.get(DcMotor.class,"Front Right Motor");
        backLeft = hwMap.get(DcMotor.class,"Back Left Motor");
        backRight = hwMap.get(DcMotor.class,"Back Right Motor");
        frontLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        backLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        frontRight.setDirection(DcMotorSimple.Direction.FORWARD);
        backRight.setDirection(DcMotorSimple.Direction.FORWARD);
        frontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        backLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        backRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
    }
    public void MecanumDrive(double forward,double strafe,double rotation){
        double FL_power = forward+strafe+rotation;
        double FR_power = forward-strafe-rotation;
        double BL_power = forward - strafe +rotation;
        double BR_power = forward +strafe-rotation;
        frontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        backLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        backRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);

        frontLeft.setPower(FL_power);
        frontRight.setPower(FR_power);
        backLeft.setPower(BL_power);
        backRight.setPower(BR_power);

    }
    public void Stop(){
        frontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        frontLeft.setPower(0);
        frontRight.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);
    }



}
