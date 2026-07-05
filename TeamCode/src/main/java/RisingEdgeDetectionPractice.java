import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
@Disabled
public class RisingEdgeDetectionPractice extends OpMode {

    boolean currentA;
    boolean previousA;
    public void init() {

    }

    @Override
    public void loop() {
        currentA = gamepad1.a;

        if(currentA && !previousA){
            telemetry.addData("Strings","I hope I will add this just once");
        }
        previousA=currentA;



    }
}
