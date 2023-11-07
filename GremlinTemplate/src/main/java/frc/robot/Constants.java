/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    // Amp limits
    public static int PEAK_LIMIT = 40;
    public static int ENABLE_LIMIT = 30;

    // MEASUREMENTS
        // Drivetrain measurements
        public static double CENTER_TO_WHEEL_X = 21/2/39.37; // 21 in. to m
        public static double CENTER_TO_WHEEL_Y = 19/2/39.37; // 19 in. to m
        public static double COUNTS_PER_REVOLUTION_MAG = 4096;
        public static double WHEEL_DIAMETER = 6;
        public static double DISTANCE_PER_PULSE = ((Math.PI * WHEEL_DIAMETER) / COUNTS_PER_REVOLUTION_MAG) / 39.37;

    // MOTOR ID PORTS
        // Drivetrain motor ID ports
        public static int FRONT_LEFT_TALON_ID = 1;
        public static int BACK_LEFT_TALON_ID = 4;
        public static int FRONT_RIGHT_TALON_ID = 3;
        public static int BACK_RIGHT_TALON_ID = 2;

        //YeetCannon motor ID ports
        public static int RIGHT_CANNON_ID = 7;
        public static int LEFT_CANNON_ID = 5;

        //Intake Motor ID ports
        public static int TOP_INTAKE_MOTOR_ID = 11;
        public static int LOWER_INTAKE_MOTOR_ID = 12;

    // Drivetrain multipliers
    public static double ROTATION_DEADBAND = .15;   //.25
    public static double STRAFING_DEADBAND = .15;  //.75
    public static double SPEED_DEADBAND = .15; //.3
    public static double BOOST_MULTIPLIER = .65;

    // Drivetrain logic
    public static boolean IS_TANKDRIVE_SQUARED = false;
    public static boolean DOES_CHEESYDRIVE_PIVOT = false;
    public static boolean IS_ARCADEDRIVE_SQUARED = true;

    // Joystick buttons
    public static int INTAKE_GRAB_BUTTON = 1;
    public static int INTAKE_LIFT_BUTTON = 2;

}