package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
@Disabled
@Autonomous
public class StateIntegerPracticeShiiJsGotSerious extends OpMode {

    int state = 0;

    enum Stater{
        WAIT_FOR_A,
        WAIT_FOR_B,
        WAIT_FOR_X,
        FINISHED
    }
    Stater goodlyState = Stater.WAIT_FOR_A;

    @Override
    public void init() {
        goodlyState = Stater.WAIT_FOR_A;

    }
    public void loop(){
        telemetry.addData("State",state);
        //Now we have to tell the computer how to break out of each state we're gonna have
        /*switch(state){//In a switch statement for EACH state case you can also put what you want the robot to do .
            case 0://If the state is 0
                telemetry.addLine("To exit, press A");
                if (gamepad1.a){
                    state = 1;
                }
                break; //This will break out of the entire state
            case 1:
                telemetry.addLine("To exit, press B");
                if (gamepad1.b){
                    state = 2;
                }
                break;
            case 2:
                if(gamepad1.x){
                    state = 3;
                }
                break;
            default://The default state
                telemetry.addLine("Auto state machine finished");

        }*/
        switch(goodlyState){
            case WAIT_FOR_A:
                if ( gamepad1.a){
                    goodlyState = Stater.WAIT_FOR_B;
                }

            case WAIT_FOR_B:
                if ( gamepad1.b){
                    goodlyState = Stater.WAIT_FOR_X;
                }

            case WAIT_FOR_X:
                if ( gamepad1.x){
                    goodlyState = Stater.FINISHED;
                }
            default:

        }

    }
}
