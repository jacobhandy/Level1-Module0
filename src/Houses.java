import org.jointheleague.graphical.robot.Robot;

public class Houses {
static Robot rob = new Robot();
public static int r;
public static int g;
public static int b;
public static int height;
	//refer to the image on bit.ly/l1recipes under module 0 under houses
	public static void main (String[] args) {
	rob.setSpeed(100);
		//pink house
	
	DrawHouse(225, 0, 225, 40);
	DrawGrass();
	//brown house
	
	DrawFlatHouse(210, 105, 30, 100);
	DrawGrass();
	//dark blue house
		rob.turn(-90);
	DrawHouse(0, 0, 210, 20);
	DrawGrass();
	//dark magenta house
	DrawFlatHouse(139, 0, 139, 50);
	DrawGrass();
	//light green house
	rob.turn(-90);
	DrawHouse(0,225,0, 30);
	DrawGrass();
	// teal house
	
	DrawFlatHouse(0,225, 225,60);
	}
public static void DrawHouse(int r, int g, int b, int height) {
	rob.penDown();
	rob.hide();
	rob.setPenColor(r,g,b);
	rob.move(height);
	rob.turn(45);
	rob.move(20);
	rob.turn(90);
	rob.move(20);
	rob.turn(45);
	rob.move(height);
}
public static void DrawGrass() {
	rob.turn(-90);
	rob.setPenColor(0,210,0);
	rob.move(10);
	
}
public static void DrawFlatHouse(int R, int G, int B, int Height) {
	rob.turn(-90);
	rob.setPenColor(R,G,B);
	rob.move(Height);
	rob.turn(90);
	rob.move(20);
	rob.turn(90);
	rob.move(Height);
}
}
