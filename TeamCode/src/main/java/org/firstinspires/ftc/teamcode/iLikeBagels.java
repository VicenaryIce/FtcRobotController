
package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.hardware.camera.BuiltinCameraDirection;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.vision.VisionPortal;
import org.firstinspires.ftc.vision.apriltag.AprilTagDetection;
import org.firstinspires.ftc.vision.apriltag.AprilTagProcessor;

@TeleOp(name = "Basic",group = "OpMode")

public class iLikeBagels extends OpMode {
    private ElapsedTime runtime = new ElapsedTime();

    private DcMotor frontLeftDrive = null;
    private DcMotor frontRightDrive = null;
    private DcMotor backLeftDrive = null;
    private DcMotor backRightDrive = null;
    private AprilTagProcessor aprilTag;

    private VisionPortal visionPortal;
    private static final boolean USE_WEBCAM = true;
    public void init(){
        frontLeftDrive  = hardwareMap.get(DcMotor.class, "left_drive");
        frontRightDrive  = hardwareMap.get(DcMotor.class, "right_drive");
        backLeftDrive  = hardwareMap.get(DcMotor.class, "backleft_drive");
        backRightDrive  = hardwareMap.get(DcMotor.class, "backright_drive");
        frontLeftDrive.setDirection(DcMotor.Direction.REVERSE);
        backLeftDrive.setDirection(DcMotor.Direction.REVERSE);
        frontRightDrive.setDirection(DcMotor.Direction.FORWARD);
        backRightDrive.setDirection(DcMotor.Direction.FORWARD);

    }
    public void init_loop(){

    }
    public void start(){
        runtime.reset();
    }
    public void loop(){
        double max;
        double axial = -gamepad1.left_stick_y;
        double lateral = gamepad1.left_stick_x;
        double yaw = gamepad1.right_stick_x;
        double frontleftpower = axial + lateral+yaw;
        double backleftpower =  axial -lateral +yaw;
        double frontrightpower = axial - lateral-yaw;
        double backrightpower = axial +lateral -yaw;
        max = Math.max(Math.abs(frontleftpower),Math.abs(frontrightpower));
        max = Math.max(Math.abs(max),Math.abs(backleftpower));
        max = Math.max(Math.abs(max),Math.abs(backrightpower));
        if (max >1.0){
            frontleftpower /=max;
            frontrightpower /=max;
            backleftpower /=max;
            backrightpower /= max;
        }
        frontLeftDrive.setPower(frontleftpower);
        frontRightDrive.setPower(frontrightpower);
        backLeftDrive.setPower(backleftpower);
        backRightDrive.setPower(backrightpower);
    }
    public void stop(){
    }
    public void initAprilTag(){
        aprilTag = new AprilTagProcessor.Builder().build();
        VisionPortal.Builder builder = new VisionPortal.Builder();
        if(USE_WEBCAM){
            builder.setCamera(hardwareMap.get(WebcamName.class,"name"));
        } else{
            builder.setCamera(BuiltinCameraDirection.BACK);
        }
        builder.addProcessor(aprilTag);
        visionPortal = builder.build();
        builder.enableLiveView(true;
        builder.setAutoStopLiveView(false);

    }
    public void telemetryAprilTag(){
        List<AprilTagDetection> detections = aprilTag.getDetections();
        if
    }






}
//everything needs to go in the class.
//telemetry.adddata is the same thing as printing i think

