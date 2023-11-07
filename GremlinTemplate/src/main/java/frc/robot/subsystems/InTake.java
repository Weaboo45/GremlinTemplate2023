package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import static frc.robot.Constants.*;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInLayouts;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardLayout;

public class InTake extends SubsystemBase{
  private ShuffleboardTab tab;

  public InTake (ShuffleboardTab tab){
        
    configureShuffleboardData();
  }
    
  private void configureShuffleboardData() {
    //ShuffleboardLayout layout = tab.getLayout("Encoder Vals", BuiltInLayouts.kGrid).withPosition(9, 0);
    
    //layout.addNumber("Top Intake Encoder Pos", () -> getTopIntakeEncoderPosition());
  }
    
   @Override
  public void periodic() {
    // This method will be called once per scheduler run  
  }

  //setSelectedSensorPosition();
  //resetEncoderPositions()
    
    
  //intake commands set();
     
}

