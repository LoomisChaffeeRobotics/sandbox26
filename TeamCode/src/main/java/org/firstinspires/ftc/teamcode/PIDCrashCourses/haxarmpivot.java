package org.firstinspires.ftc.teamcode.PIDCrashCourses;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class haxarmpivot extends OpMode {
    DcMotor arm;
    double curPos;
    double target;
    double eCur, ePrev;
    double kP, kI, kD;
    double P, I, D;
    double eInt, eDev;
    double armMax;
    @Override
    public void init() {
        arm = hardwareMap.get(DcMotor.class,"pivot");
        //telemetry.addData("enc", arm.getCurrentPosition());
    }

    @Override
    public void loop() {
        curPos = arm.getCurrentPosition();

        

        telemetry.addData("enc", curPos);
    }
}
