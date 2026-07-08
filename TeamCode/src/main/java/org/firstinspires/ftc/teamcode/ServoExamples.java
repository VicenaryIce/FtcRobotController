package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.TestBenchServo;

@TeleOp
@Disabled
public class ServoExamples extends OpMode {
    TestBenchServo servos = new TestBenchServo();
    double leftTrigger,rightTrigger;

    public void init(){
        servos.init(hardwareMap);
        leftTrigger  = 0.0;
        rightTrigger = 0.0;



    }
    public void loop(){
        leftTrigger=  gamepad1.left_trigger;
        rightTrigger = gamepad1.right_trigger;

        if(gamepad1.a){

            servos.setServoPos(leftTrigger);
        }
        else{
            servos.setServoPos(0);
        }
        if (gamepad1.b){
            servos.setServoRot(rightTrigger);
        }
        else{
            servos.setServoRot(0);
        }
    }

}
