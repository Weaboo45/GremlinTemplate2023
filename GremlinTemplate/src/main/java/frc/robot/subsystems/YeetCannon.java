package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import static frc.robot.Constants.*;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInLayouts;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardLayout;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class YeetCannon extends SubsystemBase{
    
    private ShuffleboardTab tab;


    public YeetCannon(ShuffleboardTab tab){
        //motor controllers
        //follow();
        //setInverted();
        
        this.tab = tab;
        configureShuffleboardData();
    }

    private void configureShuffleboardData() {
    //ShuffleboardLayout layout = tab.getLayout("Encoder Vals", BuiltInLayouts.kGrid).withPosition(9, 0);

    //layout.addNumber("Right Cannon Encoder Pos", () -> getRightCannonEncoderPosition());
    
    }

    @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  //setSelectedSensorPosition();
  //resetEncoderPositions()

  //cannon command set()
  
}
