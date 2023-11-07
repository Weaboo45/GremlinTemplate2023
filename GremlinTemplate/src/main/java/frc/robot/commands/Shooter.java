package frc.robot.commands;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.YeetCannon;

public class Shooter extends CommandBase{
    //subsystem call
    //vars
    //any input needs Supplier<type>
    //type is boolean, int, or double

    public Shooter(){
        //addRequirements(subsystem);
        //this.
    }

    @Override
    public void initialize(){
        //give var double starting val
    }

    @Override
    public void execute(){
        //selection statement needed w/ subsytem commands
    }

    @Override
    public void end(boolean interrupted){
        //end the subsytem commands (set inputs to 0)
    }

    @Override
    public boolean isFinished(){
        return false;
    }
}
