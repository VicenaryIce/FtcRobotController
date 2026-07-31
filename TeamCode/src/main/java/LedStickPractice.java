import android.graphics.Color;

import com.qualcomm.hardware.sparkfun.SparkFunLEDStick;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp@Disabled
public class LedStickPractice extends OpMode {

    private SparkFunLEDStick ledStick;
    private boolean wasUp;
    private boolean wasDown;
    private static final double END_GAME = 120-30;

    private int brightness = 5;
    public void init(){
        ledStick = hardwareMap.get(SparkFunLEDStick.class,"back leds");
        ledStick.setBrightness(brightness);
        ledStick.setColor(Color.GREEN);

    }
    public void start(){
        resetRuntime();
    }
    public void loop(){
        if (getRuntime() > END_GAME){

            int[] ledColors = { Color.RED,Color.BLUE};
            ledStick.setColors(ledColors);
        }//This means if the thing match is over basically/endgame is starting
        else if (gamepad1.a) {
            ledStick.setColor(Color.BLUE);
        } else if (gamepad1.b) {
            ledStick.setColor(Color.RED);
        } else if (gamepad1.left_bumper) {
            ledStick.turnAllOff();
        } else {
            ledStick.setColor(Color.GREEN);
        }

    }



}
