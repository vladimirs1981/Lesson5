package exercises;

public class Smurf {

	private String name;

	Smurf(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name + " Smurf.";
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	public String getHatColor() {

		if (name == "Papa") {
			return name + " Smurf wears a red hat.";
		} else {
			return name + " Smurf wears a white hat.";
		}

	}

	public String isGirlOrBoy() {
		if (name == "Smurfette") {
			return name + " is a girl.";
		} else {
			return name + " is a boy.";
		}

	}

}
