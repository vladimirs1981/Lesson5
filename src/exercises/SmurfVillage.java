package exercises;

public class SmurfVillage {

	public static void main(String[] args) {

		Smurf smurf1 = new Smurf("Handy");

		smurf1.eat();
		System.out.println(smurf1.getName());

		Smurf smurf2 = new Smurf("Papa");
		System.out.println(smurf2.getName());
		System.out.println(smurf2.getHatColor());
		System.out.println(smurf2.isGirlOrBoy());

		Smurf smurf3 = new Smurf("Smurfette");
		System.out.println(smurf3.getName());
		System.out.println(smurf3.getHatColor());
		System.out.println(smurf3.isGirlOrBoy());

	}

}
