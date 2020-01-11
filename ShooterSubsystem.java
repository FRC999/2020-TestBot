package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.*;
import frc.robot.RobotMap;


public class ShooterSubsystem extends SubsystemBase {


public PWMTalonSRX shooterMotor1 = new PWMTalonSRX(RobotMap.kShooterMotorID1);
public PWMTalonSRX shooterMotor2 = new PWMTalonSRX(RobotMap.kShooterMotorID2);
public PWMTalonSRX panMotor = new PWMTalonSRX(RobotMap.panMotorID);
public PWMTalonSRX tiltMotor = new PWMTalonSRX(RobotMap.tiltMotorID);

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void shoot(){
  }

  public void pan(){

  }

  public void tilt(){

  }

}
