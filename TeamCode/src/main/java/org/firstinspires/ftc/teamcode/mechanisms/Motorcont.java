package org.firstinspires.ftc.teamcode.mechanisms;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Motorcont {
    double power;
    private DcMotor Motor;
    public void init(HardwareMap hwmap){
        Motor = hwmap.get(DcMotor.class,"DC Motor");
        Motor.setDirection(DcMotorSimple.Direction.FORWARD);
    }


    public double getPower(){
        return this.power;
    }
    public void setPower(double newpower){
        if (newpower<-1.0){
            power = Math.max(newpower,-1.0);



        }
        else if (newpower>1.0) {
            power = Math.min(newpower,1.0);

        }
        else{
            power = newpower;
        }
        Motor.setPower(power);

    }

}
