package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class Tk extends OpMode {
    DcMotor frontLeft;
    DcMotor frontRight;
    DcMotor rearLeft;
    DcMotor rearRight;

    @Override
    public void init() {
        frontLeft=hardwareMap.get(DcMotor.class, "frontLeft");
        frontRight=hardwareMap.get(DcMotor.class, "frontRight");
        rearLeft=hardwareMap.get(DcMotor.class, "rearLeft");
        rearRight=hardwareMap.get(DcMotor.class, "rearRight");

        frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rearRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rearLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        rearRight.setDirection(DcMotorSimple.Direction.REVERSE);
        frontRight.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    @Override
    public void loop() {
        frontLeft.setPower(gamepad1.left_stick_y);
        rearLeft.setPower(gamepad1.left_stick_y);
        frontRight.setPower(gamepad1.right_stick_y);
        rearRight.setPower(gamepad1.right_stick_y);

    }
}
