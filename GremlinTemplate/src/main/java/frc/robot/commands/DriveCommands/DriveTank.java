/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.DriveCommands;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

public class DriveTank extends CommandBase {
  //subsystem call
    //vars
    //any input needs Supplier<type>
    //type is boolean, int, or double

    public DriveTank(){
      //addRequirements(subsystem);
      //this.
  }

  // Called when the command is initially scheduled.
@Override
public void initialize() {
  //leave empty
}

@Override
public void execute() {
  //set local vars to inputs
  //get();
  
  //call subsystem command
  
}

// Called once the command ends or is interrupted.
@Override
public void end(boolean interrupted) {
  //end subsytem command (set inputs to 0)
}

// Returns true when the command should end.
@Override
public boolean isFinished() {
  return false;
}
}
