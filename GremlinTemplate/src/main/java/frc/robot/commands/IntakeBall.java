package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import java.util.function.Supplier;
import frc.robot.subsystems.InTake;

public class IntakeBall extends CommandBase{
    //subsystem call
    //vars
    //any input needs Supplier<type>
    //type is boolean, int, or double

    public  IntakeBall(){
        //addRequirements(subsytem);
        //this.
    }

    @Override
    public void initialize(){
        //give 2 vars starting vals
        //hint double vals
    }

    @Override
    public void execute(){
        //2 selection statements needed w/ subsytem commands

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
