package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	

	//2. create an array of 5 robots.
Robot[]  r=new Robot[5];
	//3. use a for loop to initialize the robots.
for (int i = 0; i < r.length; i++) {
	r[i]=new Robot();
r[i].setY(800);
r[i].setX((i*100)+50);

}
		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
for (int i = 1; i >0; i++) {
	

for (int j = 0; j < r.length; j++) {
	Random ran=new Random();
	r[j].setY(r[j].getY()-ran.nextInt(50));
	if (r[j].getY()<=0) {
		System.out.println("Robot "+j+" is the winner");
	System.exit(0);
	}
}
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}

