package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
@Disabled
public class Mathers extends OpMode {
    Mathing num = new Mathing(12);
    public void init(){


    }
    public void loop(){
        if (gamepad1.a){
            num.addnum(11);
            telemetry.addData(":Num",num.num);

        }

    }
}
