package frc.robot.subsystems;

import static frc.robot.Constants.*;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInLayouts;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardLayout;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class Drivetrain extends SubsystemBase {

  private ShuffleboardTab tab;

  public Drivetrain(ShuffleboardTab tab) {

    configureShuffleboardData();
  }

  public void applyBoostMultiplier(double multiplier) {
  }


  private void configureShuffleboardData() {
    ShuffleboardLayout layout = tab.getLayout("Encoder Vals", BuiltInLayouts.kGrid).withPosition(9, 0);
    layout.add(this);
    //layout.addNumber("Front Left Encoder Pos", () -> getFrontLeftEncoderPosition());

  }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    //feed();
  }

//setSelectedSensorPosition();
  public void resetEncoderPositions() {
    
  }

  //drive commands

  //MathUtil.applyDeadband(xSpeed, SPEED_DEADBAND);
  //MathUtil.applyDeadband(rotate, ROTATION_DEADBAND);

}