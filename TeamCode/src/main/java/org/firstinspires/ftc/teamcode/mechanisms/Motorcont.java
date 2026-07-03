package org.firstinspires.ftc.teamcode.mechanisms;

public class Motorcont {
    double power;


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

    }

}
