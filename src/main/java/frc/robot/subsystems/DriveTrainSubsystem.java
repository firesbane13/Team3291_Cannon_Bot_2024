// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrainSubsystem extends SubsystemBase {
  /** Creates a new DriveTrainSubsystem. */
  public DriveTrainSubsystem() {
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  /**
   * Drive the robot using the left and right axis values.
   *
   * @param leftAxis The value of the left axis.
   * @param rightAxis The value of the right axis.
   */
  public void drive(double leftAxis, double rightAxis) {
    // Drive the robot
  }
}
