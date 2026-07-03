package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TestBench {
    private DigitalChannel touchSensor;
    public void init(HardwareMap hwMap){
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
    }

