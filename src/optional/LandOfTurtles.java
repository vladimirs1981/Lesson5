package optional;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		frame.add(panel);
		panel.setBackgroundImage(galapagosIslands);

		frame.setSize(600, 400);
		panel.setSize(600, 400);
		Turtle leonardo = new Turtle();
		leonardo.setX(300);
		leonardo.setY(150);
		panel.addTurtle(leonardo);

		Random r = new Random();

		for (int i = 0; i < 50; i++) {

			Turtle toucheturtle = new Turtle();
			toucheturtle.setX(r.nextInt(600)+300);
			toucheturtle.setY(r.nextInt(400)+150);
			panel.addTurtle(toucheturtle);

		}

	}

}

// 7. Put 50 Turtles on the beach
