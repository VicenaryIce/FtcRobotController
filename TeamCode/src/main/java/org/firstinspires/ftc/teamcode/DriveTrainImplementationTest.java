package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.DriveTrainTest;
import org.firstinspires.ftc.teamcode.mechanisms.SlideTesting;
import org.firstinspires.ftc.teamcode.mechanisms.TestBench;
import org.firstinspires.ftc.teamcode.mechanisms.TestBenchDistance;

@TeleOp
@Disabled
public class DriveTrainImplementationTest  extends OpMode {
    DriveTrainTest driveTrain = new DriveTrainTest();
    TestBenchDistance distance_sensor = new TestBenchDistance();

    SlideTesting slideMotors = new SlideTesting();

    enum driveState{
        DRIVE,

        STOP
    }
    driveState state = driveState.DRIVE;
    public void init(){
        driveTrain.init(hardwareMap );
        distance_sensor.init(hardwareMap);
        slideMotors.init(hardwareMap);
        state = driveState.DRIVE;


    }
    public void loop(){


        //driveTrain.MecanumDrive(-gamepad1.left_stick_y, gamepad1.left_stick_x,gamepad1.right_stick_x);

        switch(state){
            case DRIVE:
                driveTrain.MecanumDrive(-gamepad1.left_stick_y, gamepad1.left_stick_x,gamepad1.right_stick_x);

                if (slideMotors.slideDone){
                    slideMotors.unSlide();


                }
                else{
                    slideMotors.slide();
                    
                }
                if (gamepad1.b){
                    slideMotors.slide();

                }
                if(gamepad1.b && slideMotors.slideDone){

                    slideMotors.unSlide();
                }

                if(distance_sensor.getDistance()<10){
                    state = driveState.STOP;
                }
                break;
            case STOP:
                driveTrain.Stop();
                if(gamepad1.a){
                    state = driveState.DRIVE;
                }


        }

    }

}
