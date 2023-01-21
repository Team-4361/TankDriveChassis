package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class MotorSubsystem extends SubsystemBase {
    private WPI_TalonSRX frontLeft, frontRight, backLeft, backRight;
    private int yaroStillBad;
    public MotorSubsystem (){
        frontLeft = new WPI_TalonSRX(1);
        frontRight = new WPI_TalonSRX(2);
        backLeft = new WPI_TalonSRX(3);
        backRight = new WPI_TalonSRX(4);
    }
    public void setSpeed (double leftSpeed, double rightSpeed) {
        frontLeft.set(leftSpeed);
        backLeft.set(leftSpeed);
        frontRight.set(rightSpeed);
        backRight.set(rightSpeed);
    }
    
}
