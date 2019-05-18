package optional;

public class TeaParty {

	private String name;

	private boolean isWoman;

	private boolean wasKnighted;

	public TeaParty() {

		this.name = name;
		this.isWoman = isWoman;
		this.wasKnighted = wasKnighted;

	}

	public String welcome(String name, boolean isWoman, boolean wasKnighted) {

		if (isWoman == true) {
			return "Hello Ms. " + name;
		} else if (wasKnighted == true) {
			return "Hello Sir " + name;
		} else {
			return "Hello Mr. " + name;
		}
	}

}
