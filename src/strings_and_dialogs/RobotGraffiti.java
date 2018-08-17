package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot StanL=new Robot();
	StanL.miniaturize();
	StanL.setSpeed(500);
	StanL.penDown();
	StanL.move(50);
	StanL.setAngle(0);
	StanL.turn(145);
	StanL.move(55);
	StanL.setAngle(0);
	StanL.move(50);
}
}
