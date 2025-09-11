package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp
public class Gavin extends OpMode{
    DcMotor ChLF;
    DcMotor ChLB;
    DcMotor ChRF;
    DcMotor ChRB;



    @Override
    public void init() {
        ChLF = hardwareMap.get(DcMotor.class, "frontLeft");
        ChLB = hardwareMap.get(DcMotor.class, "backLeft");
        ChRF = hardwareMap.get(DcMotor.class, "frontRight");
        ChRB = hardwareMap.get(DcMotor.class, "backRight");

        ChRF.setDirection(DcMotorSimple.Direction.REVERSE);
        ChRB.setDirection(DcMotorSimple.Direction.REVERSE);

        ChLF.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        ChLB.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        ChRF.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        ChRB.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

    }

    @Override
    public void loop() {
        ChLF.setPower(gamepad1.left_stick_y);
        ChLB.setPower(gamepad1.left_stick_y);
        ChRF.setPower(gamepad1.right_stick_y);
        ChRB.setPower(gamepad1.right_stick_y);
    }
}
