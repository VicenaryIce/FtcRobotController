package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
@Disabled
public class RumbleTestingPratt extends OpMode {
    boolean currentA;
    boolean lastA;

    double endGameStart;

    boolean isEndGame = false  ;
    @Override
    public void init() {

    }
    public void start(){//A super method is the base of the start function.
        endGameStart = getRuntime()+90;

    }

    @Override
    public void loop() {
        currentA = gamepad1.a;
        if(currentA && !lastA){
            gamepad1.rumble(100);

        }
        if(endGameStart<=getRuntime() && !isEndGame){
            gamepad1.rumbleBlips(3);
            isEndGame =true;
        }

        lastA = currentA;

    }
}
