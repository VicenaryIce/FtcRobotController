package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.DcMotor;
public class TestBench {
    //This is how we are giong to initialize all of the hardware on our robot in this config
    private DigitalChannel touchSensor;
    private DcMotor motor;
    private double ticksPerRev;
    public void init(HardwareMap hwMap){
        motor = hwMap.get(DcMotor.class,"motor");
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        ticksPerRev = motor.getMotorType().getTicksPerRev();
        motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        //Different run modes:
        //Run to possition: Attempts to run to the encoder tick that you selected
        //Run using encoder: Uses encoder to try and make it run at a certain velocity\
            //This gives the best chance for the motors to actually run at the same velocity
            //This can be good for drivetrains.
        //Runwithout encoder: Run at a certain power
        //Stop and reset encoder: stops and resets encoder during program running


        touchSensor = hwMap.get(DigitalChannel.class,"touch_sensor");
        //We called the touch sensor touch_sensor in our hardware configuration on the DS
        touchSensor.setMode(DigitalChannel.Mode.INPUT);//Setting the direction of the digital device
    }
    public boolean getTouchSensorState(){
        return !touchSensor.getState();
        //We are getting the value of the touch sensor.
    }
    public double sumTwo(double num1,double num2){
        return num1+num2;

    }
    public boolean isSensorReleased(){
        return touchSensor.getState();
        //Will be true if smth is not pressed, and false if it is being pressed
    }
    public void setMotorSpeed(double speed){

        motor.setPower(speed);
        //Cant I just do this in the thing
        //Make a drive train using this method.
    }
    public void setBrakeMode(DcMotor.ZeroPowerBehavior zerobehavior){
        motor.setZeroPowerBehavior(zerobehavior);

    }
    public double getMotorRevs(){
        
        return motor.getCurrentPosition() / ticksPerRev; //Can multiply by the gear ratio
        //Current position will returj the total number of ticks it has trave'ed
        //And the ticks per rev is how many ticks qualifies as a revolution
    }
    }

