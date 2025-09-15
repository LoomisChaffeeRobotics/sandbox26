package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class Nikhil extends OpMode {
    DcMotor ChLF;
    DcMotor ChBr;
    DcMotor ChBl;
    DcMotor ChFr;
    @Override
    public void init() {
        ChLF=hardwareMap.get(DcMotor.class, "frontLeft");
        ChBr=hardwareMap.get(DcMotor.class, "backRight");
        ChFr=hardwareMap.get(DcMotor.class, "frontRight");
        ChBl=hardwareMap.get(DcMotor.class, "backLeft");

        ChFr.setDirection(DcMotor.Direction.REVERSE);
        ChBr.setDirection(DcMotor.Direction.REVERSE);

        ChLF.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        ChBr.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        ChFr.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        ChBl.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);




    }

    @Override
    public void loop() {
        ChLF.setPower(gamepad1.left_stick_y);
        ChFr.setPower(gamepad1.right_stick_y);
        ChBr.setPower(gamepad1.right_stick_y);
        ChBl.setPower(gamepad1.left_stick_y);



    }
}
