package org.firstinspires.ftc.teamcode.PIDCrashCourses;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class RUR_PID_Crash_Course extends OpMode {

    DcMotor pivot;
    double error;

    @Override
    public void init() {
        pivot = hardwareMap.get(DcMotor.class, "pivot");
    }

    @Override
    public void loop() {

        telemetry.addData("position", pivot.getCurrentPosition());
        telemetry.update();

        //position
    }
}
