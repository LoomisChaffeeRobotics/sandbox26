package org.firstinspires.ftc.teamcode.HAXRobotServosnStuff;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class Tk extends OpMode {
DcMotor frontLeft;


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
