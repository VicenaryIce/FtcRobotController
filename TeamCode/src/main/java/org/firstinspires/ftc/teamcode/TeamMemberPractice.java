package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class TeamMemberPractice extends OpMode {
    boolean initDone;
    public void init(){
        telemetry.addData("Init",initDone);
        initDone = true;

    }

    public double squareInputWithSign(double input){
        //the input is a variable that you pass into the function
        double output = input*input;
        if(input<0){
            output +=1;
        }
        return output;
    }
    public void loop(){
        double yAxis = gamepad1.left_stick_y;
        telemetry.addData("Init",initDone);
        telemetry.addData("Left Stick Normal",yAxis);
        yAxis = squareInputWithSign(yAxis);
        telemetry.addData("Left Stick Modded",yAxis);

    }

}
//Members are variables in opmodes,
//Methods are functions in Java
//Declaring varaibles in a class itself makes it so that all methods have accesss to the variable
//This is why in some programs things are declared in the class part.
//Using methods that are outside of opModes.
//Void means that there is no return type