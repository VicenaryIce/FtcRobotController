package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.robotcore.external.ClassFactory;
import org.firstinspires.ftc.robotcore.external.hardware.camera.CameraName;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.vision.VisionPortal;
import org.firstinspires.ftc.vision.VisionPortal.CameraState;
import org.firstinspires.ftc.vision.apriltag.AprilTagDetection;
import org.firstinspires.ftc.vision.apriltag.AprilTagProcessor;

import java.util.List;


@TeleOp
@Disabled
public class RecreatingSwitchingCamerass  extends OpMode {
    private WebcamName webcam1,webcam2;

    private boolean oldleftbumper;
    private boolean oldrightbumper;
    private AprilTagProcessor apriltag;
    private VisionPortal visionPortal;

    public void init(){
        initapriltag();

    }

    @Override
    public void loop() {
        TelemetryAprilTag();
        switching();

    }
    private void initapriltag(){
        apriltag = new AprilTagProcessor.Builder().build();
        webcam1 = hardwareMap.get(WebcamName.class,"Cam 1");
        webcam2 = hardwareMap.get(WebcamName.class,"Cam 2");
        CameraName switchablecam = ClassFactory.getInstance().getCameraManager().nameForSwitchableCamera(webcam1,webcam2);
        visionPortal = new VisionPortal.Builder().setCamera(switchablecam).addProcessor(apriltag).build();

    }
    private void switching(){
        boolean newleftbumper = gamepad1.left_bumper;
        boolean newrightbumber = gamepad1.right_bumper;

        if(newleftbumper &&!oldleftbumper){
            visionPortal.setActiveCamera(webcam1);

        }
        if(newrightbumber && !oldrightbumper){
            visionPortal.setActiveCamera(webcam2);
        }
        oldrightbumper = newrightbumber;
        oldleftbumper = newleftbumper;


    }
    private void TelemetryAprilTag(){
        List<AprilTagDetection> currentDetections = apriltag.getDetections();

        if (currentDetections.size()>0){
            for(AprilTagDetection detection : currentDetections){
                if(detection.metadata !=null){

                    telemetry.addData("ID",detection.id);
                    telemetry.addData("Name",detection.metadata.name);

                }

            }
        }
        else{
            telemetry.addData("Status","None detected");
        }


    }
}
