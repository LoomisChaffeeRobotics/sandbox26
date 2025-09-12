package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class Formatting extends OpMode {
    DcMotor a;
    @Override
    public void init() {
        a = hardwareMap.get(DcMotor.class,"a");

    }

    @Override
    public void loop() {

    }
}
