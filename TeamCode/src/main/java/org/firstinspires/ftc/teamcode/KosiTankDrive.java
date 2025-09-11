package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp

public class KosiTankDrive extends OpMode {

    DcMotor front_left;
    DcMotor front_right;
    DcMotor back_left;
    DcMotor back_right;

    @Override
    public void init() {
        front_left = hardwareMap.get(DcMotor.class, "frontLeft");
        front_right = hardwareMap.get(DcMotor.class, "frontRight");
        back_left = hardwareMap.get(DcMotor.class, "backLeft");
        back_right = hardwareMap.get(DcMotor.class, "backRight");

        front_left.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        front_right.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        back_left.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        back_right.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        front_right.setDirection(DcMotorSimple.Direction.REVERSE);
        back_right.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    @Override
    public void loop() {
        front_left.setPower(gamepad1.left_stick_y);
        front_right.setPower(gamepad1.right_stick_y);

        back_left.setPower(gamepad1.left_stick_y);
        back_right.setPower(gamepad1.right_stick_y);

        telemetry.update();
    }
}
