package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.*;
import com.qualcomm.robotcore.hardware.*;

/**
 * hi iit is Eliezer in 09
 */

@TeleOp(name="Part test", group="Test")
public class PartTest extends OpMode{

    /*
    Part declarations.
    Add parts here as we progress
    */

    // Top left, top right, bottom left, bottom right motors
    private DcMotor tl, tr, bl, br;

    // Runs given motor at 1 when cond is true
    private void testMotor(boolean cond, DcMotor dc) {
        if(cond) { dc.setPower(1); } else { dc.setPower(0); }
    }

    // Code to run after init is hit
    public void init(){

        /*
        Register all parts. Note that the string passed
        is what the phone looks for in its configuration
        to map software motors to their actual hardware motor
        */
        tl = hardwareMap.dcMotor.get("top_left_wheel");
        tr = hardwareMap.dcMotor.get("top_right_wheel");
        bl = hardwareMap.dcMotor.get("bottom_left_wheel");
        br = hardwareMap.dcMotor.get("bottom_right_wheel");

        // Note: motors spin clockwise by default


    }

    // Runs repeatedly
    public void loop(){
        // Check if buttons are being pressed and run motors
        testMotor(gamepad1.dpad_up, tl);
        testMotor(gamepad1.dpad_right, tr);
        testMotor(gamepad1.dpad_down, br);
        testMotor(gamepad1.dpad_left, bl);
    }
}
