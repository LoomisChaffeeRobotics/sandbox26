package org.firstinspires.ftc.teamcode.PIDCrashCourses;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
@TeleOp
public class RUR_PID_Crash_Course extends OpMode {
    DcMotor pivot;
    double error = 0;
    double currentPosition = 0;
     double output = 0;
    public static int targetPosition = 1000;
    ElapsedTime timePassed;

    double integralSum = 0;
    double previousError = 0;
    double derivative = 0;

    public static double Kp = 0;
    public static double Ki = 0;
    public static double Kd = 0;

    @Override
    public void init() {
        pivot = hardwareMap.get(DcMotor.class, "pivot");
        timePassed = new ElapsedTime();
//        dashboard = FtcDashboard.getInstance();
//        telemetry = dashboard.getTelemetry();
    }

    @Override
    public void loop() {



        //position

        error = targetPosition - currentPosition;

        telemetry.addData("position", pivot.getCurrentPosition());
        telemetry.update();

        //testing if needs reverse
//        pivot.setPower(1)

        //integral calculation

        integralSum = (error * timePassed.seconds());

        //derivative calculation

        derivative = (error-previousError) / timePassed.seconds();

        previousError = error;

        output = (Kp * error) + (Ki * integralSum) + (Kd * derivative);

        pivot.setPower(output);

        timePassed.reset();
    }
}
