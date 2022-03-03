// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.util.ActuatorMap;

public class DriveTrain extends SubsystemBase {
  
  TalonSRX rMaster = new TalonSRX(ActuatorMap.rightMaster);
  TalonSRX rSlave1 = new TalonSRX(ActuatorMap.rightSlave1);
  TalonSRX rSlave2 = new TalonSRX(ActuatorMap.rightSlave2);

  
  public DriveTrain() {
  }

  public void rDrive(double power) {
    System.out.println("test");
    rMaster.setInverted(true);
    rSlave1.follow(rMaster);
    rSlave2.follow(rMaster);
    rMaster.set(ControlMode.PercentOutput, power);
  }

}
