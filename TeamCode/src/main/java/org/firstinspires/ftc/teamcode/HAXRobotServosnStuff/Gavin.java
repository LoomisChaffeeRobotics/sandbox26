package org.firstinspires.ftc.teamcode.HAXRobotServosnStuff;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.PIDCoefficients;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class Gavin extends OpMode {
    DcMotor coil;
    Servo sv;

    @Override
    public void init(){
        coil = hardwareMap.get(DcMotor.class, "slide");
        coil.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        coil.setDirection(DcMotorSimple.Direction.REVERSE);

    }

    @Override
    public void loop(){
        if (gamepad1.dpad_up){
            coil.setPower(0.5);
        }
        else if (gamepad1.dpad_down){
            coil.setPower(-0.5);
        }
        else{
            coil.setPower(0);
        }
    }



}
