package org.firstinspires.ftc.teamcode.PIDCrashCourses;



import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.robotcore.external.Telemetry;

@TeleOp
@Config
public class haxarmpivot extends OpMode {
    DcMotor arm;
    double curPos;
    double target = 0;
    double eCur, ePrev;
    public static double kP = 0.01;
    public static double kI = 0;
    public static double kD = 0;
    double P, I, D;
    double eInt, eDev;
    double armMax = 343;

    double iMax = 0.25;

    double iRange = 0.5;
    boolean first = true;
    FtcDashboard dash = FtcDashboard.getInstance();
    Telemetry t2 = dash.getTelemetry();
    @Override
    public void init() {
        arm = hardwareMap.get(DcMotor.class,"pivot");
        //telemetry.addData("enc", arm.getCurrentPosition());
    }

    @Override
    public void loop() {
        curPos = arm.getCurrentPosition();
        eCur = target - curPos;
        if (first){
            ePrev = eCur;
            first = false;
        }
        P = eCur * kP;
        eDev = eCur - ePrev;
        D = kD * eDev;
        ePrev = eCur;
        if (Math.abs(P) >= iRange){
            eInt = 0;
        }
        else{
            eInt += eCur;
        }

        if (Math.abs(eInt) * kI >= iMax){
            eInt = eInt > 0 ? iMax / kI : -iMax / kI;
        }

        if (( eCur > 0 && eInt < 0 )|| (eCur < 0 && eInt > 0)){
            eInt = 0;
        }

        I = eInt * kI;

        arm.setPower(P + I + D);

        if (gamepad1.a){
            target = armMax / 2;
        }
        else if(gamepad1.b){
            target = armMax;
        }
        telemetry.addData("enc", curPos);
        t2.addData("enc", curPos);
    }
}
