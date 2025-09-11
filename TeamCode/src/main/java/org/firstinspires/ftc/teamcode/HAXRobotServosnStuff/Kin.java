package org.firstinspires.ftc.teamcode.HAXRobotServosnStuff;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class Kin extends OpMode{
    DcMotor slide;
    @Override
    public void init() {
        slide = hardwareMap.get(DcMotor.class, "slide");
        slide.setDirection(DcMotorSimple.Direction.REVERSE);
        slide.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    @Override
    public void loop() {
        slide.setPower(0);
        if(gamepad1.a) {
            slide.setPower(1);
        }
        else if(gamepad1.b){
            slide.setPower(-1);
        }
        else{
            slide.setPower(0);
        }
    }
}
