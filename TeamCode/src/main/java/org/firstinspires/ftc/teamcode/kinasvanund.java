package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class kinasvanund extends OpMode {
    DcMotor FL;
    DcMotor FR;
    DcMotor RL;
    DcMotor RR;
    @Override
    public void init() {
        FL = hardwareMap.get(DcMotor.class, "frontLeft");
        FR = hardwareMap.get(DcMotor.class, "frontRight");
        RL = hardwareMap.get(DcMotor.class, "rearLeft");
        RR = hardwareMap.get(DcMotor.class, "rearRight");

        FL.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        FR.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        RL.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        RR.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        FR.setDirection(DcMotorSimple.Direction.REVERSE);
        RR.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    @Override
    public void loop() {
        FL.setPower(gamepad1.left_stick_y);
        FR.setPower(gamepad1.right_stick_y);

    }
}
