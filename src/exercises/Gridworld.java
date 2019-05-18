package exercises;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

/*
 * Use the Gridworld Reference document in the "doc" directory to complete the following tasks;
 * 
 * 1. Figure out how to get the World to show.
 * 2. Figure out how to add a Bug to the world (clue: you will need the Bug and Location objects)
 * 3. Add another bug at a random location in the world.
 * 4. Change the color of that bug to blue.
 * 5. Make the bug face to the right.
 * 6. Add flowers to the left and right of the bug.
 * 7. Fill the whole world with flowers!
*/

public class Gridworld {

	public static void main(String[] args) {

		World<Actor> gridland = new World<Actor>();
		gridland.show();
		Bug bea = new Bug();
		Location loc = new Location(0, 0);
		gridland.add(loc, bea);

		Random r = new Random();
		int a = r.nextInt(9) + 1;
		int b = r.nextInt(9) + 1;
		Location loc1 = new Location(a, b);
		Bug bea1 = new Bug();
		gridland.add(loc1, bea1);
		Color newColor = null;
		bea1.setColor(newColor.blue);
		bea1.turn();
		bea1.turn();

		Flower cvet = new Flower();
		Location loc2 = new Location(a, b - 1);
		Location loc3 = new Location(a, b + 1);
		gridland.add(loc2, cvet);
		gridland.add(loc3, cvet);

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {

				Location loc4 = new Location(i, j);
				gridland.add(loc4, cvet);
			}

		}

	}
}
