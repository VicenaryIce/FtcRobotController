package org.firstinspires.ftc.teamcode;

public class Mathing {
    double num;
    public  Mathing(double num1){
        this.num = num1;
        //setting the global copy for the entire objects's num as the num1 we put in


    }
    public double addnum(double additive){
        double num2 = this.num;
        this.num = num2+ additive;
        return this.num;
    }
}
