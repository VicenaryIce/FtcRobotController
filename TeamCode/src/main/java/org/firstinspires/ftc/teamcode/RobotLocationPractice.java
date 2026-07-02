package org.firstinspires.ftc.teamcode;

public class RobotLocationPractice {
    double angle;

    //Creating a constructor method
    public RobotLocationPractice(double angle){
        //User will pass an angle into the function, and then we'll do stuff
        this.angle = angle;

    }
    public double getHeading(){
        //This method normalizes robot heading between -180 and 180
        //This is useful for calcuating turn angles
        double angle=  this.angle; //Getting the raw angle
        //Usually this comes from the IMU

        while (angle>=180){
            angle -=360; //Subtract or add until target range
        }
        while(angle <=180){
            angle += 360;
        }
        return angle;
    }
    public void setAngle(double angle){
        this.angle = angle;
        //This way people can set whatever angle that they want to normalize
    }
    public double getAngle(){
        return this.angle;

    }
    public void turnbot(double angleChange){
        angle = angle+angleChange;
    }

}
