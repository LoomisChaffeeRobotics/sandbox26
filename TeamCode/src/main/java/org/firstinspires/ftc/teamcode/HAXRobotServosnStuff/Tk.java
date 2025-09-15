package org.firstinspires.ftc.teamcode.HAXRobotServosnStuff;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class Tk extends OpMode {
DcMotor frontLeft;
Servo happyman;


    @Override
    public void init() {
        frontLeft=hardwareMap.get(DcMotor.class, "slide");
        frontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontLeft.setDirection(DcMotorSimple.Direction.REVERSE);


    }

    @Override
    public void loop() {
        if (gamepad1.dpad_up) {
            frontLeft.setPower(1);
        }
        else if(gamepad1.dpad_down){
            frontLeft.setPower(-1);
        }
        else {
            frontLeft.setPower(0);
        }
    }

}
