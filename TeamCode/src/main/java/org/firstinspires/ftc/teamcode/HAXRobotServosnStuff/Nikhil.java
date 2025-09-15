package org.firstinspires.ftc.teamcode.HAXRobotServosnStuff;

import androidx.appcompat.app.ActionBar;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
@Disabled
public class Nikhil extends OpMode {

    DcMotor slide;
    @Override
    public void init() {
        slide = hardwareMap.get(DcMotor.class, "slide");
        slide.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        slide.setDirection(DcMotorSimple.Direction.REVERSE);

    }

    @Override
    public void loop() {
        if (gamepad1.dpad_up){
            slide.setPower(0.5);
        }
        else if (gamepad1.dpad_down){
            slide.setPower(-0.5);
        }
        else{
            slide.setPower(0);
            }

    }
}
