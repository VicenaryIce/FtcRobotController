package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class Varaible_practice extends OpMode {

    public void init(){
        int teamnum = 24090;
        String name = "Sid";
        telemetry.addData("Team Number",teamnum);
        telemetry.addData("Name: ",name);

    }
    public void loop(){


    }

}
