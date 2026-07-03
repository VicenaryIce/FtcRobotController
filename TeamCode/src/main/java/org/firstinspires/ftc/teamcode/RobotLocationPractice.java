package org.firstinspires.ftc.teamcode;

public class RobotLocationPractice {
    double angle;

    //Creating a constructor method
    public RobotLocationPractice(double angle1){
        //User will pass an angle into the function, and then we'll do stuff
        this.angle = angle1;
        //Declaring that this class's angle varialbe is the angle that the user passed in

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
    public void setAngle(double angle1){
        this.angle = angle1;
        //This way people can set whatever angle that they want to normalize
    }
    public double getAngle(){
        return angle;

    }
    public void turnbot(double angleChange){
        //The reason that we dont use THIS is because there is no other instance of angle that is disputing which angle we're talking about.
        angle = angle+angleChange;
    }

}
