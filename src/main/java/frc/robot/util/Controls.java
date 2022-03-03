package frc.robot.util;

import edu.wpi.first.wpilibj.XboxController;

public class Controls {
    private static XboxController controller = new XboxController(ActuatorMap.controller);

    public static double getrightY() {
        return controller.getRightY();
    }

    public static double getleftY() {
        return controller.getLeftY();
    }


}

