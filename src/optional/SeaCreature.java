package optional;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SeaCreature {

	public static void main(String[] args) {

		SeaCreature spong1 = new SeaCreature("Spongebob");
		spong1.eat();
		spong1.laugh();

		SeaCreature spong2 = new SeaCreature("Patrick");
		System.out.println(spong2.getName());
		spong2.eat();
		spong2.laugh();

		SeaCreature spong3 = new SeaCreature("Squidward");
		System.out.println(spong3.getName());
		spong3.eat();
		spong3.laugh();
	}

	private String name;

	SeaCreature(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name;
	}

	public void eat() {
		System.out.println(name + " is eating krabby patties");
	}

	public void laugh() {
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File("sounds/" + this.name + ".wav").toURI().toURL());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
