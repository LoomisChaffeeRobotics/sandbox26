package org.firstinspires.ftc.teamcode.HAXRobotServosnStuff;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;


@TeleOp
public class KosiSlide extends OpMode {

    DcMotor slide;

    @Override
    public void init() {
        slide = hardwareMap.get(DcMotor.class, "slide");

        slide.setDirection(DcMotorSimple.Direction.REVERSE);
        slide.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }
    @Override
    public void loop() {
        if (gamepad1.dpad_up) {
            slide.setPower(1.0);
        }
        else if (gamepad1.dpad_down) {
            slide.setPower(-1.0);
        }
        else {
            slide.setPower(0);
        }
    }
}
