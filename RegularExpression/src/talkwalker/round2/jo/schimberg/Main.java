package talkwalker.round2.jo.schimberg;

public class Main {

	public static void main(String[] args) {
		Regex regex = Regex.getInstance();
		//System.out.println(regex.matchesPattern());
		//regex.play();
		SuperClass superC = new ChildClass();
		superC.test("test");

	}

}
