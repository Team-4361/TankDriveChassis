package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.RobotContainer;

public class MotorMovement extends CommandBase{
    @Override
    public void initialize (){
        addRequirements(Robot.motorControll);
    }
    @Override
    public void execute (){
        Robot.motorControll.setSpeed(RobotContainer.leftStick.getY(), RobotContainer.rightStick.getY());
    }
    @Override
    public void end(boolean interrupted){
        Robot.motorControll.setSpeed(0, 0);
    }
    @Override
    public boolean isFinished(){
        return false;
    }
}
