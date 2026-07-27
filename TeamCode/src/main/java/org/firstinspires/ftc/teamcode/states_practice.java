package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.DriveTrainTest;
import org.firstinspires.ftc.teamcode.mechanisms.SlideTesting;

@TeleOp
public class states_practice extends OpMode {
    DriveTrainTest drivetrain = new DriveTrainTest();

    SlideTesting slides = new SlideTesting();
    State driveState = State.stop;
    boolean lastA;
    boolean lastB;
    enum State{
        stop,
        drive,
    }

    public void init(){
        drivetrain.init(hardwareMap);
        State driveState = State.stop;
        slides.init(hardwareMap);


    }
    public void loop(){
        boolean currentA = gamepad1.a;
        boolean currentB = gamepad1.b;

        switch(driveState){

            case stop:
                drivetrain.MecanumDrive(0,0,0);
                if(currentA && !lastA){
                    driveState=State.drive;

                }





               break;
            case drive:
                drivetrain.MecanumDrive(gamepad1.left_stick_y,gamepad1.left_stick_x,gamepad1.right_stick_x);
                if(currentA &&!lastA){

                    driveState = State.stop;
                }
                break;
        }
        if (currentB && !lastB) {
            if (slides.slideDone) {
                slides.unSlide();
            }
            else {

                slides.slide();
            }
        }

        lastA = currentA;
        lastB = currentB;


    }


}
